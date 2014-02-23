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
	private JTextField textNom;
	private JTextField textPrenom;
	private JTextField textMail;
	private JTextField textMDP;
	private JTextField textConfirmMDP;
	private JTextField textTel;
	private JTextField textFax;
	private JTextField textAddresse;

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
		
		JPanel panelConnection = new JPanel();
		panelConnection.setBounds(10, 23, 993, 577);
		add(panelConnection);
		panelConnection.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nom :");
		lblNewLabel.setBounds(20, 23, 46, 14);
		panelConnection.add(lblNewLabel);
		
		textNom = new JTextField();
		textNom.setBounds(212, 20, 86, 20);
		panelConnection.add(textNom);
		textNom.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Prenom :");
		lblNewLabel_2.setBounds(20, 81, 46, 14);
		panelConnection.add(lblNewLabel_2);
		
		textPrenom = new JTextField();
		textPrenom.setBounds(212, 78, 86, 20);
		panelConnection.add(textPrenom);
		textPrenom.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Mail :");
		lblNewLabel_3.setBounds(20, 134, 46, 14);
		panelConnection.add(lblNewLabel_3);
		
		textMail = new JTextField();
		textMail.setBounds(212, 131, 86, 20);
		panelConnection.add(textMail);
		textMail.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Mot de passe :");
		lblNewLabel_4.setBounds(20, 191, 94, 20);
		panelConnection.add(lblNewLabel_4);
		
		textMDP = new JTextField();
		textMDP.setBounds(212, 191, 86, 20);
		panelConnection.add(textMDP);
		textMDP.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Confirme mot de passe :");
		lblNewLabel_5.setBounds(20, 248, 129, 14);
		panelConnection.add(lblNewLabel_5);
		
		textConfirmMDP = new JTextField();
		textConfirmMDP.setBounds(212, 242, 86, 20);
		panelConnection.add(textConfirmMDP);
		textConfirmMDP.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Tel :");
		lblNewLabel_6.setBounds(20, 306, 80, 14);
		panelConnection.add(lblNewLabel_6);
		
		textTel = new JTextField();
		textTel.setBounds(212, 300, 86, 20);
		panelConnection.add(textTel);
		textTel.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Fax :");
		lblNewLabel_7.setBounds(20, 361, 46, 20);
		panelConnection.add(lblNewLabel_7);
		
		textFax = new JTextField();
		textFax.setBounds(212, 361, 86, 20);
		panelConnection.add(textFax);
		textFax.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Adresse :");
		lblNewLabel_8.setBounds(20, 414, 46, 14);
		panelConnection.add(lblNewLabel_8);
		
		textAddresse = new JTextField();
		textAddresse.setBounds(212, 428, 129, 88);
		panelConnection.add(textAddresse);
		textAddresse.setColumns(10);
		
		JButton btnCreeCompte = new JButton("Cree cmpte");
		btnCreeCompte.setBounds(300, 527, 89, 23);
		panelConnection.add(btnCreeCompte);
		
		JLabel lblConnection = new JLabel("Connection");
		lblConnection.setBounds(20, 485, 67, 14);
		panelConnection.add(lblConnection);
		
		JLabel PanelMDPoublié = new JLabel("mot de passe oubli\u00E9");
		PanelMDPoublié.setBounds(20, 518, 118, 14);
		panelConnection.add(PanelMDPoublié);
		
		
	}
}
