import java.util.Scanner;
import java.time.Year;

public class Bai1_Tuan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- BÀI 1 (TUẦN 4): Kiểm tra tính hợp lệ của sách ---");

        System.out.print("Nhập năm xuất bản: ");
        int namXuatBan = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập đơn giá: ");
        double donGia = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập số lượng: ");
        int soLuong = Integer.parseInt(scanner.nextLine());

        // Lấy năm hiện tại tự động
        int namHienTai = Year.now().getValue();

        // Sử dụng câu lệnh điều kiện if-else để kiểm tra
        boolean isValid = true;

        if (namXuatBan < 1000 || namXuatBan > namHienTai) {
            System.out.println("- Lỗi: Năm xuất bản không hợp lệ (phải từ 1000 đến " + namHienTai + ")!");
            isValid = false;
        }

        if (donGia <= 0) {
            System.out.println("- Lỗi: Đơn giá phải lớn hơn 0!");
            isValid = false;
        }

        if (soLuong < 0) {
            System.out.println("- Lỗi: Số lượng không được nhỏ hơn 0!");
            isValid = false;
        }

        if (isValid) {
            System.out.println("=> Thông tin sách hoàn toàn hợp lệ!");
        } else {
            System.out.println("=> Dữ liệu sách không hợp lệ, vui lòng kiểm tra lại!");
        }

        scanner.close();
    }
}