import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class Painting extends Canvas
	{
		public void paint(Graphics g)
		{	
			//head
			g.setColor(Color.yellow);
			g.fillOval(225, 200, 300, 300);
			
			//body
			g.setColor(Color.black);
			g.drawLine(375, 500, 375, 700);
			//legs
			g.drawLine(375, 700, 300, 800);
			g.drawLine(375, 700, 450, 800);
			//arms
			g.drawLine(375, 580, 300, 500);
			g.drawLine(375, 580, 450, 500);
			//eyes
			g.fillOval(280, 270, 50, 50);
			g.fillOval(420, 270, 50, 50);
			g.setColor(Color.WHITE);
			g.fillOval(280, 272, 35, 35);
			g.fillOval(420, 272, 35, 35);
			//mouth
			g.setColor(Color.BLACK);
			g.drawArc(45, 50, 50, 50, 225, 90);
			g.drawLine(52, 92, 88, 92);
//			g.setFont(new Font("Bold", Font.PLAIN, 20));
//			g.setColor(Color.BLACK);
//			g.drawString("Sup", 150, 50);
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
