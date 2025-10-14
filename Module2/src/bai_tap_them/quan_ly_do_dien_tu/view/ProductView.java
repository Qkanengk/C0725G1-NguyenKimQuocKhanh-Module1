package bai_tap_them.quan_ly_do_dien_tu.view;

import bai_tap_them.quan_ly_do_dien_tu.controller.ComputerController;
import bai_tap_them.quan_ly_do_dien_tu.controller.PhoneController;

import java.util.Scanner;

public class ProductView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getId() {
        System.out.println("Nhập id của sản phẩm");
        return scanner.nextLine();
    }

    public static String getProductId() {
        System.out.println("Nhập mã của sản phẩm");
        return scanner.nextLine();
    }

    public static String getName() {
        System.out.println("Nhập tên của sản phẩm");
        return scanner.nextLine();
    }

    public static Double getPrice() {
        System.out.println("Nhập giá của sản phẩm");
        return Double.parseDouble(scanner.nextLine());
    }

    public static void showPhoneList() {

    }

    public static void removeProduct() {
        String productId = getProductId();
        if (PhoneController.getPhoneService().remove(productId)|| ComputerController.getComputerService().remove(productId)) {
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Xóa thất bại");
        }
    }

    public static void showListProduct() {
        PhoneView.showListPhone();
        ComputerView.showListComputer();
    }

    public static void findProduct(){
        String productName = getName();
        if(!PhoneController.getPhoneService().findByName(productName).isEmpty()){
            PhoneController.getPhoneService().findByName(productName).forEach(System.out::println);
        }else if(!ComputerController.getComputerService().findByName(productName).isEmpty()){
            ComputerController.getComputerService().findByName(productName).forEach(System.out::println);//viet gon cho lambda
        }else{
            System.out.println("Không tìm thấy sản phẩm");
        }
    }


}
