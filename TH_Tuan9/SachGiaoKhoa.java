package TH_Tuan9;

public class SachGiaoKhoa extends Sach {
    private String tinhTrang; // "mới" hoặc "cũ"

    public SachGiaoKhoa() {
    }

    public SachGiaoKhoa(String maSach, String ngayNhap, double donGia, int soLuong,
                        String nhaXuatBan, String tinhTrang) {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        this.tinhTrang = tinhTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public double tinhThanhTien() {
        if (tinhTrang != null && tinhTrang.trim().equalsIgnoreCase("cũ")) {
            return getSoLuong() * getDonGia() * 0.5;
        }
        return getSoLuong() * getDonGia();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.printf(" | Tình trạng: %s | Thành tiền: %.2f%n", tinhTrang, tinhThanhTien());
    }
}