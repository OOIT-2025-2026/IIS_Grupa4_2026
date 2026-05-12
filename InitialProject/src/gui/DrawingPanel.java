package gui;

import java.awt.Graphics;

import javax.swing.JPanel;

import geometry.Circle;
import geometry.Point;

public class DrawingPanel extends JPanel {

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		Circle c = new Circle(new Point(200, 200), 50);
		c.draw(g);
		
		//Vezbe 7
		Point p1 = new Point(50,50);
		Point p2 = new Point(40,40);
		
		p1.draw(g);
		
		p1.moveTo(60, 60);
		p1.draw(g);
		
		p1.moveBy(60, 60);
		p1.draw(g);
		
		System.out.println(p1.compareTo(p2));
	}

}
