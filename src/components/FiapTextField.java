package components;

import java.awt.Dimension;

import javax.swing.JTextField;

import style.BorderFactory;

public class FiapTextField extends JTextField {

	private static final long serialVersionUID = 1L;
	
	public FiapTextField() {
		super();
		init();
	}

	private void init() {
		this.setPreferredSize(new Dimension(180,20));
		this.setBorder(BorderFactory.create());
	}

}