package com.abstractTeam.IHM;



import java.awt.Color;
import java.awt.Font;


import javax.swing.ImageIcon;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelStatistiqueRestaurant extends JPanel {
	private JTextField txtDddddddddddddddddddddd;

	/**
	 * Create the panel.
	 */
	public PanelStatistiqueRestaurant() {
		setBackground(Color.WHITE);
		
		setBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2,
				(Color) new Color(192, 192, 192)),
				"Statistique  - Resto-Tunisie -", TitledBorder.LEADING,
				TitledBorder.TOP, new Font(" Arial ", Font.BOLD, 15),
				Color.DARK_GRAY));
		setBounds(337, 76, 1013, 611);

		setLayout(null);
		
		txtDddddddddddddddddddddd = new JTextField();
		txtDddddddddddddddddddddd.setText("dddddddddddddddddddddd\r\n");
		txtDddddddddddddddddddddd.setBounds(151, 155, 371, 20);
		add(txtDddddddddddddddddddddd);
		txtDddddddddddddddddddddd.setColumns(10);
		setVisible(true);
		
		
	}
}
