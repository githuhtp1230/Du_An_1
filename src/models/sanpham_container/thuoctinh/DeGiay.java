package models.sanpham_container.thuoctinh;

public class DeGiay {
    private String idDeGiay, tenDeGiay;
    private boolean trangThai;

    public DeGiay(String idDeGiay, String tenDeGiay, boolean trangThai) {
        this.idDeGiay = idDeGiay;
        this.tenDeGiay = tenDeGiay;
        this.trangThai = trangThai;
    }

    public DeGiay() {
    }

    public String getIdDeGiay() {
        return idDeGiay;
    }

    public void setIdDeGiay(String idDeGiay) {
        this.idDeGiay = idDeGiay;
    }

    public String getTenDeGiay() {
        return tenDeGiay;
    }

    public void setTenDeGiay(String tenDeGiay) {
        this.tenDeGiay = tenDeGiay;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

}
