package repositories.sanpham.thuoctinh;

import java.util.ArrayList;
import models.sanpham_container.thuoctinh.MauSac;
import java.sql.*;

public class repo_mausac {

    public ArrayList<MauSac> loadListFromDb() {
        Connection sConn = DBConn.getConnection();
        // msởi tạo list nhân viên trống
        List<mauSac> mauSacs = new ArrayList<mauSac>();
        String query = "SELECT * FROM dbo.NhanVien";
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