import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Hỗ trợ hiển thị tiếng Việt trên console
        System.out.println("--- BÀI 1: Nhập và hiển thị thông tin sách ---");

        System.out.print("Nhập mã sách: ");
        String maSach = scanner.nextLine();

        System.out.print("Nhập tên sách: ");
        String tenSach = scanner.nextLine();

        System.out.print("Nhập tác giả: ");
        String tacGia = scanner.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        int namXuatBan = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập đơn giá: ");
        double donGia = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập số lượng: ");
        int soLuong = Integer.parseInt(scanner.nextLine());

        // Hiển thị lại thông tin
        System.out.println("\n[Thông tin sách đã nhập]");
        System.out.println("- Mã sách: " + maSach);
        System.out.println("- Tên sách: " + tenSach);
        System.out.println("- Tác giả: " + tacGia);
        System.out.println("- Năm xuất bản: " + namXuatBan);
        System.out.println("- Đơn giá: " + donGia);
        System.out.println("- Số lượng: " + soLuong);
        
        scanner.close();
    }
}