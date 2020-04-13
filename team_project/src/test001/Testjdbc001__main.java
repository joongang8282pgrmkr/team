package test001;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Testjdbc001__main extends JFrame
{
	Testjdbc001_1model_dto_vo_entity_bean dto;
	
	public Testjdbc001__main()
	{
		super();
		dto = new Testjdbc001_1model_dto_vo_entity_bean();
		new Testjdbc001_3controller(dto);
	}
	public static void main(String[] args)
	{
		new Testjdbc001__main();
	}
}
/*
 * 
 */