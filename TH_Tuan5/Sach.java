package TH_Tuan5;

public class Sach {
    private String maSach;
    private String tenSach;
    private int soLuong;
    private double gia;

    public Sach(String maSach, String tenSach, int soLuong, double gia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.soLuong = soLuong;
        this.gia = gia;
    }

    public String getMaSach() { return maSach; }
    public String getTenSach() { return tenSach; }
    public int getSoLuong() { return soLuong; }
    public double getGia() { return gia; }
    public double thanhTien() { return soLuong * gia; }

    @Override
    public String toString() {
        return "Mã: " + maSach + " | Tên: " + tenSach + " | Số lượng: " + soLuong + " | Giá: " + gia + " | Thành tiền: " + thanhTien();
    }
}