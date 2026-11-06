package TH_Tuan6;

import java.util.Scanner;
import java.util.ArrayList;
public class Bai3_Tuan6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Sach> danhSach = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n===== MENU TUẦN 6 (CHỈNH SỬA TỪ BÀI 3 TUẦN 5) =====");
            System.out.println("1. Thêm sách mới");
            System.out.println("2. Hiển thị danh sách sách");
            System.out.println("3. Thoát chương trình");
            System.out.print("Chọn chức năng (1-3): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Mã sách: "); String ma = scanner.nextLine();
                    System.out.print("Tên sách: "); String ten = scanner.nextLine();
                    System.out.print("Số lượng: "); int sl = scanner.nextInt();
                    System.out.print("Giá: "); double gia = scanner.nextDouble();
                    scanner.nextLine();
                    danhSach.add(new Sach(ma, ten, sl, gia));
                    System.out.println("Thêm sách thành công!");
                    break;
                case 2:
                    System.out.println("\n--- DANH SÁCH SÁCH ---");
                    if (danhSach.isEmpty()) {
                        System.out.println("Danh sách trống!");
                    } else {
                        for (Sach s : danhSach) {
                            System.out.println(s);
                        }
                    }
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
