package demo.tool;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dick {
	public static void main(String[]args){
		Reader r = new Reader("My program");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(300, 200);
		r.setResizable(false);
		r.setLocationRelativeTo(null);
		JOptionPane.showMessageDialog(null, "Приветствие", "Название окна", JOptionPane.PLAIN_MESSAGE);
	}
}

class Reader extends JFrame{
	JButton b1, b2;
	JLabel l1, l2, l3, l4;
	JTextField t1, t2;
	int i, k;
	String a, b;
	eHandler handler = new eHandler();
	
	public Reader(String s){
		super(s);
		setLayout(new FlowLayout());
		b1 = new JButton("Очистить");
		b2 = new JButton("Сосчитать");
		l1 = new JLabel("Введите первое число:");
		l2 = new JLabel("Введите второе число:");
		l3 = new JLabel("");
		l4 = new JLabel("");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		add(b1);
		add(b2);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(l4);
		b2.addActionListener(handler);
		b1.addActionListener(handler);
	}
	
	public class eHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			try{	
				if(e.getSource()==b2){
					i = Integer.parseInt(t1.getText());
					k = Integer.parseInt(t2.getText());
					i++;
					k++;
					a = "Ваше первое число теперь равно " + i;
					b = "Ваше второе число теперь равно " + k;
					l3.setText(a);
					l4.setText(b);
				}
				
				if(e.getSource()==b1){
					t1.setText(null);
					t2.setText(null);
					l3.setText("");
					l4.setText("");
				}
			}catch (Exception ex){ JOptionPane.showMessageDialog(null, "Введите в поле число"); }
		}
		
	}
}
