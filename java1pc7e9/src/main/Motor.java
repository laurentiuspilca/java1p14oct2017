/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author student
 */
public class Motor {
    private String tip;
    
    public Motor(String tip) {
        this.tip = tip;
    }
    
    public void afisareTip() {
        System.out.println(tip);
    }
}
