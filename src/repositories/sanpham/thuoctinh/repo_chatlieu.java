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
import models.sanpham_container.thuoctinh.ChatLieu;

/**
 *
 * @author Ca1
 */
public class repo_chatlieu implements interface_repo_thuoctinh {
    Connection sConn = DBConn.getConnection();

    @Override
    public void add(Object x) {
        ChatLieu chatLieu = ((ChatLieu) x);
        String query = querySQL.getInsertQuery("ChatLieu", "Loai", "TrangThai");
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.setString(1, chatLieu.getLoai());
            stm.setBoolean(2, chatLieu.isTrangThai());
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public void update(Object x) {
        ChatLieu chatLieu = ((ChatLieu) x);
        String query = querySQL.getUpdateQuery("ChatLieu", chatLieu.getIdChatLieu(), "Loai", "TrangThai");
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.setString(1, chatLieu.getLoai());
            stm.setBoolean(2, chatLieu.isTrangThai());
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public void remove(Object x) {
        ChatLieu chatLieu = ((ChatLieu) x);
        String query = querySQL.getRemoveQuery("ChatLieu", chatLieu.getIdChatLieu());
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

    @Override
    public ArrayList<Object> loadListFromDb() {
        ArrayList<Object> chatLieus = new ArrayList<Object>();
        String query = "SELECT * FROM dbo.ChatLieu";
        try {
            Statement stm = sConn.createStatement();
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {

                ChatLieu ms = new ChatLieu();

                ms.setIdChatLieu(rs.getString("Id"));
                ms.setLoai(rs.getString("Loai"));
                ms.setTrangThai(rs.getBoolean("TrangThai"));

                chatLieus.add(ms);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return chatLieus;
    }

}
