package com.abstractTeam.IHM;


import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class PanelLeftTop extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelLeftTop() {
		setBackground(Color.WHITE);

		setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2,
				(Color) new Color(192, 192, 192)), "Accueil",
				TitledBorder.LEFT, TitledBorder.TOP, new Font(" Arial ",
						Font.BOLD, 15), new Color(64, 64, 64)));
		setBounds(0, 75, 337, 301);
		setLayout(null);
		JLabel lblVousPouvezAccder = new JLabel(
				"<html>Bienvenue à votre espace personnel dans Resto - Tunisie </html>");
		lblVousPouvezAccder.setHorizontalAlignment(SwingConstants.LEFT);
		lblVousPouvezAccder.setVerticalAlignment(SwingConstants.TOP);
		lblVousPouvezAccder.setBounds(10, 68, 283, 47);

		add(lblVousPouvezAccder);

		JLabel lblInformationsDu = new JLabel(
				"<html><u>Informations du compte : </u></html>");
		lblInformationsDu.setBounds(10, 197, 180, 14);
		add(lblInformationsDu);

		JLabel lblNewLabel = new JLabel("");
		
		lblNewLabel.setBounds(207, 93, 46, 32);
		add(lblNewLabel);

		JLabel lblLogin = new JLabel("Login :");
		lblLogin.setBounds(10, 222, 46, 14);
		add(lblLogin);
		
		

		JLabel label_loginText = new JLabel("");
		label_loginText.setText("ddddddd");
		label_loginText.setBounds(106, 222, 108, 14);
		add(label_loginText);

		JLabel label_nomText = new JLabel("");
		label_nomText.setBounds(106, 230, 46, 14);
		add(label_nomText);

		JLabel label_EspaceText = new JLabel("");
		label_EspaceText.setBounds(107, 255, 46, 14);
		add(label_EspaceText);

		JLabel lblNom = new JLabel("Type compte :");
		lblNom.setBounds(10, 247, 102, 14);
		add(lblNom);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setText("dddddddd");
		lblNewLabel_2.setBounds(104, 247, 171, 14);
		add(lblNewLabel_2);
		
		JButton btnSeDconnecter = new JButton("se d\u00E9connecter");
		btnSeDconnecter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
				
			}
		});
		
		btnSeDconnecter.setBounds(176, 21, 151, 23);
		add(btnSeDconnecter);
		setVisible(true);
	}
}
