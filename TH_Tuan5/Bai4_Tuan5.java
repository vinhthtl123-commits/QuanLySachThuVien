package TH_Tuan5;

import java.util.Scanner;

public class Bai4_Tuan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Dữ liệu mẫu để kiểm tra tìm kiếm
        Sach[] danhSach = {
            new Sach("S01", "Lap trinh Java", 5, 120.0),
            new Sach("S02", "Cau truc du lieu", 3, 150.0),
            new Sach("S03", "Co so du lieu", 4, 110.0)
        };

        System.out.print("Nhập mã sách cần tìm: ");
        String maTim = scanner.nextLine();
        boolean found = false;

        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maTim)) {
                System.out.println("Đã tìm thấy sách:");
                System.out.println(s);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sách có mã: " + maTim);
        }
        
        scanner.close();
    }
}
