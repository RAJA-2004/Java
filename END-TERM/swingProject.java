import java.util.*;
import javax.swing.*;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class swingProject {
    public static void main(String[] args) {
        Swing obj = new Swing();
    }
}

class Swing extends JFrame{
    

    
    public Swing(){

        JLabel j1 = new JLabel("Hello there !");
        add(j1);

        JTextField t1 = new JTextField(5);
        add(t1);

        JTextArea t2 = new JTextArea(5,5);
        add(t2);

        JButton b1 = new JButton("Submit");
        add(b1);

        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}