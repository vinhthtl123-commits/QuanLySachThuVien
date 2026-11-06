package TH_Tuan5;

import java.util.Scanner;

public class Bai3_Tuan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== MENU THỰC HÀNH TUẦN 5 =====");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm sách mới");
            System.out.println("3. Thoát chương trình");
            System.out.print("Chọn chức năng (1-3): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Chức năng đang phát triển...");
                    break;
                case 2:
                    System.out.println("Đã chọn thêm sách mới...");
                    break;
                case 3:
                    System.out.println("Đã thoát chương trình. Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
