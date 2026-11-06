package TH_Tuan6;

import java.util.Scanner;
import java.util.ArrayList;
public class Bai4_Tuan6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Sach> danhSachSach = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n========== MENU HOÀN CHỈNH 8 CHỨC NĂNG (TUẦN 6) =========s=");
            System.out.println("1. Thêm sách");
            System.out.println("2. Hiển thị sách");
            System.out.println("3. Tìm sách theo mã");
            System.out.println("4. Xóa sách theo mã");
            System.out.println("5. Sửa thông tin sách");
            System.out.println("6. Tính tổng số lượng");
            System.out.println("7. Tính tổng giá trị");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng (1-8): ");
            
            while (!scanner.hasNextInt()) {
                System.out.print("Vui lòng nhập số hợp lệ: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Mã sách: "); String ma = scanner.nextLine();
                    System.out.print("Tên sách: "); String ten = scanner.nextLine();
                    System.out.print("Số lượng: "); int sl = scanner.nextInt();
                    System.out.print("Giá sách: "); double gia = scanner.nextDouble();
                    scanner.nextLine();
                    danhSachSach.add(new Sach(ma, ten, sl, gia));
                    System.out.println("Thêm sách thành công!");
                    break;
                case 2:
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Thư viện chưa có sách nào!");
                    } else {
                        System.out.println("\n--- DANH SÁCH SÁCH ---");
                        for (Sach s : danhSachSach) {
                            System.out.println(s);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhập mã sách cần tìm: ");
                    String maTim = scanner.nextLine();
                    boolean found = false;
                    for (Sach s : danhSachSach) {
                        if (s.getMaSach().equalsIgnoreCase(maTim)) {
                            System.out.println("Đã tìm thấy: " + s);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Không tìm thấy sách có mã: " + maTim);
                    break;
                case 4:
                    System.out.print("Nhập mã sách cần xóa: ");
                    String maXoa = scanner.nextLine();
                    boolean removed = danhSachSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maXoa));
                    if (removed) System.out.println("Đã xóa thành công sách mã: " + maXoa);
                    else System.out.println("Không tìm thấy mã sách để xóa!");
                    break;
                case 5:
                    System.out.print("Nhập mã sách cần sửa: ");
                    String maSua = scanner.nextLine();
                    boolean edited = false;
                    for (Sach s : danhSachSach) {
                        if (s.getMaSach().equalsIgnoreCase(maSua)) {
                            System.out.print("Tên mới: "); s.setTenSach(scanner.nextLine());
                            System.out.print("Số lượng mới: "); s.setSoLuong(scanner.nextInt());
                            System.out.print("Giá mới: "); s.setGia(scanner.nextDouble());
                            scanner.nextLine();
                            System.out.println("Cập nhật thông tin thành công!");
                            edited = true;
                            break;
                        }
                    }
                    if (!edited) System.out.println("Không tìm thấy mã sách cần sửa!");
                    break;
                case 6:
                    int tongSL = 0;
                    for (Sach s : danhSachSach) {
                        tongSL += s.getSoLuong();
                    }
                    System.out.println("Tổng số lượng sách: " + tongSL);
                    break;
                case 7:
                    double tongGT = 0;
                    for (Sach s : danhSachSach) {
                        tongGT += s.thanhTien();
                    }
                    System.out.println("Tổng giá trị sách: " + tongGT);
                    break;
                case 8:
                    System.out.println("Thoát chương trình. Hẹn gặp lại!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 8);

        scanner.close();
    }
}
