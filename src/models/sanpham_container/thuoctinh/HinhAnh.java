package models.sanpham_container.thuoctinh;

public class HinhAnh {
    private String idHinhAnh, urlHinhAnh;
    private boolean trangThai;

    public HinhAnh(String idHinhAnh, String urlHinhAnh, boolean trangThai) {
        this.idHinhAnh = idHinhAnh;
        this.urlHinhAnh = urlHinhAnh;
        this.trangThai = trangThai;
    }

    public String getIdHinhAnh() {
        return idHinhAnh;
    }

    public void setIdHinhAnh(String idHinhAnh) {
        this.idHinhAnh = idHinhAnh;
    }

    public String getTenHinhAnh() {
        return urlHinhAnh;
    }

    public void setTenHinhAnh(String urlHinhAnh) {
        this.urlHinhAnh = urlHinhAnh;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

}
