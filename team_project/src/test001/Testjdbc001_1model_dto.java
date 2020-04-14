package test001;

import java.awt.CardLayout;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;

public class Testjdbc001_1model_dto {

	JMenuBar menubar;
	JMenu menu1;
	JMenuItem item1, item2, item3;
	JScrollPane scrpan;
	JTextArea txtarea;
	CardLayout card;
	JPanel basepan, pan1;
	JSeparator separ;

	public JMenuBar getMenubar() {
		return menubar;
	}

	public void setMenubar(JMenuBar menubar) {
		this.menubar = menubar;
	}

	public JMenu getMenu1() {
		return menu1;
	}

	public void setMenu1(JMenu menu1) {
		this.menu1 = menu1;
	}

	public JMenuItem getItem1() {
		return item1;
	}

	public void setItem1(JMenuItem item1) {
		this.item1 = item1;
	}

	public JMenuItem getItem2() {
		return item2;
	}

	public void setItem2(JMenuItem item2) {
		this.item2 = item2;
	}

	public JMenuItem getItem3() {
		return item3;
	}

	public void setItem3(JMenuItem item3) {
		this.item3 = item3;
	}

	public JSeparator getSepar() {
		return separ;
	}

	public void setSepar(JSeparator separ) {
		this.separ = separ;
	}

	public JScrollPane getScrpan() {
		return scrpan;
	}

	public void setScrpan(JScrollPane scrpan) {
		this.scrpan = scrpan;
	}

	public JTextArea getTxtarea() {
		return txtarea;
	}

	public void setTxtarea(JTextArea txtarea) {
		this.txtarea = txtarea;
	}

	public CardLayout getCard() {
		return card;
	}

	public void setCard(CardLayout card) {
		this.card = card;
	}

	public JPanel getBasepan() {
		return basepan;
	}

	public void setBasepan(JPanel basepan) {
		this.basepan = basepan;
	}

	public JPanel getPan1() {
		return pan1;
	}

	public void setPan1(JPanel pan1) {
		this.pan1 = pan1;
	}

}
