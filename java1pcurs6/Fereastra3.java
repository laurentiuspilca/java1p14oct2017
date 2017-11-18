import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fereastra3 extends JFrame {

    private JButton b;
    private int x;
    
    public Fereastra3() {
        setLayout(new FlowLayout());
        
        b = new JButton("0");
        add(b);
        b.addActionListener(ev -> b.setText(String.valueOf(++x)));
        
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String [] args) {
        new Fereastra3();
    }
}