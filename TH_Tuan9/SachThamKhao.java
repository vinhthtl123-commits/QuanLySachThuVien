package TH_Tuan9;

public class SachThamKhao extends Sach {
    private double thue;

    public SachThamKhao() {
    }

    public SachThamKhao(String maSach, String ngayNhap, double donGia, int soLuong,
                        String nhaXuatBan, double thue) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        setThue(thue);
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        if (thue >= 0) {
            this.thue = thue;
        } else {
            System.out.println("Thuế không hợp lệ, gán về 0.");
            this.thue = 0;
        }
    }

    @Override
    public double tinhThanhTien() {
        return getSoLuong() * getDonGia() + thue;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.printf(" | Thuế: %.2f | Thành tiền: %.2f%n", thue, tinhThanhTien());
    }
}