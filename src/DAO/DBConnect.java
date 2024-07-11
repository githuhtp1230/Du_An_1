package DAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author TienTHM_1
 */
public class DBConnect {
    public static Connection getConnection(){
        Connection sConn = null;
        String strDbUrl = "jdbc:sqlserver://localhost:1433; "
                + "databaseName=SNEAKER_HAVEN;" //Cấu hình theo tên database muốn kết nối
                + "user=sa;"
                + "password=123;" //Cấu hình theo mật khẩu tài khoản sa
                + "encrypt=true;trustServerCertificate=true";
        if (sConn == null) {
            try {
                sConn = DriverManager.getConnection(strDbUrl);
                return sConn;
            } catch (SQLException ex) {
                System.out.println("Khong the ket noi den CSDL \n" + ex);
            }
        }
        return null;
    }
}
