package test001;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Testjdbc001_3controller_Mymenulistener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();
		if(cmd=="¿­±â") {
			System.out.println("¿­±â¸¦ ´­·¶´Ù");
		}else if(cmd=="ÀúÀå"){
			System.out.println("ÀúÀåÀ» ´­·¶´Ù");
		}else {
			System.out.println("´Ý±â¸¦ ´­·¶´Ù");
			System.exit(0);
		}

	}
}
