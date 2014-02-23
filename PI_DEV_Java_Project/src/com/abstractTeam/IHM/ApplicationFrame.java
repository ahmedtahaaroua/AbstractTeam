package com.abstractTeam.IHM;



import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.JTree;

import com.abstractTeam.IHM.GestionResLiv.PanelReservations;

import javax.swing.AbstractAction;
import javax.swing.Action;


@SuppressWarnings("serial")
public class ApplicationFrame extends JFrame {

	static URI url;

	public static JPanel panelLeftTop;
	public static JPanel panelLeftBottom ;
	// public static PanelContenu panelContenu;
	public static JPanel panelContenu;
	
	public static Container content;
	public static JTree tree;
	public static Thread thread;
	private final Action action = new SwingAction();

	/**
	 * Create the application.
	 */

	public ApplicationFrame() {
		super();
		// setType(Type.POPUP);
		setFont(new Font("Dialog", Font.BOLD, 12));
		initialize();
	
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationFrame window = new ApplicationFrame();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Initialize the contents of the frame.
	 */

	@SuppressWarnings("static-access")
	private void initialize() {
		

		content = getContentPane();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 1366, 731);
		this.setLocationRelativeTo(null);
		this.content.setLayout(null);
		
		this.setTitle("Resto Tunisie");

		panelLeftTop = new PanelLeftTop();
		content.add(panelLeftTop);

		panelLeftBottom =  new PanelLeftBottom();
		content.add(panelLeftBottom);

		panelContenu =   new PanelContenu();

		content.add(panelContenu);

		JButton btnNewButton_7 = new JButton("Serveurs");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		
		

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1350, 24);
		this.content.add(menuBar);

		JMenu mnNewMenu = new JMenu("Connection");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Inscription");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		mnNewMenu.add(mntmNewMenuItem);

		JMenu mnNewMenu_1 = new JMenu("Statistiques");
		menuBar.add(mnNewMenu_1);

		JMenu mnNewMenu_2 = new JMenu("Outils");
		menuBar.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("A propos");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
     JOptionPane.showMessageDialog(ApplicationFrame.content,"Réalisé par ABSTRACT-TEAM","a propos",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_1);

		this.content.validate();
		this.content.repaint();

	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
