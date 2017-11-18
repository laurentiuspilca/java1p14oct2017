/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Produs;

/**
 *
 * @author student
 */
public class Magazin {
    private static Magazin singleton;
    
    private List<Produs> produse;
    
    private Magazin() {
        produse = new ArrayList<>();
    }
    
    public static Magazin getInstance () {
        if (singleton == null) {
            singleton = new Magazin();
        }
        return singleton;
    }
    
    public void adaugaProdus(Produs p) {
        produse.add(p);
    }
    
    public List<Produs> getProduse() {
        return this.produse;
    }
    
    public void stergeProdus(Produs p) {
        produse.remove(p);
    }
}
