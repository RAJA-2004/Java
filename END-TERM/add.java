import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

import ExceptionHandling.test;
public class add{
    public static void main(String[] args) {
        Swing obj = new Swing();
    }
}

class Swing extends JFrame{
    public Swing(){

        JTextField f1 = new JTextField(5);
        JButton b1 = new JButton("previous");
        
        JTextField f2 = new JTextField(5);

        JButton b2 = new JButton("next");
        JLabel l1 = new JLabel("-1");
        JLabel l2 = new JLabel("-1");

        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent e){

                String s1 = f1.getText();
                String s2 = f2.getText();

                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s2);

                Integer res = a - 1;

                l1.setText(res.toString());
            }
        };

        ActionListener bl = new ActionListener() {
            public void actionPerformed(ActionEvent e){

                String s1 = f1.getText();

                int a = Integer.parseInt(s1);

                Integer rese = a + 1;

                l2.setText(rese.toString());
            }
        };

        b1.addActionListener(al);
        b2.addActionListener(bl);

        add(f1);
        add(f2);
        add(b1);
        add(b2);
        add(l1);
        add(l2);

        // !

        // JTextField t1 = new JTextField(5);

        // JRadioButton r1 = new JRadioButton("male");
        // JRadioButton r2 = new JRadioButton("female");

        // JCheckBox c1 = new JCheckBox("tea");
        // JCheckBox c2 = new JCheckBox("coffee");

        // JButton b1 = new JButton("Submit Details");

        // JLabel l1 = new JLabel("Greetings....");

        // ButtonGroup b = new ButtonGroup();
        // b.add(r1);
        // b.add(r2);

        ActionListener al = new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String name = t1.getText();
                if(r1.isSelected()){
                    name = "Mr. " + name;
                }
                if(r2.isSelected()){
                    name = "Ms. " + name;
                }
                if(c1.isSelected()){
                    name = name + " likes tea";
                }
                if(c2.isSelected()){
                    name = name + " likes coffee";
                }

                l1.setText(name);
            }
        };

        // b1.addActionListener(al);

        // add(t1);
        // add(r1);
        // add(r2);
        // add(c1);
        // add(c2);
        // add(b1);
        // add(l1);

        // !

        // String[] cols = {"ID","NAME","AGE"};
        // String[][] rows = {{"1","raja","20"},{"2","raja","20"},{"3","raja","20"},{"1","raja","20"},{"2","raja","20"},{"3","raja","20"},{"1","raja","20"},{"2","raja","20"},{"3","raja","20"},{"1","raja","20"},{"2","raja","20"},{"3","raja","20"},{"1","raja","20"},{"2","raja","20"},{"3","raja","20"},{"1","raja","20"},{"2","raja","20"},{"3","raja","20"},{"1","raja","20"},{"2","raja","20"},{"3","raja","20"},{"1","raja","20"},{"2","raja","20"},{"3","raja","20"},{"1","raja","20"},{"2","raja","20"},{"3","raja","20"},{"1","raja","20"},{"2","raja","20"},{"3","raja","20"},{"1","raja","20"},{"2","raja","20"},{"3","raja","20"},{"1","raja","20"},{"2","raja","20"},{"3","raja","20"},{"1","raja","20"},{"2","raja","20"},{"3","raja","20"},{"1","raja","20"},{"2","raja","20"},{"3","raja","20"},{"1","raja","20"},{"2","raja","20"},{"3","raja","20"},{"1","raja","20"},{"2","raja","20"},{"3","raja","20"},{"1","raja","20"},{"2","raja","20"},{"3","raja","20"},{"1","raja","20"},{"2","raja","20"},{"3","raja","20"},{"1","raja","20"},{"2","raja","20"},{"3","raja","20"},{"1","raja","20"},{"2","raja","20"},{"3","raja","20"}};

        // JTable jt = new JTable(rows,cols);
        // // add(jt);

        // JScrollPane jp = new JScrollPane(jt);
        // add(jp);

        

        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}