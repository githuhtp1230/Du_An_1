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
import models.sanpham_container.thuoctinh.CoGiay;

/**
 *
 * @author Ca1
 */
public class repo_cogiay implements interface_repo_thuoctinh {
    Connection sConn = DBConn.getConnection();

    @Override
    public void add(Object x) {
        CoGiay coGiay = ((CoGiay) x);
        String query = querySQL.getInsertQuery("CoGiay", "TenCoGiay", "TrangThai");
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.setString(1, coGiay.getTenCoGiay());
            stm.setBoolean(2, coGiay.isTrangThai());
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public void update(Object x) {
        CoGiay coGiay = ((CoGiay) x);
        String query = querySQL.getUpdateQuery("CoGiay", coGiay.getIdCoGiay(), "TenCoGiay", "TrangThai");
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.setString(1, coGiay.getTenCoGiay());
            stm.setBoolean(2, coGiay.isTrangThai());
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public void remove(Object x) {
        CoGiay coGiay = ((CoGiay) x);
        String query = querySQL.getRemoveQuery("CoGiay", coGiay.getIdCoGiay());
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public ArrayList<Object> loadListFromDb() {
        ArrayList<Object> coGiays = new ArrayList<Object>();
        String query = "SELECT * FROM dbo.CoGiay";
        try {
            Statement stm = sConn.createStatement();
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {

                CoGiay ms = new CoGiay();

                ms.setIdCoGiay(rs.getString("Id"));
                ms.setTenCoGiay(rs.getString("TenCoGiay"));
                ms.setTrangThai(rs.getBoolean("TrangThai"));

                coGiays.add(ms);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return coGiays;
    }
}
