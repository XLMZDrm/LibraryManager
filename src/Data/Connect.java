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

    public static Connection getConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:sqlserver://bfdyllagpx9xmspozzom-mysql.services.clever-cloud.com;databaseName=bfdyllagpx9xmspozzom;Username=uihxw415jvbmmula;Password = yen6f9KlpbvG7Pr7Zcy2");

        } catch (Exception e) {
            System.out.println("");
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
