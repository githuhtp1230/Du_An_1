package models.sanpham_container.thuoctinh;

public class XuatXu {
    private String maXuatXu, tenNuoc;
    private boolean trangThai;

    public XuatXu(String maXuatXu, String tenNuoc, boolean trangThai) {
        this.maXuatXu = maXuatXu;
        this.tenNuoc = tenNuoc;
        this.trangThai = trangThai;
    }

    public XuatXu() {
    }

    public String getMaXuatXu() {
        return maXuatXu;
    }

    public void setMaXuatXu(String maXuatXu) {
        this.maXuatXu = maXuatXu;
    }

    public String getTenNuoc() {
        return tenNuoc;
    }

    public void setTenNuoc(String tenNuoc) {
        this.tenNuoc = tenNuoc;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

}
