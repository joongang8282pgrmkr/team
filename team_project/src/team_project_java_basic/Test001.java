package team_project_java_basic;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Test001 extends JFrame
{
	public Test001(String title)
	{
		super(title);
		init();
	}

	private void init()
	{
		setBounds(0, 0, 400, 400);
		
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("파일");
		JMenuItem item = new JMenuItem("열기");
		menu.add(item);
		menubar.add(menu);
		setJMenuBar(menubar);
		JTextArea txtarea = new JTextArea();
		JScrollPane scrpan = new JScrollPane(txtarea);
		scrpan.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrpan.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		getContentPane().add(scrpan, "Center");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args)
	{
		new Test001("메모장");
	}
}
