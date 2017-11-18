import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fereastra1 extends JFrame {
    
    private JButton b;
    
    public Fereastra1() {
        super("Titlul fereastrei");
        setLayout(new FlowLayout());
        
        b = new JButton("HELLO"); // WORLD
        add(b);
        b.addActionListener(new MyListener());
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        
        setVisible(true);
    }
    
    private class MyListener implements ActionListener {
    
        @Override
        public void actionPerformed(ActionEvent ev) {
            if (b.getText().equals("HELLO")) {
                b.setText("WORLD");
            } else {
                b.setText("HELLO");
            }
        }
    }
    
    public static void main(String [] args) {
        new Fereastra1();
    }
}