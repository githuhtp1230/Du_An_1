package models.sanpham_container.thuoctinh;

public class DeGiay {
    private String maDeGiay, tenDeGiay;
    private boolean trangThai;

    public DeGiay(String maDeGiay, String tenDeGiay, boolean trangThai) {
        this.maDeGiay = maDeGiay;
        this.tenDeGiay = tenDeGiay;
        this.trangThai = trangThai;
    }

    public DeGiay() {
    }

    public String getMaDeGiay() {
        return maDeGiay;
    }

    public void setMaDeGiay(String maDeGiay) {
        this.maDeGiay = maDeGiay;
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
