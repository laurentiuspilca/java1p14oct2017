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
public interface Calculator {
    public double operatie(double x);
    
    public static enum Type {
        SQUARE, CUBE, DOUBLE, NEW_CUBE
    }
}
