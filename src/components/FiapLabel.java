package components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;

public class FiapLabel extends JLabel {
	private static final long serialVersionUID = 1L;

	private int size = 20;
	private Color color = new Color(255, 255, 255);

	public FiapLabel(String text) {
		super(text);
		init();
	}
	
	public FiapLabel(String text, Color color) {
		super(text);
		this.color = color;
		init();
	}

	public FiapLabel(String text, Color color, int size) {
		super(text);
		this.size = size;
		this.color = color;
		init();
	}

	private void init() {
		this.setForeground(color);
		this.setPreferredSize(new Dimension(150, 20));
		this.setFont(new Font(null, Font.BOLD, size));
	}
}