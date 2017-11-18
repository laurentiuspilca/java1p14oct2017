import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fereastra2 extends JFrame {
    
    private JButton b;
    
    public Fereastra2() {
        super("Titlul fereastrei");
        setLayout(new FlowLayout());
        
        b = new JButton("HELLO"); // WORLD
        add(b);
        
        /**
        b.addActionListener(
            
            new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent ev) {
                    if (b.getText().equals("HELLO")) {
                        b.setText("WORLD");
                    } else {
                        b.setText("HELLO");
                    }
                }
                
            }
        );
        */
       b.addActionListener(ev -> modificaTextButon());
        
       setSize(500, 500);
       setLocationRelativeTo(null);
        
       setVisible(true);
    }
    
    private void modificaTextButon() {
        if (b.getText().equals("HELLO")) {
            b.setText("WORLD");
        } else {
            b.setText("HELLO");
        }
    }
    
    public static void main(String [] args) {
        new Fereastra2();
    }
}