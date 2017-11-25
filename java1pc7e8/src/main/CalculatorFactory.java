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
public final class CalculatorFactory {
    private CalculatorFactory() {}
    
    public static Calculator build(Calculator.Type type) {
        switch (type) {
            case CUBE : return new CubeCalculator();
            case DOUBLE : return new DoubleCalculator();
            case SQUARE : return new SquareCalculator();
            case NEW_CUBE : return new NewCubeCalculator();
        }
        
        throw new RuntimeException("Unknown calculator type");
    }
}
