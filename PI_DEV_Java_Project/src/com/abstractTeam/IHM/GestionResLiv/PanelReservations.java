package com.abstractTeam.IHM.GestionResLiv;



import java.awt.Color;
import java.awt.Font;


import javax.swing.ImageIcon;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class PanelReservations extends JPanel {


	JLabel lblNewLabel_1 = new JLabel("");

	/**
	 * Create the panel.
	 */
	public PanelReservations() {
		setBackground(Color.WHITE);
		
		setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2,
				(Color) new Color(192, 192, 192)),
				"Gestion Reservations  - Resto-Tunisie -", TitledBorder.LEADING,
				TitledBorder.TOP, new Font(" Arial ", Font.BOLD, 15),
				Color.DARK_GRAY));
		setBounds(337, 76, 1013, 611);

		setLayout(null);
		setVisible(true);
		lblNewLabel_1.setBounds(330, 221, 419, 120);
		
	
		add(lblNewLabel_1);
		
		
	}

}
