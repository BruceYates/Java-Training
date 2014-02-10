package chapter_12;

import javax.swing.*;
//A new import statement for the package that ActionListener and ActionEvent are in.
import java.awt.event.*;

//Implement the interface. This says, "an instance of SimpleGui1 IS-A ActionListener”.
//(The button will give events only to ActionListener implementers).
public class SimpleGUI1 implements ActionListener {
	JButton button;
	
	public static void main (String[] args) {
		SimpleGUI1 gui = new SimpleGUI1();
		gui.go();
	}
	
	public void go() {
		JFrame frame = new JFrame();
		button = new JButton("click me");
		
		//Register your interest with the button. This says	to the button, “Add me to your list of listeners”.
		//The argument you pass MUST be an object from a class that implements ActionListener!!
		button.addActionListener(this);
		
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(button);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	
	//Implement the ActionListener interface’s actionPerformed() method.. This is the actual event-handling method!
	//The button calls this method to let you know an event happened. It sends you an ActionEvent object as the
	//argument, but we don’t need it. Knowing the event happened is enough info for us.
	public void actionPerformed(ActionEvent event) {
		button.setText("I've been clicked!");
	}
}