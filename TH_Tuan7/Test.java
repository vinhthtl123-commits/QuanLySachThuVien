package TH_Tuan7;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Vẫn giữ nguyên ý nghĩa cốt lõi: Quản lý danh sách bằng ArrayList từ Tuần 7
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        System.out.println("=== QUẢN LÝ SÁCH - TÍCH HỢP TUẦN 7 & TUẦN 8 ===");
        System.out.print("Nhập số lượng sách cần thêm: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin cuốn sách thứ " + (i + 1) + ":");
            System.out.print("Nhập mã sách: ");
            String ma = scanner.nextLine();
            System.out.print("Nhập tiêu đề: ");
            String tieuDe = scanner.nextLine();
            System.out.print("Nhập tác giả: ");
            String tacGia = scanner.nextLine();
            System.out.print("Nhập năm xuất bản: ");
            int namXB = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập số lượng: ");
            int soLuong = Integer.parseInt(scanner.nextLine());

            // Sử dụng constructor có tham số (Yêu cầu 4 của Tuần 8)
            // Dữ liệu truyền vào sẽ tự động đi qua bộ lọc kiểm tra (setter) của Tuần 8
            Sach sach = new Sach(ma, tieuDe, tacGia, namXB, soLuong);
            
            // Hoặc nếu bạn dùng setter riêng lẻ sau khi tạo đối tượng (nếu cần):
            // Sach sach = new Sach();
            // sach.setMaSach(ma);
            // sach.setTieuDe(tieuDe);
            // ...

            danhSachSach.add(sach);
        }

        // Hiển thị danh sách (kế thừa từ Tuần 7)
        System.out.println("\n--- DANH SÁCH SÁCH TRONG THƯ VIỆN ---");
        for (Sach s : danhSachSach) {
            s.hienThiThongTin();
            
            // Ví dụ nếu bạn muốn lấy riêng một thuộc tính nào đó ra để in:
            // System.out.println("-> Tên sách vừa lấy qua getter: " + s.getTieuDe());
        }

        scanner.close();
    }
}