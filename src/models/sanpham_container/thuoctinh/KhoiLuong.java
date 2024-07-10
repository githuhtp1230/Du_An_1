package models.sanpham_container.thuoctinh;

public class KhoiLuong {
    private String maKhoiLuong;
    private int khoiLuong;
    private boolean trangThai;

    public KhoiLuong(String maKhoiLuong, int khoiLuong, boolean trangThai) {
        this.maKhoiLuong = maKhoiLuong;
        this.khoiLuong = khoiLuong;
        this.trangThai = trangThai;
    }

    public String getMaKhoiLuong() {
        return maKhoiLuong;
    }

    public void setMaKhoiLuong(String maKhoiLuong) {
        this.maKhoiLuong = maKhoiLuong;
    }

    public int getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(int khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

}
