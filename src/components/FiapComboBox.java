package components;

import java.awt.Dimension;

import javax.swing.JComboBox;

public class FiapComboBox extends JComboBox<String> {

	private static final long serialVersionUID = 1L;
	
	public FiapComboBox(String[] text) {
		super(text);
		init();
	}

	private void init() {
		this.setPreferredSize(new Dimension(190, 20));
	}
}
