package repositories.sanpham.thuoctinh;

import java.util.ArrayList;
import models.sanpham_container.thuoctinh.MauSac;
import java.sql.*;
import DAO.DBConn;
import interfaces.interface_repo_thuoctinh;
import logic.querySQL;

public class repo_mausac implements interface_repo_thuoctinh {

    Connection sConn = DBConn.getConnection();

    @Override
    public void add(Object x) {
        MauSac mauSac = ((MauSac) x);
        String query = querySQL.getInsertQuery("MauSac", "TenMau", "TrangThai");
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.setString(1, mauSac.getTenMauSac());
            stm.setBoolean(2, mauSac.isTrangThai());
            stm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Object x) {
        MauSac mauSac = ((MauSac) x);
        String query = querySQL.getUpdateQuery("MauSac", mauSac.getIdMauSac(), mauSac.getTenMauSac(),
                mauSac.isTrangThai() + "");
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.setString(1, mauSac.getTenMauSac());
            stm.setBoolean(2, mauSac.isTrangThai());
            stm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(Object x) {
        MauSac mauSac = ((MauSac) x);
        String query = querySQL.getRemoveQuery("MauSac", mauSac.getIdMauSac());
        try {
            PreparedStatement stm = sConn.prepareStatement(query);
            stm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Object> loadListFromDb() {

        ArrayList<Object> mauSacs = new ArrayList<Object>();
        String query = "SELECT * FROM dbo.MauSac";
        try {
            Statement stm = sConn.createStatement();
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {

                MauSac ms = new MauSac();

                ms.setIdMauSac(rs.getString("Id"));
                ms.setTenMauSac(rs.getString("TenMau"));
                ms.setTrangThai(rs.getBoolean("TrangThai"));

                mauSacs.add(ms);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mauSacs;
    }
}
