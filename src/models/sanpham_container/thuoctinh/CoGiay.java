package models.sanpham_container.thuoctinh;

public class CoGiay {
    private String idCoGiay, tenCoGiay;
    private boolean tranThai;

    public CoGiay(String idCoGiay, String tenCoGiay, boolean tranThai) {
        this.idCoGiay = idCoGiay;
        this.tenCoGiay = tenCoGiay;
        this.tranThai = tranThai;
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

    public boolean isTranThai() {
        return tranThai;
    }

    public void setTranThai(boolean tranThai) {
        this.tranThai = tranThai;
    }

}
