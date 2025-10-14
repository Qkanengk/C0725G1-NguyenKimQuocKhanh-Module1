package bai_tap_them.quan_ly_do_dien_tu.controller;

import bai_tap_them.quan_ly_do_dien_tu.service.ComputerService;
import bai_tap_them.quan_ly_do_dien_tu.service.IComputerService;
import bai_tap_them.quan_ly_do_dien_tu.view.ComputerView;

import java.util.Scanner;

public class ComputerController {
    private static final Scanner scanner = new Scanner(System.in);
    private static IComputerService computerService = new ComputerService();

    public static IComputerService getComputerService() {
        return computerService;
    }

    public static void addComputer() {
        ComputerView.addComputer();
    }


}
