package org.sabello.java.jdbc;

import java.sql.*;

public class EjermploJdbc {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/java_curso?serverTimezone=UTC";
        String username = "root";
        String password = "sasa";


        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet resultado = stmt.executeQuery("SELECT * FROM productos")) {

            while (resultado.next()) {
                System.out.println(resultado.getString("nombre"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
