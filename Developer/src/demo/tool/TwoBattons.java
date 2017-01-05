package demo.tool;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TwoBattons {
	JFrame frame;
	JLabel label;
	public static void main(String[] args) {
		TwoBattons gui = new TwoBattons();
		gui.go();
	}
	public void go() {
		frame = new JFrame();
		label = new JLabel("I'm a label");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton labelButton = new JButton("Change label");
		labelButton.addActionListener(new LabelListener());
		JButton colorBatton = new JButton("Change Circle");
		JButton vButton = new JButton("vButton");
		Font bigFont = new Font("serif", Font.BOLD, 28);
		vButton.setFont(bigFont);
		colorBatton.addActionListener(new ColorListener());
		
		MyDrawwPanel drawwPanel = new MyDrawwPanel();
		frame.getContentPane().add(BorderLayout.SOUTH, colorBatton);
		frame.getContentPane().add(BorderLayout.NORTH, vButton);
		frame.getContentPane().add(BorderLayout.CENTER, drawwPanel);
		frame.getContentPane().add(BorderLayout.EAST, labelButton);
		frame.getContentPane().add(BorderLayout.WEST, label);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
class LabelListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		label.setText("Ouch!");
	}
}
class ColorListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		frame.repaint();
	}
}
}
class MyDrawwPanel extends JPanel {
	public void paintComponent(Graphics gr) {
		gr.fillRect(0, 0, this.getWidth(), this.getHeight());
		int red = (int) (Math.random() * 255);
		int green = (int) (Math.random() * 255);
		int blue = (int) (Math.random() * 255);
		Color randomColor = new Color(red, green, blue);
		gr.setColor(randomColor);
		gr.fillOval(100, 100, 200, 200);
	}
}