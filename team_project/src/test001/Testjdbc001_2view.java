package test001;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;

import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SpringLayout.Constraints;

import javafx.scene.control.Separator;

@SuppressWarnings("serial")
public class Testjdbc001_2view extends JFrame
{
	Testjdbc001_1model_dto dto;
	
	public Testjdbc001_2view()
	{
		super();
		init();
		
	}

	private void init()
	{
		dto = new Testjdbc001_1model_dto();
		dto.card = new CardLayout();
		setBounds(0, 0, 400, 400);
		setLayout(dto.card);
		dto.basepan = new JPanel();
		dto.basepan.setLayout(dto.card);
		add(dto.basepan);
		dto.pan1 = new JPanel();
		pan1(dto.pan1);
		add(dto.pan1);
		dto.basepan.add(dto.pan1, "p1");
		dto.card.show(dto.basepan, "p1");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
	private void pan1(JPanel pan1)
	{
		dto.menubar = new JMenuBar();
		dto.separ = new JSeparator();
		dto.menu1 = new JMenu("파일");
		dto.item1 = new JMenuItem("열기");
		dto.item2 = new JMenuItem("저장");
		dto.item3 = new JMenuItem("닫기");
		setJMenuBar(dto.menubar);
//		dto.menubar.add(dto.menu1,0);
		dto.menubar.add(dto.menu1);
//		dto.menu1.add(dto.item1);
		dto.menu1.add(dto.item1,0);
//		dto.menu.addActionListener(new Mymenulistener());
//		dto.item.addActionListener(new Mymenulistener());
		dto.menu1.add(dto.item2,1);
		dto.menu1.add(dto.separ,2);
		dto.menu1.add(dto.item3,3);
		dto.txtarea = new JTextArea();
		dto.txtarea.setLineWrap(true);
		dto.scrpan = new JScrollPane(dto.txtarea);
//		dto.scrpan.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		dto.scrpan.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		pan1.setBounds(0, 0, 400, 400);
		pan1.setLayout(new BorderLayout());
		pan1.add(dto.scrpan, "Center");
	}
}
