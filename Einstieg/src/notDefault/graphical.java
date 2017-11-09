package notDefault;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class graphical extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	public graphical() {
		this.setSize(500, 500);
		this.setBackground(Color.WHITE);
		
		JFrame f = new JFrame("wallaaaaa");
		f.setUndecorated(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 500);
		f.add(this);
		f.setVisible(true);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawLine(0, 0, 499, 0);
		g.drawLine(0, 0, 0, 499);
		g.drawLine(0, 499, 499, 499);
		g.drawLine(499, 0, 499, 499);
	}
	
}
