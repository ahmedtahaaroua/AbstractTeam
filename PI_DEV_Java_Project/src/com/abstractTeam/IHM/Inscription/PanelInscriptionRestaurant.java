package com.abstractTeam.IHM.Inscription;



import java.awt.Color;
import java.awt.Font;


import javax.swing.ImageIcon;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class PanelInscriptionRestaurant extends JPanel {


	JLabel lblNewLabel_1 = new JLabel("");
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Create the panel.
	 */
	public PanelInscriptionRestaurant() {
		setBackground(Color.WHITE);
		
		setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2,
				(Color) new Color(192, 192, 192)),
				"Inscription  - Resto-Tunisie -", TitledBorder.LEADING,
				TitledBorder.TOP, new Font(" Arial ", Font.BOLD, 15),
				Color.DARK_GRAY));
		setBounds(337, 76, 1013, 611);

		setLayout(null);
		setVisible(true);
		lblNewLabel_1.setBounds(330, 221, 419, 120);
		
	
		add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 23, 993, 577);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nom :");
		lblNewLabel.setBounds(20, 23, 46, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(212, 20, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Prenom :");
		lblNewLabel_2.setBounds(20, 81, 46, 14);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(212, 78, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Mail :");
		lblNewLabel_3.setBounds(20, 134, 46, 14);
		panel.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(212, 131, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Mot de passe :");
		lblNewLabel_4.setBounds(20, 191, 94, 20);
		panel.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(212, 191, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Confirme mot de passe :");
		lblNewLabel_5.setBounds(20, 248, 129, 14);
		panel.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(212, 242, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Tel :");
		lblNewLabel_6.setBounds(20, 306, 80, 14);
		panel.add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(212, 300, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Fax :");
		lblNewLabel_7.setBounds(20, 361, 46, 20);
		panel.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(212, 361, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Adresse :");
		lblNewLabel_8.setBounds(20, 414, 46, 14);
		panel.add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(212, 411, 129, 88);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton = new JButton("Cree cmpte");
		btnNewButton.setBounds(300, 527, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblConnection = new JLabel("Connection");
		lblConnection.setBounds(20, 485, 67, 14);
		panel.add(lblConnection);
		
		JLabel lblMotDePasse = new JLabel("mot de passe oubli\u00E9");
		lblMotDePasse.setBounds(20, 518, 118, 14);
		panel.add(lblMotDePasse);
		
		
	}
}
