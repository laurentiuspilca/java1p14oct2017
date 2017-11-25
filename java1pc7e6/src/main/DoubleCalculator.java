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
public class DoubleCalculator implements Calculator {

    private Calculator calculator;
    
    public DoubleCalculator(Calculator calculator) {
        this.calculator = calculator;
    }
    
    @Override
    public double operatie(double x) {
        if (calculator != null) {
            x = calculator.operatie(x);
        }
        return 2 * x;
    }
    
}
