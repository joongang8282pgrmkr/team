package test001;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Testjdbc001_3controller_Mymenulistener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String cmd = e.getActionCommand();
		if(cmd=="����") {
			System.out.println("���⸦ ������");
		}else if(cmd=="����"){
			System.out.println("������ ������");
		}else {
			System.out.println("�ݱ⸦ ������");
			System.exit(0);
		}

	}
}
