package TH_Tuan5;

import java.util.Scanner;

public class Bai2_Tuan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sách n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        Sach[] danhSach = new Sach[n];
        int tongSoLuong = 0;
        double tongGiaTri = 0;

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
            
            danhSach[i] = new Sach(ma, ten, sl, gia);
            tongSoLuong += sl;
            tongGiaTri += (sl * gia);
        }
        
        System.out.println("\n--- KẾT QUẢ ---");
        System.out.println("Tổng số lượng sách: " + tongSoLuong);
        System.out.println("Tổng giá trị sách: " + tongGiaTri);
        scanner.close();
    }
}
