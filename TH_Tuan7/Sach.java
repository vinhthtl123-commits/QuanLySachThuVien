package TH_Tuan7;

import java.time.Year;

public class Sach {
    // 1. Khai báo các thuộc tính với từ khóa private (Yêu cầu 1 - Tuần 8)
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // 2. Constructor có tham số đầy đủ (Yêu cầu 4 - Tuần 8)
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        setNamXuatBan(namXuatBan); // Gọi setter để kiểm tra ràng buộc năm
        setSoLuong(soLuong);       // Gọi setter để kiểm tra ràng buộc số lượng
    }

    // 3. Các phương thức Getters và Setters (Yêu cầu 2 & 3 - Tuần 8)
    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }
    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }
    public void setNamXuatBan(int namXuatBan) {
        int currentYear = Year.now().getValue();
        // Đảm bảo năm xuất bản hợp lý (không lớn hơn năm hiện tại và > 0)
        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Lỗi: Năm xuất bản không hợp lệ! Đã tự động gán năm hiện tại.");
            this.namXuatBan = currentYear;
        }
    }

    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        // Đảm bảo số lượng không âm
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("Lỗi: Số lượng không được âm! Đã tự động gán bằng 0.");
            this.soLuong = 0;
        }
    }

    // 4. Phương thức hiển thị thông tin (từ Tuần 7)
    public void hienThiThongTin() {
        System.out.println("Mã sách: " + maSach + " | Tên sách: " + tieuDe + 
                           " | Tác giả: " + tacGia + " | Năm XB: " + namXuatBan + 
                           " | Số lượng: " + soLuong);
    }
}