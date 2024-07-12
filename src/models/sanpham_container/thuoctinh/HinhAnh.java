package models.sanpham_container.thuoctinh;

public class HinhAnh {
    private String idHinhAnh, tenHinhAnh;
    private boolean trangThai;

    public HinhAnh(String idHinhAnh, String tenHinhAnh, boolean trangThai) {
        this.idHinhAnh = idHinhAnh;
        this.tenHinhAnh = tenHinhAnh;
        this.trangThai = trangThai;
    }

    public HinhAnh() {
    }

    public String getIdHinhAnh() {
        return idHinhAnh;
    }

    public void setIdHinhAnh(String idHinhAnh) {
        this.idHinhAnh = idHinhAnh;
    }

    public String getTenHinhAnh() {
        return tenHinhAnh;
    }

    public void setTenHinhAnh(String tenHinhAnh) {
        this.tenHinhAnh = tenHinhAnh;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

}
