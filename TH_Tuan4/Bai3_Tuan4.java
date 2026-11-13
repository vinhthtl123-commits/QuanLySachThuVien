import java.util.Scanner;

public class Bai3_Tuan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- BÀI 3 (TUẦN 4): Phân loại tồn kho ---");

        System.out.print("Nhập số lượng tồn kho: ");
        int soLuong = Integer.parseInt(scanner.nextLine());

        // Phân loại tồn kho dựa trên yêu cầu
        if (soLuong == 0) {
            System.out.println("=> Hết sách");
        } else if (soLuong >= 1 && soLuong <= 5) {
            System.out.println("=> Sắp hết");
        } else if (soLuong >= 6 && soLuong <= 20) {
            System.out.println("=> Còn ít");
        } else {
            System.out.println("=> Còn nhiều");
        }

        scanner.close();
    }
}