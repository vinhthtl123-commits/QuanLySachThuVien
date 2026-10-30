import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- BÀI 3: Tính phí vận chuyển ---");

        System.out.print("Nhập thành tiền: ");
        double thanhTien = Double.parseDouble(scanner.nextLine());

        // Phí vận chuyển = 5% giá trị sách (thành tiền)[cite: 1]
        double phiVanChuyen = thanhTien * 0.05;

        System.out.println("> Phí vận chuyển (5% Thành tiền) = " + phiVanChuyen + " VNĐ[cite: 1]");
        
        scanner.close();
    }
}