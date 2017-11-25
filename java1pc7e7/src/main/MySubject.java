/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class MySubject {
    
    private List<MyListener> listeners = new ArrayList<>();
    
    public void metodaCareModificaStareaSubiectului() {
        // se modifica starea subiectului
        listeners.forEach(MyListener::metodaNotificataAtunciCandSeSchimbaStareaSub);
    }
    
    public void addMyListener(MyListener q) {
        listeners.add(q);
    }
    
    public void removeMyListener(MyListener q) {
        listeners.remove(q);
    }
}
