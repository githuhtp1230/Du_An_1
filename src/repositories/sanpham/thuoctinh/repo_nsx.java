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
import models.sanpham_container.thuoctinh.NhaSanXuat;

/**
 *
 * @author Ca1
 */
public class repo_nsx implements interface_repo_thuoctinh {
    Connection sConn = DBConn.getConnection();

    @Override
    public void add(Object x) {
        NhaSanXuat nhaSanXuat = ((NhaSanXuat) x);
        String query = querySQL.getInsertQuery("NSX", "TenNSX", "TrangThai");
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.setString(1, nhaSanXuat.getTenNSX());
            stm.setBoolean(2, nhaSanXuat.isTrangThai());
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public void update(Object x) {
        NhaSanXuat nhaSanXuat = ((NhaSanXuat) x);
        String query = querySQL.getUpdateQuery("NSX", nhaSanXuat.getMaNSX(), "TenNSX",
                "TrangThai");
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.setString(1, nhaSanXuat.getTenNSX());
            stm.setBoolean(2, nhaSanXuat.isTrangThai());
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public void remove(Object x) {
        NhaSanXuat nhaSanXuat = ((NhaSanXuat) x);
        String query = querySQL.getRemoveQuery("NSX", nhaSanXuat.getMaNSX());
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public ArrayList<Object> loadListFromDb() {
        ArrayList<Object> nhaSanXuats = new ArrayList<Object>();
        String query = "SELECT * FROM dbo.NSX";
        try {
            Statement stm = sConn.createStatement();
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {

                NhaSanXuat ms = new NhaSanXuat();

                ms.setMaNSX(rs.getString("Id"));
                ms.setTenNSX(rs.getString("TenNSX"));
                ms.setTrangThai(rs.getBoolean("TrangThai"));

                nhaSanXuats.add(ms);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return nhaSanXuats;
    }

}
