package demo.tool;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class Bender {

	public static void main(String[] args) {
		Fry f = new Fry();
		f.setSize(300, 300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class Fry extends JFrame {
	private JTextField field1;
	private JTextField field2;
	private JTextField field3;
	private JPasswordField pass;
	
	public Fry() {
		super("Title window");
		setLayout(new FlowLayout());
		field1 = new JTextField(10);
		add(field1);
		field2 = new JTextField("Vvedite text");
		add(field2);
		field3 = new JTextField("Neredaktiruemoe pole", 20);
		field3.setEditable(false);
		add(field3);
		pass = new JPasswordField("My pass");
		add(pass);
		//Graphics.drawImage(myPic.jpg, 10, 10, this);
		Obrabotchik obrabotka = new Obrabotchik();
		field1.addActionListener(obrabotka);
		field2.addActionListener(obrabotka);
		field3.addActionListener(obrabotka);
		pass.addActionListener(obrabotka);
		
	}
	private class Obrabotchik implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			String string = "";
			if(event.getSource()==field1)
				string = String.format("Field 1: %s", event.getActionCommand());
			else if(event.getSource()==field2)
				string = String.format("Field 2: %s", event.getActionCommand());
			else if(event.getSource()==field3)
				string = String.format("Field 3: %s", event.getActionCommand());
			else if(event.getSource()==pass)
				string = String.format("Pole s parolem: %s", event.getActionCommand());
			JOptionPane.showMessageDialog(null, string);
		}
	}
}
