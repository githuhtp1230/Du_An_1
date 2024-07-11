package models.sanpham_container.thuoctinh;

public class NhaSanXuat {
    private String maNSX, tenNSX;
    private boolean trangThai;

    public NhaSanXuat(String maNSX, String tenNSX, boolean trangThai) {
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
        this.trangThai = trangThai;
    }

    public NhaSanXuat() {
    }

    public String getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

}
