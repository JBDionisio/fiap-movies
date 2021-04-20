import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import components.FiapCheckBox;
import components.FiapComboBox;
import components.FiapLabel;
import components.FiapRadioGroup;
import components.FiapTextField;
import components.StarRater;
import listeners.ButtonListener;

public class App {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Fiap Movies");
		
		Container container = new Container();
		container.setLayout(new BorderLayout());
		
		JPanel leftPanel = new JPanel();
		JLabel movieImage = new JLabel(new ImageIcon("src/fiap.png"));
		movieImage.setPreferredSize(new Dimension(200, 200));
		leftPanel.add(movieImage);		
		
		JPanel middlePanel = new JPanel();
		middlePanel.add(new FiapLabel("Titulo", Color.BLACK, 12));
		FiapTextField titleField = new FiapTextField();
		middlePanel.add(titleField);
		
		middlePanel.add(new FiapLabel("Sinopse", Color.BLACK, 12));
		FiapTextField synopsisField = new FiapTextField();
		middlePanel.add(synopsisField);
		
		middlePanel.add(new FiapLabel("Gênero", Color.BLACK, 12));
	 	String[] genero = {"Ação", "Aventura", "Suspense"};
	 	FiapComboBox movieGenreComboBox = new FiapComboBox(genero);
	 	middlePanel.add(movieGenreComboBox);
	 	
	 	JButton saveButton = new JButton("Salvar");
		JButton cancelButton = new JButton("Cancelar");
		
		JPanel buttonsPanel = new JPanel();		
		buttonsPanel.setLayout(new GridLayout(1, 2));
		buttonsPanel.add(saveButton);
		buttonsPanel.add(cancelButton);
		
		middlePanel.add(buttonsPanel);
		middlePanel.setLayout(new GridLayout(10,1));
		
		JPanel rightPanel = new JPanel();	
		rightPanel.setLayout(new GridLayout(0, 1));
		rightPanel.add(new FiapLabel("Onde Assistir", Color.BLACK, 12));
				
		List<String> whereWatchList = new ArrayList<String>(); //Java8 ;(
		whereWatchList.add("Netflix");
		whereWatchList.add("Prime Video");
		whereWatchList.add("Pirate Bay");
		
		FiapRadioGroup whereWatchRadioGroup = new FiapRadioGroup(whereWatchList);
		rightPanel.add(whereWatchRadioGroup);
		whereWatchRadioGroup.setLayout(new GridLayout(4,1));
		
		FiapCheckBox alreadyWatchedCheckBox = new FiapCheckBox("Assistido");
		rightPanel.add(alreadyWatchedCheckBox);
		
		rightPanel.add(new FiapLabel("Avaliação", Color.BLACK, 12));
		StarRater movieAvaliation = new StarRater(5, 0f);
		rightPanel.add(movieAvaliation);
		
		saveButton.addActionListener(
				new ButtonListener(
						titleField,
						synopsisField,
						movieGenreComboBox,
						whereWatchRadioGroup,
						alreadyWatchedCheckBox,
						movieAvaliation						
						)
				);

		JTabbedPane abas = new JTabbedPane();
		abas.add("Cadastro", container);
		abas.add("Lista", new JPanel());
		
		container.add(leftPanel, BorderLayout.WEST);
		container.add(middlePanel, BorderLayout.CENTER);
		container.add(rightPanel, BorderLayout.EAST);

		frame.add(abas);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 400);
		frame.setVisible(true);
	}

}
