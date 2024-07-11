package models.sanpham_container;

public class SanPhamChiTiet {
    private String idSPCT, idHang, idChatLieu, idKichThuoc, idMauSac, idDeGiay, idHinhAnh, idKhoiLuong, idXuatXu, idNSX,
            idCoGiay, idSanPham, idDotGiamGia, tenSPCT;
    private int soLuongTon, donGia;
    private boolean trangThai;

    public SanPhamChiTiet(String idSPCT, String idHang, String idChatLieu, String idKichThuoc, String idMauSac,
            String idDeGiay, String idHinhAnh, String idKhoiLuong, String idXuatXu, String idNSX, String idCoGiay,
            String idSanPham, String idDotGiamGia, String tenSPCT, int soLuongTon, int donGia, boolean trangThai) {
        this.idSPCT = idSPCT;
        this.idHang = idHang;
        this.idChatLieu = idChatLieu;
        this.idKichThuoc = idKichThuoc;
        this.idMauSac = idMauSac;
        this.idDeGiay = idDeGiay;
        this.idHinhAnh = idHinhAnh;
        this.idKhoiLuong = idKhoiLuong;
        this.idXuatXu = idXuatXu;
        this.idNSX = idNSX;
        this.idCoGiay = idCoGiay;
        this.idSanPham = idSanPham;
        this.idDotGiamGia = idDotGiamGia;
        this.tenSPCT = tenSPCT;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
        this.trangThai = trangThai;
    }

    public String getIdSPCT() {
        return idSPCT;
    }

    public void setIdSPCT(String idSPCT) {
        this.idSPCT = idSPCT;
    }

    public String getIdHang() {
        return idHang;
    }

    public void setIdHang(String idHang) {
        this.idHang = idHang;
    }

    public String getIdChatLieu() {
        return idChatLieu;
    }

    public void setIdChatLieu(String idChatLieu) {
        this.idChatLieu = idChatLieu;
    }

    public String getIdKichThuoc() {
        return idKichThuoc;
    }

    public void setIdKichThuoc(String idKichThuoc) {
        this.idKichThuoc = idKichThuoc;
    }

    public String getIdMauSac() {
        return idMauSac;
    }

    public void setIdMauSac(String idMauSac) {
        this.idMauSac = idMauSac;
    }

    public String getIdDeGiay() {
        return idDeGiay;
    }

    public void setIdDeGiay(String idDeGiay) {
        this.idDeGiay = idDeGiay;
    }

    public String getIdHinhAnh() {
        return idHinhAnh;
    }

    public void setIdHinhAnh(String idHinhAnh) {
        this.idHinhAnh = idHinhAnh;
    }

    public String getIdKhoiLuong() {
        return idKhoiLuong;
    }

    public void setIdKhoiLuong(String idKhoiLuong) {
        this.idKhoiLuong = idKhoiLuong;
    }

    public String getIdXuatXu() {
        return idXuatXu;
    }

    public void setIdXuatXu(String idXuatXu) {
        this.idXuatXu = idXuatXu;
    }

    public String getIdNSX() {
        return idNSX;
    }

    public void setIdNSX(String idNSX) {
        this.idNSX = idNSX;
    }

    public String getIdCoGiay() {
        return idCoGiay;
    }

    public void setIdCoGiay(String idCoGiay) {
        this.idCoGiay = idCoGiay;
    }

    public String getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getIdDotGiamGia() {
        return idDotGiamGia;
    }

    public void setIdDotGiamGia(String idDotGiamGia) {
        this.idDotGiamGia = idDotGiamGia;
    }

    public String getTenSPCT() {
        return tenSPCT;
    }

    public void setTenSPCT(String tenSPCT) {
        this.tenSPCT = tenSPCT;
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

}
