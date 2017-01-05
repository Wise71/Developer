package demo.tool;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel1 {
	public static void main(String[] args) {
		Panel1 gui = new Panel1();
		gui.go();
	}
	public void go() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	//JTextField text = new JTextField("¬ведите текст");
	//text.selectAll();
	//text.requestFocus();
	JButton button = new JButton("Shock me");
	JButton button2 = new JButton("Click me");
	panel.setBackground(Color.darkGray);
	//panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
	panel.add(button);
	panel.add(button2);
	//panel.add(text);
	frame.add(BorderLayout.EAST, panel);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setSize(500, 500);
	}
}
