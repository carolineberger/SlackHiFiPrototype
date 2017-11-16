package ch.swingfx.twinkle;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class NotificationsManager extends JFrame {

	private JPanel contentPane;

	public NotificationsManager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));

		contentPane.setBorder(new LineBorder(new Color(51, 102, 204), 50));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

}
