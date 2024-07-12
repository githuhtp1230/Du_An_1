/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

/**
 *
 * @author Ca1
 */
public class querySQL {

    public static String getInsertQuery(String tableName, String tenThuocTinh, String trangThai) {
        return "INSERT INTO dbo." + tableName + " \n"
                + "(\n"
                + "    " + tenThuocTinh + ",\n"
                + "    " + trangThai + "\n"
                + ")\n"
                + "VALUES\n"
                + "(   ?,   \n"
                + "    ?)";
    }

    public static String getUpdateQuery(String tableName, String id, String tenThuocTinh, String trangThai) {
        return "UPDATE dbo." + tableName + "\n"
                + "SET\n"
                + "    " + tenThuocTinh + " = ?,\n"
                + "    " + trangThai + " = ?\n"
                + "WHERE Id = ? ";
    }

    public static String getRemoveQuery(String tableName, String id) {
        return "DELETE FROM " + tableName + " WHERE Id = " + id;
    }
}