/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.sanpham_container.thuoctinh;

/**
 *
 * @author Ca1
 */
public class MauSac {
    private String idMauSac, tenMauSac;
    private boolean trangThai;

    public MauSac(String idMauSac, String tenMauSac, boolean trangThai) {
        this.idMauSac = idMauSac;
        this.tenMauSac = tenMauSac;
        this.trangThai = trangThai;
    }

    public String getIdMauSac() {
        return idMauSac;
    }

    public void setIdMauSac(String idMauSac) {
        this.idMauSac = idMauSac;
    }

    public String getTenMauSac() {
        return tenMauSac;
    }

    public void setTenMauSac(String tenMauSac) {
        this.tenMauSac = tenMauSac;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    
    
}
