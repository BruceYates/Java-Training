package chapter_12;

import java.awt.*;
import javax.swing.*;

public class MyDrawPanel extends JPanel {
	
	//It's really a Graphics2D object masquerading as a mere Graphics object.
	//The drawing panel's paintComponent() method is called every time the user clicks.
	public void paintComponent(Graphics g) {
		//Cast it so we can call something that Graphics2D has but Graphics doesn't.
		Graphics2D g2d = (Graphics2D) g;
		
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		Color startColor = new Color(red, green, blue);
		
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
		Color endColor = new Color(red, green, blue);
		
		GradientPaint gradient = new GradientPaint(70,70,startColor, 150,150, endColor);
		//This sets the virtual paint brush to a gradient instead of a solid color.
		g2d.setPaint(gradient);
		//The fillOval() method really means "fill the oval with whatever is loaded on your paintbrush (i.e. the gradient)".
		g2d.fillOval(70,70,100,100);
	}
}
