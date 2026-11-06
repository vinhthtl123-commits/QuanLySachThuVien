package TH_Tuan5;

import java.util.Scanner;

public class Bai1_Tuan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sách n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        Sach[] danhSach = new Sach[n];
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
        }
        
        System.out.println("\nĐã nhập thành công " + n + " cuốn sách bằng vòng lặp!");
        scanner.close();
    }
}
