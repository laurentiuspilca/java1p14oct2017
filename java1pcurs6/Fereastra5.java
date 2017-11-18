import javax.swing.*;
import java.awt.*;

public class Fereastra5 extends JFrame {

    private JButton b1,b2,b3;
    private JPanel p1, p2;
    
    public Fereastra5() {
        
        p1 = new JPanel();
        add(p1, BorderLayout.SOUTH);
        
        p2 = new JPanel();
        add(p2);
        
        b1 = new JButton("ROSU");
        b2 = new JButton("VERDE");
        b3 = new JButton("ALBASTRU");
        
        p1.add(b1); p1.add(b2); p1.add(b3);
        
        b1.addActionListener(ev -> p2.setBackground(new Color(255,255,0)));
        b2.addActionListener(ev -> p2.setBackground(Color.GREEN));
        b3.addActionListener(ev -> p2.setBackground(Color.BLUE));
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String [] args) {
        new Fereastra5();
    }
}