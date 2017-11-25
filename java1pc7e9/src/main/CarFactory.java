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
public interface CarFactory {
    public Roata buildRoata();
    public Motor buildMotor();
    
    public static CarFactory build(Type type) {
        switch (type) {
            case AUDI : return new AudiFactory();
            case BMW : return new BMWFactory();
        }
        
        throw new RuntimeException("No such car");
    }
    
    public static enum Type {
        BMW, AUDI
    }
}
