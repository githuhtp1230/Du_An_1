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
import models.sanpham_container.thuoctinh.HinhAnh;

/**
 *
 * @author Ca1
 */
public class repo_hinhanh implements interface_repo_thuoctinh {
    Connection sConn = DBConn.getConnection();

    @Override
    public void add(Object x) {
        HinhAnh hinhAnh = ((HinhAnh) x);
        String query = querySQL.getInsertQuery("HinhAnh", "TenHinhAnh", "TrangThai");
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.setString(1, hinhAnh.getTenHinhAnh());
            stm.setBoolean(2, hinhAnh.isTrangThai());
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public void update(Object x) {
        HinhAnh hinhAnh = ((HinhAnh) x);
        String query = querySQL.getUpdateQuery("HinhAnh", hinhAnh.getIdHinhAnh(), "TenHinhAnh", "TrangThai");
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.setString(1, hinhAnh.getTenHinhAnh());
            stm.setBoolean(2, hinhAnh.isTrangThai());
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public void remove(Object x) {
        HinhAnh hinhAnh = ((HinhAnh) x);
        String query = querySQL.getRemoveQuery("HinhAnh", hinhAnh.getIdHinhAnh());
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public ArrayList<Object> loadListFromDb() {
        ArrayList<Object> hinhAnhs = new ArrayList<Object>();
        String query = "SELECT * FROM dbo.HinhAnh";
        try {
            Statement stm = sConn.createStatement();
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {

                HinhAnh ms = new HinhAnh();

                ms.setIdHinhAnh(rs.getString("Id"));
                ms.setTenHinhAnh(rs.getString("TenHinhAnh"));
                ms.setTrangThai(rs.getBoolean("TrangThai"));

                hinhAnhs.add(ms);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return hinhAnhs;
    }

}
