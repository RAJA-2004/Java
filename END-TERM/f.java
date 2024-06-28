import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class f {
    
    public static void main(String[] args) {
        test t = new test();
    }
}

class test extends JFrame{
    public test(){
        setLayout(new FlowLayout());
        JLabel j1 = new JLabel("cm to feet and feet to cm Converter");
        add(j1);
        
        JLabel j2 = new JLabel("cm to feet and feet to cm Converter");
        add(j2);

        JTextField t1 = new JTextField(5);
        add(t1);

        JRadioButton j3 = new JRadioButton("feet to cm");
        JRadioButton j4 = new JRadioButton("cm to feet");

        ButtonGroup z = new ButtonGroup();
        z.add(j3);
        z.add(j4);

        add(j3);
        add(j4);

        JButton s1 = new JButton("Convert");
        JButton s2 = new JButton("Reset");

        add(s1);
        add(s2);

        ActionListener a1 = new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String str = t1.getText();
                double t = Double.parseDouble(str);
                if(j3.isSelected()){
                    Double r = t*30.48;
                    s2.setText(r.toString());
                }
                if(j4.isSelected()){
                    Double r = t*0.0328;
                    s2.setText(r.toString());
                }
            }
        };

        s1.addActionListener(a1);

        setSize(300,300);
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}