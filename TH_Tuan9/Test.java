package TH_Tuan9;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<SachGiaoKhoa> dsSGK = new ArrayList<>();
        ArrayList<SachThamKhao> dsSTK = new ArrayList<>();

        System.out.print("Nhập số lượng sách giáo khoa: ");
        int nSGK = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < nSGK; i++) {
            System.out.println("\n--- Nhập sách giáo khoa thứ " + (i + 1) + " ---");
            System.out.print("Mã sách: ");
            String ma = scanner.nextLine();
            System.out.print("Ngày nhập (dd/mm/yyyy): ");
            String ngayNhap = scanner.nextLine();
            System.out.print("Đơn giá: ");
            double donGia = Double.parseDouble(scanner.nextLine());
            System.out.print("Số lượng: ");
            int soLuong = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhà xuất bản: ");
            String nxb = scanner.nextLine();
            System.out.print("Tình trạng (mới / cũ): ");
            String tinhTrang = scanner.nextLine();

            dsSGK.add(new SachGiaoKhoa(ma, ngayNhap, donGia, soLuong, nxb, tinhTrang));
        }

        System.out.print("\nNhập số lượng sách tham khảo: ");
        int nSTK = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < nSTK; i++) {
            System.out.println("\n--- Nhập sách tham khảo thứ " + (i + 1) + " ---");
            System.out.print("Mã sách: ");
            String ma = scanner.nextLine();
            System.out.print("Ngày nhập (dd/mm/yyyy): ");
            String ngayNhap = scanner.nextLine();
            System.out.print("Đơn giá: ");
            double donGia = Double.parseDouble(scanner.nextLine());
            System.out.print("Số lượng: ");
            int soLuong = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhà xuất bản: ");
            String nxb = scanner.nextLine();
            System.out.print("Thuế: ");
            double thue = Double.parseDouble(scanner.nextLine());

            dsSTK.add(new SachThamKhao(ma, ngayNhap, donGia, soLuong, nxb, thue));
        }

        // Xuất danh sách
        System.out.println("\n=== DANH SÁCH SÁCH GIÁO KHOA ===");
        double tongTienSGK = 0;
        for (SachGiaoKhoa sgk : dsSGK) {
            sgk.hienThiThongTin();
            tongTienSGK += sgk.tinhThanhTien();
        }

        System.out.println("\n=== DANH SÁCH SÁCH THAM KHẢO ===");
        double tongTienSTK = 0;
        double tongDonGiaSTK = 0;
        for (SachThamKhao stk : dsSTK) {
            stk.hienThiThongTin();
            tongTienSTK += stk.tinhThanhTien();
            tongDonGiaSTK += stk.getDonGia();
        }

        // Tổng thành tiền từng loại
        System.out.println("\n--- TỔNG THÀNH TIỀN ---");
        System.out.printf("Tổng thành tiền Sách giáo khoa: %.2f%n", tongTienSGK);
        System.out.printf("Tổng thành tiền Sách tham khảo: %.2f%n", tongTienSTK);

        // Trung bình cộng đơn giá sách tham khảo
        if (!dsSTK.isEmpty()) {
            double tbDonGiaSTK = tongDonGiaSTK / dsSTK.size();
            System.out.printf("Trung bình cộng đơn giá Sách tham khảo: %.2f%n", tbDonGiaSTK);
        } else {
            System.out.println("Không có sách tham khảo để tính trung bình cộng đơn giá.");
        }

        // Xuất sách giáo khoa theo nhà xuất bản X
        System.out.print("\nNhập tên nhà xuất bản X cần tìm cho Sách giáo khoa: ");
        String nxbX = scanner.nextLine();
        System.out.println("=== SÁCH GIÁO KHOA CỦA NXB '" + nxbX + "' ===");
        boolean timThay = false;
        for (SachGiaoKhoa sgk : dsSGK) {
            if (sgk.getNhaXuatBan() != null && sgk.getNhaXuatBan().equalsIgnoreCase(nxbX.trim())) {
                sgk.hienThiThongTin();
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Không tìm thấy sách giáo khoa nào thuộc NXB " + nxbX);
        }

        scanner.close();
    }
}