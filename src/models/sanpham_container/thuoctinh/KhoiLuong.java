package models.sanpham_container.thuoctinh;

public class KhoiLuong {
    private String idKhoiLuong;
    private String khoiLuong;
    private boolean trangThai;

    public KhoiLuong(String idKhoiLuong, String khoiLuong, boolean trangThai) {
        this.idKhoiLuong = idKhoiLuong;
        this.khoiLuong = khoiLuong;
        this.trangThai = trangThai;
    }

    public KhoiLuong() {
    }

    public String getIdKhoiLuong() {
        return idKhoiLuong;
    }

    public void setIdKhoiLuong(String idKhoiLuong) {
        this.idKhoiLuong = idKhoiLuong;
    }

    public String getTenKhoiLuong() {
        return khoiLuong;
    }

    public void setTenKhoiLuong(String khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

}
