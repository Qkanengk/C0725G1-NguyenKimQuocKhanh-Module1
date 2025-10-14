package bai_tap_them.quan_ly_do_dien_tu.view;

import bai_tap_them.quan_ly_do_dien_tu.controller.ComputerController;
import bai_tap_them.quan_ly_do_dien_tu.entity.Computer;

import java.util.Scanner;

public class ComputerView extends ProductView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getCPUType() {
        System.out.println("Nhập lọai CPU");
        return scanner.nextLine();
    }

    public static int getRam() {
        System.out.println("Nhập dung lượng RAM");
        return Integer.parseInt(scanner.nextLine());
    }

    public static Computer getComputer() {
        return new Computer(getId(), getProductId(), getName(), getPrice(), getCPUType(), getRam());
    }

    public static void addComputer() {
        if (ComputerController.getComputerService().add(getComputer())) {
            System.out.println("Thêm thành công");
        } else {
            System.out.println("Thêm thất bại");
        }
    }


    public static void showListComputer() {
        System.out.println("=====Computer=====");
        if (ComputerController.getComputerService().findAll().isEmpty()) {
            System.out.println("Danh sách rỗng");
        } else
            System.out.println(ComputerController.getComputerService().findAll());
    }
}
