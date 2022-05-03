package view;

import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CharacterScreen {

	private JFrame window;
	private JTextField scoreField = new JTextField("0");

	public CharacterScreen(JFrame window) {
		this.window = window;
	}

	public void init() {
		Container cp = window.getContentPane();

		JButton startButton = new JButton("Roll Stats");
		JButton quitButton = new JButton("Quit");
		startButton.setFocusable(false);
		quitButton.setFocusable(false);

		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(1, 1));
		northPanel.add(new JLabel("Score: ", SwingConstants.RIGHT));
		northPanel.add(scoreField);
		scoreField.setFocusable(false);

		cp.add(BorderLayout.NORTH, northPanel);

		JPanel southPanel = new JPanel();
		southPanel.add(startButton);
		southPanel.add(quitButton);
		cp.add(BorderLayout.SOUTH, southPanel);

		quitButton.addActionListener(event -> System.exit(0));

	}

}