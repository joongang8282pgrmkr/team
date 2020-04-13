package test001;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Testjdbc001_2view extends JFrame
{
	public Testjdbc001_2view()
	{
		super();
		
	}
	
	public Testjdbc001_2view(Testjdbc001_1model_dto_vo_entity_bean dto)
	{
		super();
		init(dto);
		
	}

	private void init(Testjdbc001_1model_dto_vo_entity_bean dto)
	{
		CardLayout card = new CardLayout();
		setBounds(0, 0, 400, 400);
		setLayout(card);
		JPanel basepan = new JPanel();
		basepan.setLayout(card);
		add(basepan);
		JPanel pan1 = new JPanel();
		pan1(pan1, dto);
		add(pan1);
		basepan.add(pan1, "p1");
		card.show(basepan, "p1");
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
	private void pan1(JPanel pan1, Testjdbc001_1model_dto_vo_entity_bean dto)
	{
		dto.menubar = new JMenuBar();
		dto.menu = new JMenu("파일");
		JMenuItem item = new JMenuItem("열기");
		setJMenuBar(dto.menubar);
		dto.menubar.setName("메뉴바");
		dto.menubar.add(dto.menu,0);
		dto.menu.setName("메뉴0");
		dto.menu.add(item,0);
		JTextArea txtarea = new JTextArea();
		JScrollPane scrpan = new JScrollPane(txtarea);
		scrpan.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrpan.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		pan1.setBounds(0, 0, 400, 400);
		pan1.setLayout(new BorderLayout());
		pan1.add(scrpan, "Center");
	}
}
