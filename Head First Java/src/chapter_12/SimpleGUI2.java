package chapter_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGUI2 implements ActionListener {
	JFrame frame;
	public static void main (String[] args) {
		SimpleGUI2 gui = new SimpleGUI2();
		gui.go();
	}
	
	public void go() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton("Change colors");
		//Add the listener (this) to the button.
		button.addActionListener(this);
		MyDrawPanel drawPanel = new MyDrawPanel();
		//Add the two widgets (button and drawing panel) to the two regions of the frame.
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event) {
		//When the user clicks, tell the frame to repaint() itself. 
		//That means paintComponent() is called on every widget in the frame!
		frame.repaint();
	}
}