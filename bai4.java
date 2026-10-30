import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- BÀI 4: Tính tổng tiền nhập ---");

        System.out.print("Nhập thành tiền: ");
        double thanhTien = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập phí vận chuyển: ");
        double phiVanChuyen = Double.parseDouble(scanner.nextLine());

        // Tổng tiền nhập = Thành tiền + Phí vận chuyển[cite: 1]
        double tongTienNhap = thanhTien + phiVanChuyen;

        System.out.println("> Tổng tiền nhập = " + tongTienNhap + " VNĐ[cite: 1]");
        
        scanner.close();
    }
}