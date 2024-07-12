package models.sanpham_container.thuoctinh;

public class XuatXu {
    private String idXuatXu, tenNuoc;
    private boolean trangThai;

    public XuatXu(String idXuatXu, String tenNuoc, boolean trangThai) {
        this.idXuatXu = idXuatXu;
        this.tenNuoc = tenNuoc;
        this.trangThai = trangThai;
    }

    public XuatXu() {
    }

    public String getIdXuatXu() {
        return idXuatXu;
    }

    public void setIdXuatXu(String idXuatXu) {
        this.idXuatXu = idXuatXu;
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
