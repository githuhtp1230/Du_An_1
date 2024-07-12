package models.sanpham_container.thuoctinh;

public class CoGiay {
    private String idCoGiay, tenCoGiay;
    private boolean trangThai;

    public CoGiay(String idCoGiay, String tenCoGiay, boolean trangThai) {
        this.idCoGiay = idCoGiay;
        this.tenCoGiay = tenCoGiay;
        this.trangThai = trangThai;
    }

    public CoGiay() {
    }

    public String getIdCoGiay() {
        return idCoGiay;
    }

    public void setIdCoGiay(String idCoGiay) {
        this.idCoGiay = idCoGiay;
    }

    public String getTenCoGiay() {
        return tenCoGiay;
    }

    public void setTenCoGiay(String tenCoGiay) {
        this.tenCoGiay = tenCoGiay;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

}
