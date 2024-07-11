package models;

public class DotGiamGia {
    private String idDotGiamGia, thoiGianBatDau, thoiGianKetThuc;
    private float phanTramGiamGia;

    public DotGiamGia(String idDotGiamGia, String thoiGianBatDau, String thoiGianKetThuc, float phanTramGiamGia) {
        this.idDotGiamGia = idDotGiamGia;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.phanTramGiamGia = phanTramGiamGia;
    }

    public String getIdDotGiamGia() {
        return idDotGiamGia;
    }

    public void setIdDotGiamGia(String idDotGiamGia) {
        this.idDotGiamGia = idDotGiamGia;
    }

    public String getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(String thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public String getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(String thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public float getPhanTramGiamGia() {
        return phanTramGiamGia;
    }

    public void setPhanTramGiamGia(float phanTramGiamGia) {
        this.phanTramGiamGia = phanTramGiamGia;
    }

}
