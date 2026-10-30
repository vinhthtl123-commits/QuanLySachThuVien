import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- BÀI 2: Tính thành tiền ---");

        System.out.print("Nhập đơn giá: ");
        double donGia = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập số lượng: ");
        int soLuong = Integer.parseInt(scanner.nextLine());

        // Tính thành tiền = đơn giá × số lượng[cite: 1]
        double thanhTien = donGia * soLuong;

        System.out.println("> Thành tiền (Đơn giá x Số lượng) = " + thanhTien + " VNĐ[cite: 1]");
        
        scanner.close();
    }
}