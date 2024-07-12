/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories.sanpham.thuoctinh;

import DAO.DBConn;
import java.sql.*;
import interfaces.interface_repo_thuoctinh;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import logic.querySQL;
import models.sanpham_container.thuoctinh.KhoiLuong;

/**
 *
 * @author Ca1
 */
public class repo_khoiluong implements interface_repo_thuoctinh {
    Connection sConn = DBConn.getConnection();

    @Override
    public void add(Object x) {
        KhoiLuong khoiLuong = ((KhoiLuong) x);
        String query = querySQL.getInsertQuery("KhoiLuong", "TenKhoiLuong", "TrangThai");
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.setString(1, khoiLuong.getTenKhoiLuong());
            stm.setBoolean(2, khoiLuong.isTrangThai());
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public void update(Object x) {
        KhoiLuong khoiLuong = ((KhoiLuong) x);
        String query = querySQL.getUpdateQuery("KhoiLuong", khoiLuong.getIdKhoiLuong(), "TenKhoiLuong", "TrangThai");
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.setString(1, khoiLuong.getTenKhoiLuong());
            stm.setBoolean(2, khoiLuong.isTrangThai());
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public void remove(Object x) {
        KhoiLuong khoiLuong = ((KhoiLuong) x);
        String query = querySQL.getRemoveQuery("KhoiLuong", khoiLuong.getIdKhoiLuong());
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public ArrayList<Object> loadListFromDb() {
        ArrayList<Object> khoiLuongs = new ArrayList<Object>();
        String query = "SELECT * FROM dbo.KhoiLuong";
        try {
            Statement stm = sConn.createStatement();
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {

                KhoiLuong ms = new KhoiLuong();

                ms.setIdKhoiLuong(rs.getString("Id"));
                ms.setTenKhoiLuong(rs.getString("TenKhoiLuong"));
                ms.setTrangThai(rs.getBoolean("TrangThai"));

                khoiLuongs.add(ms);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return khoiLuongs;
    }

}
