package test001;

public class Testjdbc001_3controller__setting
{		
	Testjdbc001_3controller_Mymenulistener mlstn;
	Testjdbc001_2view view;
	public Testjdbc001_3controller__setting()
	{
		mlstn = new Testjdbc001_3controller_Mymenulistener();
		view = new Testjdbc001_2view();
		view.dto.menubar.getMenu(0).getItem(0).addActionListener(mlstn);
		view.dto.menubar.getMenu(0).getItem(1).addActionListener(mlstn);
		view.dto.menubar.getMenu(0).getItem(3).addActionListener(mlstn);
	}

}
