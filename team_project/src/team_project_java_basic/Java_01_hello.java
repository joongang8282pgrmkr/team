package team_project_java_basic;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
 
@SuppressWarnings("serial")
public class Java_01_hello extends JFrame implements ActionListener{
	private JButton e,w,c,s,n;
	public Java_01_hello() {
		setLayout(new BorderLayout());
		setLocation(0, 0);
		setBounds(0, 0, 400, 400);
		init();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private void init() {
		e = new JButton("East");
		w = new JButton("West");
		c = new JButton("Center");
		s = new JButton("South");
		n = new JButton("North");
		add(e, "East");
		add(w, "West");
		add(c, "Center");
		add(s, "South");
		add(n, "North");
		e.addActionListener(this);
		w.addActionListener(this);
		c.addActionListener(this);
		s.addActionListener(this);
		n.addActionListener(this);
	}
	
	
	
	public static void main(String[] args) {
		new Java_01_hello();
		
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource()==e) {
			JOptionPane.showMessageDialog(e, "동쪽");
			System.out.println("Java says Hello to east area");
		}
		if(event.getSource()==w) {
			JOptionPane.showMessageDialog(w, "서쪽");
			System.out.println("Java says Hello to west area");
		}
		if(event.getSource()==c) {
			JOptionPane.showMessageDialog(c, "중앙");
			System.out.println("Java says Hello to center area");
		}
		if(event.getSource()==s) {
			JOptionPane.showMessageDialog(s, "남쪽");
			System.out.println("Java says Hello to south area");
		}
		if(event.getSource()==n) {
			JOptionPane.showMessageDialog(n, "북쪽");
			System.out.println("Java says Hello to north area");
		}
		
	}  
}
