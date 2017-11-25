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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyRegistry r1 = MyRegistry.getInstance(1);
        MyRegistry r2 = MyRegistry.getInstance(2);
        MyRegistry r3 = MyRegistry.getInstance(1);
        
        System.out.println(r1 == r2); // false
        System.out.println(r1 == r3); // true
    }
    
}
