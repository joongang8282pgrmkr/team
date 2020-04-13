package test001;

import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class Testjdbc001_1model_dto_vo_entity_bean
{
	JMenuBar menubar;
	JMenu menu;
	
	public Testjdbc001_1model_dto_vo_entity_bean()
	{
		super();
	}

	public Testjdbc001_1model_dto_vo_entity_bean(JMenuBar menubar, JMenu menu)
	{
		super();
		this.menubar = menubar;
		this.menu = menu;
	}

	public JMenu getMenu()
	{
		return menu;
	}

	public void setMenu(JMenu menu)
	{
		this.menu = menu;
	}

	public JMenuBar getMenubar()
	{
		return menubar;
	}

	public void setMenubar(JMenuBar menubar)
	{
		this.menubar = menubar;
	}
	
	
}
