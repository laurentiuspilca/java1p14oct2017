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
public class SquareCalculator implements Calculator {

    private Calculator calculator;
    
    public SquareCalculator(Calculator calculator) {
        this.calculator = calculator;
    }
    
    @Override
    public double operatie(double x) {
        if (calculator != null) {
            x = calculator.operatie(x);
        }
        return x*x;
    }
    
    
}
