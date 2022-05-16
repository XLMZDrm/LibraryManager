/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    private static Connection con;
    private static String DB_URL = "jdbc:mysql://remotemysql.com:3306/2rWhqjDygH";
    private static String USER_NAME = "2rWhqjDygH";
    private static String PASSWORD = "quNIX26vtf";

    public static Connection getConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("connect successfully!");
        } catch (Exception e) {
            System.out.println("connect failure!");
        }
        return con;
    }

    public static String testConnect() {
        try {
            con = Connect.getConnect();
            return "";
        } catch (Exception e) {
            return "";
        }
    }
}
