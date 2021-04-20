package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import components.FiapCheckBox;
import components.FiapComboBox;
import components.FiapRadioGroup;
import components.FiapTextField;
import components.StarRater;
import models.MovieRegister;

public class ButtonListener implements ActionListener {

	private FiapTextField titleField;
	private FiapTextField synopsisField;
	private FiapComboBox movieGenreComboBox;
	private FiapRadioGroup whereWatchRadioGroup;
	private FiapCheckBox alreadyWatchedCheckBox;
	private StarRater movieAvaliation;

	public ButtonListener(
			FiapTextField titleField,
			FiapTextField synopsisField,
			FiapComboBox movieGenreComboBox,
			FiapRadioGroup whereWatchRadioGroup,
			FiapCheckBox alreadyWatchedCheckBox,
			StarRater movieAvaliation
	) {
		this.titleField = titleField;
		this.synopsisField = synopsisField;
		this.movieGenreComboBox = movieGenreComboBox;
		this.whereWatchRadioGroup = whereWatchRadioGroup;
		this.alreadyWatchedCheckBox = alreadyWatchedCheckBox;
		this.movieAvaliation = movieAvaliation;
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		MovieRegister register = new MovieRegister(
				titleField.getText(),
				synopsisField.getText(),
				movieGenreComboBox.getItemAt(movieGenreComboBox.getSelectedIndex()),
				whereWatchRadioGroup.getSelectedButtonText(),
				alreadyWatchedCheckBox.isSelected(),
				movieAvaliation.getSelection()
				);
		
		System.out.println(register.toString());
	}
}