/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models.sanpham_container.thuoctinh;

/**
 *
 * @author Ca1
 */

/**
 * KichThuoc
 */
public class KichThuoc {
    private String idKichThuoc;
    private int size;
    private boolean trangThai;

    public KichThuoc() {
    }

    public KichThuoc(String idKichThuoc, int size, boolean trangThai) {
        this.idKichThuoc = idKichThuoc;
        this.size = size;
        this.trangThai = trangThai;
    }

    public String getIdKichThuoc() {
        return idKichThuoc;
    }

    public void setIdKichThuoc(String idKichThuoc) {
        this.idKichThuoc = idKichThuoc;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

}