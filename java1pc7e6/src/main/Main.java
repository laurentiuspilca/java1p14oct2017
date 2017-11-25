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
        Calculator c1 = new DoubleCalculator(null);
        Calculator c2 = new SquareCalculator(c1);
        Calculator c3 = new CubeCalculator(c2);
        
        Calculator c4 = new CubeCalculator(new SquareCalculator(new DoubleCalculator(null)));
        
        double rez1 = c4.operatie(10);
        System.out.println(rez1);
        
        Calculator c5 = new SquareCalculator(new DoubleCalculator(new CubeCalculator(null)));
        
        double rez2 = c5.operatie(10);
        System.out.println(rez2);
        
    }
    
}
