/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,5,7,8);
        
        Integer q = 
            list.stream()
                    .filter(x -> x % 2 == 0)
                    .sorted(Collections.reverseOrder())
                    .findFirst()
                    .map(x -> x).orElseThrow(RuntimeException::new);
    }
    
    private Optional<String> doSomething() { //metoda calculeaza profitul angajatorului
        try {
            // profitul initial
            int w = 5;
            int p = 0; 
            return Optional.of(":)");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return Optional.empty();
    }
    
}
