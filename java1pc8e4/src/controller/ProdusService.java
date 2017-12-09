/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Produs;

/**
 *
 * @author student
 */
public class ProdusService {
    
    private Connection con;
    
    private ProdusService() {
        String url = "jdbc:mysql://localhost/java1pcurs8";
        String username = "root";
        String password = "";
        
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private static final class SingletonHolder {
        private static final ProdusService SINGLETON = new ProdusService();
    }
    
    public static ProdusService getInstance() {
        return SingletonHolder.SINGLETON;
    }
    
    public void adaugaProdus (String nume, double pret) {
        String sql = "INSERT INTO produse VALUES (NULL,?,?)";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, nume);
            stmt.setDouble(2, pret);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Produs> getProduse () {
        List<Produs> produse = new ArrayList<>();
        
        String sql = "SELECT * FROM produse";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Produs p = new Produs();
                p.setId(rs.getInt("id"));
                p.setNume(rs.getString("nume"));
                p.setPret(rs.getDouble("pret"));
                produse.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return produse;
    }
}
