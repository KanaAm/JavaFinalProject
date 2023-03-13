package com.github.kanaam.panel;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import com.github.kanaam.AnimeRegister;
import com.github.kanaam.models.Anime;
import com.github.kanaam.models.Platform;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homepage extends JFrame {

	private final JPanel contentPane;
	private final JTextField textField;

	/**
	 * Create the frame.
	 */
	public Homepage() {
		setResizable(false);
		setTitle("ANIME SEARCHING PROGRAM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		final JLabel lblREGISTER = new JLabel("ANIME SEARCHING");
		lblREGISTER.setBackground(new Color(0, 0, 0));
		lblREGISTER.setBounds(170, 53, 581, 72);
		lblREGISTER.setForeground(new Color(255, 255, 255));
		lblREGISTER.setHorizontalAlignment(SwingConstants.CENTER);
		lblREGISTER.setFont(new Font("ZoodRangmah3.1", Font.BOLD, 50));
		contentPane.add(lblREGISTER);
		JButton Search = new JButton("Search");
		Search.setBounds(410, 338, 95, 39);
		Search.setFont(new Font("Tahoma", Font.PLAIN, 10));
		

		contentPane.add(Search);
		JLabel lblProgram = new JLabel("PROGRAM");
		lblProgram.setHorizontalAlignment(SwingConstants.CENTER);
		lblProgram.setForeground(Color.WHITE);
		lblProgram.setFont(new Font("ZoodRangmah3.1", Font.BOLD, 30));
		lblProgram.setBackground(Color.BLACK);
		lblProgram.setBounds(170, 123, 581, 72);
		contentPane.add(lblProgram);


		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 45, 886, 150);
		contentPane.add(panel_1);
		textField = new JTextField();
		textField.setBounds(318, 260, 278, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		Search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String toSearch = textField.getText().toLowerCase();
				Anime anime = AnimeRegister.getByName(toSearch);
				if(anime == null) {
					JOptionPane.showMessageDialog(null,"We don't have this anime in our data", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				SearchPage searchPage = new SearchPage(anime);
				searchPage.setLocation(getLocation());
				dispose();
				searchPage.setVisible(true);
				System.out.println(anime.getDetails());
			}
		});
	}
}