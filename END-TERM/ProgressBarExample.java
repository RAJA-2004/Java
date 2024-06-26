import java.awt.*;
import java.awt.event.*;

public class ProgressBarExample extends Frame implements ActionListener {
    private ProgressBar progressBar;
    private Button increaseButton;

    public ProgressBarExample() {
        // Frame properties
        setLayout(new FlowLayout());
        setSize(400, 200);
        setTitle("AWT Progress Bar Example");

        progressBar = new ProgressBar();
        progressBar.setSize(300, 30);
        add(progressBar);

        increaseButton = new Button("Increase Progress");
        increaseButton.addActionListener(this);
        add(increaseButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ProgressBarExample();
    }

    public void actionPerformed(ActionEvent e) {
        progressBar.increase();
    }
}

class ProgressBar extends Canvas {
    private int progress = 0;

    public void paint(Graphics g) {
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.BLUE);
        g.fillRect(0, 0, progress, getHeight());
    }

    public void increase() {
        if (progress < getWidth()) {
            progress += 10;
            repaint();
        }
    }
}
