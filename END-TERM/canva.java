import java.awt.Canvas;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

public class canva extends Canvas{
    public static void main(String[] args) {
        canva obj = new canva();

        JFrame j = new JFrame();
        j.add(obj);

        j.setVisible(true);
        j.setSize(500,500);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g){
        g.drawString("raja", 40, 40);
        setBackground(Color.WHITE);
        g.fillRect(130, 30, 100, 40);
        g.fillOval(30, 130, 40, 80);
        setForeground(Color.RED);

        g.drawArc(50, 200, 50, 80, 90, 60);
    }

} 