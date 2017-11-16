package ch.swingfx.twinkle;

import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
public class MyColor{
	JFrame myFrame;
	JTextArea ta; 
	JPanel pnl;
	JPanel pnlContent;
	public MyColor(){
		myFrame = new JFrame();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setTitle("Notification Settings");
		myFrame.setSize(500,300);
		myFrame.setLocationRelativeTo(null);
		myFrame.setLayout(new BorderLayout());
		ta = new JTextArea("Colour chosen:");
		ta.setVisible(true);
		myFrame.add(ta, BorderLayout.NORTH);
		pnl = new JPanel();
		//pnl.setLayout(new GridLayout(1,6));
		myFrame.add(pnl);
		JButton createButton = new JButton("Choose a Color for the Notification");
		createButton.setLocation(150, 150);
		createButton.setActionCommand("Choose a Color for the Notification");
		createButton.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent event)	{
				final JColorChooser colorChooser = new JColorChooser();
				JDialog dialog = JColorChooser.createDialog(myFrame, "Choose a Color for the Notification", false, colorChooser,
				new ActionListener(){
					public void actionPerformed(ActionEvent event)	{
					//ta.append(colorChooser.getColor());
					ta.setBackground(colorChooser.getColor());
					}
				}
				, new ActionListener()
			{
			public void actionPerformed(ActionEvent event)
			{
			ta.append("\nYou  clicked on cancel..");
			}
			});
			dialog.setVisible(true);
			}
		});
		pnl.add(createButton);
		myFrame.setVisible(true);
		//pnlContent.setLayout(new GridLayout(1,5));
		JButton Content = new JButton("Choose content");
		Content.setLocation(300, 0);
		pnl.add(Content);
		}
		
}
