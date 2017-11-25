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
public class NewCubeCalculator implements Calculator {

    @Override
    public double operatie(double x) {
        return Math.pow(x, 3);
    }
    
}
