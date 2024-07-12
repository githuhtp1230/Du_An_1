/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.etity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Lenovo
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class HoaDon {

    private Integer id;
    private Integer idKH;
    private Integer idNV;
    private Integer idPGG;
    private Integer idHTTT;

    private String maHoaDon;
    private String TenKhachHang;
    private Date ngayTao;
    private Date ngayThanhToan;
    private String sdt;
    private String diaChi;
    private Double tongTien;
    private Double tongTienKhiGiam;
    private Date ngayNhanHang;
    private Date ngayMongMuonNhanHang;
    private Date ngayThucTeNhan;
}
