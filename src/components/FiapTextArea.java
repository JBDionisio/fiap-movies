package components;

import javax.swing.JTextArea;

import style.BorderFactory;

public class FiapTextArea extends JTextArea {
	private static final long serialVersionUID = 1L;

	private int rows = 10;
	private int columns = 30;

	public FiapTextArea() {
		super();
		init();
	}

	public FiapTextArea(int rows, int columns) {
		super();
		this.rows = rows;
		this.columns = columns;

		init();
	}

	private void init() {
		this.setRows(rows);
		this.setColumns(columns);
		this.setBorder(BorderFactory.create());
	}
}