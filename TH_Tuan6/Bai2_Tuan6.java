package TH_Tuan6;

import java.util.Scanner;
import java.util.ArrayList;
public class Bai2_Tuan6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Sach> danhSach = new ArrayList<>();
        
        System.out.print("Nhập số lượng sách n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin cuốn sách thứ " + (i + 1) + ":");
            System.out.print("Mã sách: ");
            String ma = scanner.nextLine();
            System.out.print("Tên sách: ");
            String ten = scanner.nextLine();
            System.out.print("Số lượng: ");
            int sl = scanner.nextInt();
            System.out.print("Giá sách: ");
            double gia = scanner.nextDouble();
            scanner.nextLine();
            
            danhSach.add(new Sach(ma, ten, sl, gia));
        }
        
        int tongSoLuong = 0;
        double tongGiaTri = 0;

        for (Sach s : danhSach) {
            tongSoLuong += s.getSoLuong();
            tongGiaTri += s.thanhTien();
        }
        
        System.out.println("\n--- KẾT QUẢ TÍNH TOÁN ---");
        System.out.println("Tổng số lượng sách: " + tongSoLuong);
        System.out.println("Tổng giá trị sách: " + tongGiaTri);
        scanner.close();
    }
}
