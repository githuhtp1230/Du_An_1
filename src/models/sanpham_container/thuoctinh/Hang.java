/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.sanpham_container.thuoctinh;

/**
 *
 * @author Ca1
 */
public class Hang {
    private String idHang, tenHang;
    private boolean trangThai;

    public Hang(String idHang, String tenHang, boolean trangThai) {
        this.idHang = idHang;
        this.tenHang = tenHang;
        this.trangThai = trangThai;
    }

    public Hang() {
    }

    public String getIdHang() {
        return idHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setIdHang(String idHang) {
        this.idHang = idHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

}
