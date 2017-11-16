package ch.swingfx.twinkle;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;

public class ScreenWalkthrough {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScreenWalkthrough window = new ScreenWalkthrough();
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
	public ScreenWalkthrough() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(68, 114, 196));
		frame.setBounds(200, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setLocation(282, 418);
		btnNewButton.setIcon(new ImageIcon(ScreenWalkthrough.class.getResource("/ch/swingfx/twinkle/resource/StartCustomizationSmall.png")));
		btnNewButton.setSize(251, 108);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
		        new SettingsPage().setVisible(true); // Main Form to show after the Login Form..
				
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(51, 102, 204));
		lblNewLabel.setIcon(new ImageIcon(ScreenWalkthrough.class.getResource("/ch/swingfx/twinkle/resource/HeaderSmall.png")));
		lblNewLabel.setBounds(102, -13, 667, 392);
		frame.getContentPane().add(lblNewLabel);
	}
}
