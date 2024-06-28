import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChanger extends Frame implements ActionListener {
    private Label label1, label2, label3;
    private Button exitButton, changeBgColorButton, changeTextColorButton;
    private Color backgroundColor = Color.WHITE;
    private Color textColor = Color.BLACK;

    public ColorChanger() {
        // Frame properties
        setLayout(new FlowLayout());
        setSize(400, 300);
        setTitle("AWT Color Changer");

        // Initialize labels
        label1 = new Label("Label 1");
        label2 = new Label("Label 2");
        label3 = new Label("Label 3");

        // Set initial colors
        setLabelColors();

        // Add labels to the frame
        add(label1);
        add(label2);
        add(label3);

        // Initialize buttons
        changeBgColorButton = new Button("Change Background Color");
        changeTextColorButton = new Button("Change Text Color");
        exitButton = new Button("Exit");

        // Add action listeners
        changeBgColorButton.addActionListener(this);
        changeTextColorButton.addActionListener(this);
        exitButton.addActionListener(this);

        // Add buttons to the frame
        add(changeBgColorButton);
        add(changeTextColorButton);
        add(exitButton);

        // Frame visibility
        setVisible(true);
    }

    private void setLabelColors() {
        label1.setBackground(backgroundColor);
        label2.setBackground(backgroundColor);
        label3.setBackground(backgroundColor);

        label1.setForeground(textColor);
        label2.setForeground(textColor);
        label3.setForeground(textColor);
    }

    public static void main(String[] args) {
        new ColorChanger();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == changeBgColorButton) {
            Color newColor = JColorChooser.showDialog(this, "Choose Background Color", backgroundColor);
            if (newColor != null) {
                backgroundColor = newColor;
                setLabelColors();
            }
        } else if (e.getSource() == changeTextColorButton) {
            Color newColor = JColorChooser.showDialog(this, "Choose Text Color", textColor);
            if (newColor != null) {
                textColor = newColor;
                setLabelColors();
            }
        } else if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }
}
