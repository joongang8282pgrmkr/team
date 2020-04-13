package test001;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Testjdbc001_3controller implements ActionListener
{
	Testjdbc001_1model_dto_vo_entity_bean dto;
	
	public Testjdbc001_3controller()
	{
		super();
	}
	
	public Testjdbc001_3controller(Testjdbc001_1model_dto_vo_entity_bean dto)
	{
		super();
		new Testjdbc001_2view(dto);
		this.dto = dto;
		System.out.println(dto.menubar.getMenu(0).getText());
		System.out.println(dto.menubar.getMenu(0).getItem(0).getText());
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==dto.menubar) {
			System.out.println("¸Þ´º0");
		}
	}

}
