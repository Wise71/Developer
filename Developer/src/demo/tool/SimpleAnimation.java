package demo.tool;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimpleAnimation {
	int x = 70;
	int y = 70;
	public static void main(String[] args) {
		SimpleAnimation gui = new SimpleAnimation();
		gui.go();
	}
	public void go() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDrawwPanel drawwPanel = new MyDrawwPanel();
		frame.getContentPane().add(drawwPanel);
		frame.setSize(500, 500);
		frame.setVisible(true);
		for(int i = 0; i < 230; i++) {
			x++;
			y++;
			drawwPanel.repaint();
			
			try{
				Thread.sleep(50);
			} catch(Exception ex){}
		}
	}
	class MyDrawwPanel extends JPanel {
		public void paintComponent(Graphics gr) {
		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		Color randomColor = new Color(red, green, blue);
		Color randomColor2 = new Color(green, red, blue);
		gr.setColor(randomColor2);
		gr.fillRect(0, 0, this.getWidth(), this.getHeight());
		gr.setColor(randomColor);
		gr.fillOval(x, y, 40, 40);
		}
	}
}
