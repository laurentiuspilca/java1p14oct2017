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
public class BMWFactory implements CarFactory {

    @Override
    public Roata buildRoata() {
        return new Roata("BMW");
    }

    @Override
    public Motor buildMotor() {
        return new Motor("BMW");
    }
    
}
