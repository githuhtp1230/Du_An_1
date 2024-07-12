package models.sanpham_container.thuoctinh;

public class XuatXu {
    private String idXuatXu, noiXuatXu;
    private boolean trangThai;

    public XuatXu(String idXuatXu, String noiXuatXu, boolean trangThai) {
        this.idXuatXu = idXuatXu;
        this.noiXuatXu = noiXuatXu;
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

    public String getNoiXuatXu() {
        return noiXuatXu;
    }

    public void setNoiXuatXu(String noiXuatXu) {
        this.noiXuatXu = noiXuatXu;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

}
