import java.awt.Canvas;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.*;

public class SampleClass extends MouseMotionAdapter {
	JFrame f;

	public static void main(String[] args) {
		new SampleClass();
	}

	SampleClass() {
		f = new JFrame("Mouse Motion Adapter");

		// Register frame with some listener
		f.addMouseMotionListener(this);

		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	//this method is always called whenever we drag the mouse
	public void mouseDragged(MouseEvent e) {
		Graphics g = f.getGraphics();
		g.setColor(Color.RED);
		g.fillRect(e.getX(), e.getY(), 5, 5);
	}

}