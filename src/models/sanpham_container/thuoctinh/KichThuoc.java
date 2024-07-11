/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.sanpham_container.thuoctinh;

/**
 *
 * @author Ca1
 */
public class KichThuoc {
    private String idChatLieu, loai;
    private boolean trangThai;

    public KichThuoc(String idChatLieu, String loai, boolean trangThai) {
        this.idChatLieu = idChatLieu;
        this.loai = loai;
        this.trangThai = trangThai;
    }

    public KichThuoc() {
    }

    public String getIdChatLieu() {
        return idChatLieu;
    }

    public void setIdChatLieu(String idChatLieu) {
        this.idChatLieu = idChatLieu;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

}
