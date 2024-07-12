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
import models.sanpham_container.thuoctinh.Hang;

/**
 *
 * @author Ca1
 */
public class repo_hang implements interface_repo_thuoctinh {
    Connection sConn = DBConn.getConnection();

    @Override
    public void add(Object x) {
        Hang hang = ((Hang) x);
        String query = querySQL.getInsertQuery("Hang", "TenHang", "TrangThai");
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.setString(1, hang.getTenHang());
            stm.setBoolean(2, hang.isTrangThai());
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public void update(Object x) {
        Hang hang = ((Hang) x);
        String query = querySQL.getUpdateQuery("Hang", hang.getIdHang(), "TenHang", "TrangThai");
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.setString(1, hang.getTenHang());
            stm.setBoolean(2, hang.isTrangThai());
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public void remove(Object x) {
        Hang hang = ((Hang) x);
        String query = querySQL.getRemoveQuery("Hang", hang.getIdHang());
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public ArrayList<Object> loadListFromDb() {
        ArrayList<Object> hangs = new ArrayList<Object>();
        String query = "SELECT * FROM dbo.Hang";
        try {
            Statement stm = sConn.createStatement();
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {

                Hang ms = new Hang();

                ms.setIdHang(rs.getString("Id"));
                ms.setTenHang(rs.getString("TenHang"));
                ms.setTrangThai(rs.getBoolean("TrangThai"));

                hangs.add(ms);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return hangs;
    }

}
