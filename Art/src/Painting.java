import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class Painting extends Canvas
	{
		public void paint(Graphics g)
		{	
			//head
			g.setColor(Color.yellow);
			g.fillOval(225, 190, 300, 300);			
			//body
			g.setColor(Color.black);
			g.drawLine(375, 490, 375, 690);
			//legs
			g.drawLine(375, 690, 290, 790);
			g.drawLine(375, 690, 460, 790);
			//arms
			g.drawLine(375, 550, 290, 500);
			g.drawLine(375, 550, 460, 500);
			//eyes
			g.fillOval(280, 270, 50, 50);
			g.fillOval(420, 270, 50, 50);
			g.setColor(Color.WHITE);
			g.fillOval(280, 272, 35, 35);
			g.fillOval(420, 272, 35, 35);
			//mouth
			g.setColor(Color.PINK);
			g.fillArc(300, 335, 150, 130, 0, -180);
			//hat
			g.setColor(Color.BLACK);
			g.fillRect(250, 190, 250, 10);
			g.fillRect(285, 20, 180, 170);
			//teeth
			g.setColor(Color.white);
			g.fillRect(325, 400, 40, 40);
			g.fillRect(385, 400, 40, 40);
			
		}
		
		
		public static void main(String[] args)
			{
				JFrame jf = new JFrame("Painting");
				Painting p = new Painting();
				jf.setSize(800, 1000);
				jf.setVisible(true);
				jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jf.add(p);
			}

	}
