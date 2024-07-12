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
import models.sanpham_container.thuoctinh.XuatXu;

/**
 *
 * @author Ca1
 */
public class repo_xuatxu implements interface_repo_thuoctinh {
    Connection sConn = DBConn.getConnection();

    @Override
    public void add(Object x) {
        XuatXu xuatXu = ((XuatXu) x);
        String query = querySQL.getInsertQuery("XuatXu", "TenXuatXu", "TrangThai");
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.setString(1, xuatXu.getTenNuoc());
            stm.setBoolean(2, xuatXu.isTrangThai());
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public void update(Object x) {
        XuatXu xuatXu = ((XuatXu) x);
        String query = querySQL.getUpdateQuery("XuatXu", xuatXu.getIdXuatXu(), "TenXuatXu", "TrangThai");
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.setString(1, xuatXu.getTenNuoc());
            stm.setBoolean(2, xuatXu.isTrangThai());
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public void remove(Object x) {
        XuatXu xuatXu = ((XuatXu) x);
        String query = querySQL.getRemoveQuery("XuatXu", xuatXu.getIdXuatXu());
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public ArrayList<Object> loadListFromDb() {
        ArrayList<Object> xuatXus = new ArrayList<Object>();
        String query = "SELECT * FROM dbo.XuatXu";
        try {
            Statement stm = sConn.createStatement();
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {

                XuatXu ms = new XuatXu();

                ms.setIdXuatXu(rs.getString("Id"));
                ms.setTenNuoc(rs.getString("TenNuoc"));
                ms.setTrangThai(rs.getBoolean("TrangThai"));

                xuatXus.add(ms);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return xuatXus;
    }

}
