import java.util.Scanner;

public class Bai2_Tuan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- BÀI 2 (TUẦN 4): Phân loại giá sách ---");

        System.out.print("Nhập đơn giá sách: ");
        double donGia = Double.parseDouble(scanner.nextLine());

        // Phân loại giá sử dụng if - else if - else
        if (donGia < 50000) {
            System.out.println("=> Sách giá thấp");
        } else if (donGia >= 50000 && donGia <= 100000) {
            System.out.println("=> Sách giá trung bình");
        } else if (donGia > 100000 && donGia <= 200000) {
            System.out.println("=> Sách giá cao");
        } else {
            System.out.println("=> Sách giá đặc biệt");
        }

        scanner.close();
    }
}