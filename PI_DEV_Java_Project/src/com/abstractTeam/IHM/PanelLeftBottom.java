package com.abstractTeam.IHM;



import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import com.abstractTeam.IHM.GestionResLiv.PanelLivraison;
import com.abstractTeam.IHM.GestionResLiv.PanelReservations;

@SuppressWarnings("serial")
public class PanelLeftBottom extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelLeftBottom() {
		setBackground(Color.WHITE);

		JButton btnAccueil = new JButton("Accueil");
		btnAccueil.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAccueil.setHorizontalAlignment(SwingConstants.LEFT);
		
		btnAccueil.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {

			
			}
		});

		setBorder(new MatteBorder(1, 1, 1, 2, (Color) Color.LIGHT_GRAY));

		btnAccueil.setBounds(10, 62, 317, 36);
		setBounds(0, 376, 337, 316);

		setLayout(null);
		add(btnAccueil);

		JButton btnListes = new JButton("Mes Restaurants");
		btnListes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			
				
			}
		});
		btnListes.setFont(new Font("Tahoma", Font.PLAIN, 15));
	
		btnListes.setHorizontalAlignment(SwingConstants.LEFT);
		btnListes.setBounds(10, 109, 317, 36);
		add(btnListes);
		JButton btnRegles = new JButton("Gestion réservations");
		btnRegles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ApplicationFrame.content.remove(ApplicationFrame.panelContenu);
				ApplicationFrame.panelContenu= new PanelReservations();
				ApplicationFrame.content.add(ApplicationFrame.panelContenu);
				ApplicationFrame.content.validate();
				ApplicationFrame.content.repaint();
			
			}
		});
		btnRegles.setFont(new Font("Tahoma", Font.PLAIN, 15));
	
		btnRegles.setHorizontalAlignment(SwingConstants.LEFT);
		btnRegles.setBounds(10, 156, 317, 36);
		add(btnRegles);

		JButton btnMesDocuments = new JButton("Gestion Livraison");
		btnMesDocuments.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ApplicationFrame.content.remove(ApplicationFrame.panelContenu);
				ApplicationFrame.panelContenu= new PanelLivraison();
				ApplicationFrame.content.add(ApplicationFrame.panelContenu);
				ApplicationFrame.content.validate();
				ApplicationFrame.content.repaint();

			}
		});

		btnMesDocuments.setFont(new Font("Tahoma", Font.PLAIN, 15));
	
		btnMesDocuments.setHorizontalAlignment(SwingConstants.LEFT);
		btnMesDocuments.setBounds(10, 203, 317, 36);
		add(btnMesDocuments);
		
		JButton btnStatistique = new JButton("Statistique\r\n");
		btnStatistique.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ApplicationFrame.content.remove(ApplicationFrame.panelContenu);
				ApplicationFrame.panelContenu= new PanelStatistiqueRestaurant();
				ApplicationFrame.content.add(ApplicationFrame.panelContenu);
				ApplicationFrame.content.validate();
				ApplicationFrame.content.repaint();
				
			}
		});
		btnStatistique.setHorizontalAlignment(SwingConstants.LEFT);
		btnStatistique.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnStatistique.setBounds(10, 250, 317, 36);
		add(btnStatistique);

		JButton btnAdministration = new JButton("Administration");
	
		btnAdministration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnAdministration.setFont(new Font("Tahoma", Font.PLAIN, 15));
	
		btnAdministration.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdministration.setBounds(10, 250, 317, 36);
		
		setVisible(true);

	}
}
