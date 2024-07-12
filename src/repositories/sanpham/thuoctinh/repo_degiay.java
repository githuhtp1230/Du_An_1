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
import models.sanpham_container.thuoctinh.DeGiay;

/**
 *
 * @author Ca1
 */
public class repo_degiay implements interface_repo_thuoctinh {
    Connection sConn = DBConn.getConnection();

    @Override
    public void add(Object x) {
        DeGiay deGiay = ((DeGiay) x);
        String query = querySQL.getInsertQuery("DeGiay", "TenDeGiay", "TrangThai");
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.setString(1, deGiay.getTenDeGiay());
            stm.setBoolean(2, deGiay.isTrangThai());
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public void update(Object x) {
        DeGiay deGiay = ((DeGiay) x);
        String query = querySQL.getUpdateQuery("DeGiay", deGiay.getIdDeGiay(), "TenDeGiay", "TrangThai");
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.setString(1, deGiay.getTenDeGiay());
            stm.setBoolean(2, deGiay.isTrangThai());
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public void remove(Object x) {
        DeGiay deGiay = ((DeGiay) x);
        String query = querySQL.getRemoveQuery("DeGiay", deGiay.getIdDeGiay());
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public ArrayList<Object> loadListFromDb() {
        ArrayList<Object> deGiays = new ArrayList<Object>();
        String query = "SELECT * FROM dbo.DeGiay";
        try {
            Statement stm = sConn.createStatement();
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {

                DeGiay ms = new DeGiay();

                ms.setIdDeGiay(rs.getString("Id"));
                ms.setTenDeGiay(rs.getString("TenDeGiay"));
                ms.setTrangThai(rs.getBoolean("TrangThai"));

                deGiays.add(ms);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return deGiays;
    }

}
