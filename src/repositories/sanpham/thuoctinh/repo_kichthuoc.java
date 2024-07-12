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
import models.sanpham_container.thuoctinh.KichThuoc;

/**
 *
 * @author Ca1
 */
public class repo_kichthuoc implements interface_repo_thuoctinh {
    Connection sConn = DBConn.getConnection();

    @Override
    public void add(Object x) {
        KichThuoc kichThuoc = ((KichThuoc) x);
        String query = querySQL.getInsertQuery("KichThuoc", "Size", "TrangThai");
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.setInt(1, kichThuoc.getSize());
            stm.setBoolean(2, kichThuoc.isTrangThai());
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public void update(Object x) {
        KichThuoc kichThuoc = ((KichThuoc) x);
        String query = querySQL.getUpdateQuery("KichThuoc", kichThuoc.getIdKichThuoc(), "Size", "TrangThai");
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.setInt(1, kichThuoc.getSize());
            stm.setBoolean(2, kichThuoc.isTrangThai());
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public void remove(Object x) {
        KichThuoc kichThuoc = ((KichThuoc) x);
        String query = querySQL.getRemoveQuery("KichThuoc", kichThuoc.getIdKichThuoc());
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public ArrayList<Object> loadListFromDb() {
        ArrayList<Object> kichThuocs = new ArrayList<Object>();
        String query = "SELECT * FROM dbo.KichThuoc";
        try {
            Statement stm = sConn.createStatement();
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {

                KichThuoc ms = new KichThuoc();

                ms.setIdKichThuoc(rs.getString("Id"));
                ms.setSize(rs.getInt("Size"));
                ms.setTrangThai(rs.getBoolean("TrangThai"));

                kichThuocs.add(ms);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return kichThuocs;
    }

}
