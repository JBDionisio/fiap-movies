package components;

import java.util.Enumeration;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class FiapRadioGroup extends JPanel {
	
	private static final long serialVersionUID = 1L;

	private ButtonGroup group = new ButtonGroup();
	private List<String> options;
	
	public FiapRadioGroup(List<String> options) {
		this.options = options;
		init();	
	}

	private void init() {
		options.forEach(option -> {
			JRadioButton bt = new JRadioButton(option);
			group.add(bt);
			this.add(bt);
		});
	}
	
	public String getSelectedButtonText() {
        for (Enumeration<AbstractButton> bts = group.getElements(); bts.hasMoreElements();) {
            AbstractButton button = bts.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return "";
    }
		
}