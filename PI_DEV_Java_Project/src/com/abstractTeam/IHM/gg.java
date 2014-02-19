package com.abstractTeam.IHM;

import java.awt.EventQueue;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.Component;
import javax.swing.Box;

public class gg {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gg window = new gg();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

	
		
		frame = new JFrame();
		frame.setBounds(100, 100, 807, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		final JSplitPane splitPane = new JSplitPane();
		System.out.println(frame.getContentPane().getBounds().width);
		splitPane.setBounds(0,0, frame.getBounds().width-16,frame.getBounds().height-39);
		
		frame.getContentPane().add(splitPane);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		splitPane.setRightComponent(verticalStrut);
frame.addComponentListener(new ComponentAdapter() {
    @Override
    public void componentResized(ComponentEvent e)
    {

    	splitPane.setBounds(0,0, frame.getBounds().width-16,frame.getBounds().height-39);
    	frame.getContentPane().add(splitPane);
    	splitPane.repaint();
        frame.repaint();
    }
});
		
  
	}
}
