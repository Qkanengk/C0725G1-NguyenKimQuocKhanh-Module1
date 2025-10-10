package bai_tap_them.quan_ly_furama.control;

import bai_tap_them.quan_ly_furama.repository.IVoucherRepository;
import bai_tap_them.quan_ly_furama.repository.VoucherRepository;
import bai_tap_them.quan_ly_furama.service.IPromotionService;
import bai_tap_them.quan_ly_furama.service.PromotionService;
import bai_tap_them.quan_ly_furama.view.PromotionView;

import java.util.Scanner;

public class PromotionController {
    private static IPromotionService promotionService = new PromotionService();
    private static IVoucherRepository voucherRepository = new VoucherRepository();

    static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice > 3) {
                    System.out.println("INPUT AGAIN");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                continue;
            }
            switch (choice) {
                case 1:
                    int year = PromotionView.getYear();
                    System.out.println(promotionService.findAllByYear(year));
                    break;
                case 2:
                    System.out.println(voucherRepository.findAllByMonth());
                    break;

            }
        } while (choice != 3);
    }
}
