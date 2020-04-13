package team_project_java_basic;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class TestCrd001 extends JFrame implements ActionListener
{
	JPanel pan0, pan1, pan2;
	JButton jb1, jb2;
	CardLayout card;
	
	public TestCrd001()
	{
		super();
		init();
	}
	
	private void init() {
		card = new CardLayout();
		setLayout(card);
		setBounds(0,0,400,400);
		pan0 = new JPanel(card);
		pan1 = new JPanel();
		pan2 = new JPanel();
		pan0();
		pan1();
		pan2();
		add(pan0);
		add(pan1);
		add(pan2);
		pan0.add(pan1, "no1");
		pan0.add(pan2, "no2");
		card.show(pan0, "no1");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
	}
	
	private void pan2()
	{
		jb2 = new JButton("버튼2");
		pan2.add(jb2);
	}

	private void pan1()
	{
		jb1 = new JButton("버튼1");
		pan1.add(jb1);
	}

	private void pan0()
	{
		setBounds(0,0,400,400);
		
	}

	public static void main(String[] args)
	{
		new TestCrd001();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==jb1) {
			card.show(pan0, "no2");
		}
		if(e.getSource()==jb2) {
			card.show(pan0, "no1");
		}
		
	}
}
