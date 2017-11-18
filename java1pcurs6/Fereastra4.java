import javax.swing.*;
import java.awt.*;

public class Fereastra4 extends JFrame {

    private JButton b1,b2,b3,b4,b5;
    
    public Fereastra4() {
        super("Titlu");
        
        b1 = new JButton("NORTH");
        b2 = new JButton("SOUTH");
        b3 = new JButton("EAST");
        b4 = new JButton("WEST");
        b5 = new JButton("CENTER");
        
        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.WEST);
        add(b5);
        
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String [] args) {
        new Fereastra4();
    }
}