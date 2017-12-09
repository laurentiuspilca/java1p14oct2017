/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author student
 */
public class Exemplu2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/java1pcurs8";
        String username = "root";
        String password = "";
        try (Connection con = 
                DriverManager.getConnection(url, username, password)) {
            String nume = "Gigel";
            double salariu = 1000;
            String sql = "INSERT INTO angajati VALUES (NULL,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, nume);
            stmt.setDouble(2, salariu);
            
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
