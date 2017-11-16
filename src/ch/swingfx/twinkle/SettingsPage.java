package ch.swingfx.twinkle;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

public class SettingsPage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JTextArea txtrColorChosen;
	JTextArea txtrSender_1;
	JCheckBox chckbxSender;
	JFormattedTextField formattedTextField;
	JFormattedTextField formattedTextField_1;
	JFormattedTextField formattedTextField_2;
	JButton btnNewButton;
	JTextArea txtrNotificationDurationIn ;
	JButton btnChooseNotificationColor;
	JCheckBox chckbxMessage;
	JCheckBox chckbxChannel;
	JCheckBox chckbxGroup;
	JComboBox comboBox;
	JTextArea txtrWhatBackgroundColor;
	JTextArea txtrWhereShouldThe;
	JTextArea txtrChannel_1;
	JTextArea txtrSlackGroup_1;
	JTextArea txtrWhatInformationShould;
	private JCheckBox chckbxPicture;
	private JTextArea txtrWhichSenderChannel;
	private JButton btnSaveNotification;
	private JCheckBox chckbxSender_1;
	private JCheckBox chckbxChannel_1;
	private JCheckBox chckbxSlackGroup;
	JColorChooser colorChooser;
	Color color = Color.white;
	JSlider slider;
	private JButton btnChooseBackgroundColor;
	private JComboBox comboBox_1;
	private JTextArea txtrTextColor;
	String textColor = "Black";

	/**
	 * Create the frame.
	 */
	public SettingsPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));

		contentPane.setBorder(new LineBorder(new Color(51, 102, 204), 50));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("Send Test Notification");
		btnNewButton.setBackground(new Color(255, 215, 0));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(308, 315, 208, 42);
		contentPane.add(btnNewButton);
		
		slider = new JSlider();
		slider.setMinimum(1);
		slider.setFont(new Font("Helvetica Neue", Font.PLAIN, 11));
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setSnapToTicks(true);
		slider.setToolTipText("How long should the notification be shown for? (in seconds)");
		slider.setMajorTickSpacing(1);
		slider.setMaximum(5);
		slider.setBounds(60, 237, 404, 97);
		contentPane.add(slider);
		
		txtrNotificationDurationIn = new JTextArea();
		txtrNotificationDurationIn.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
		txtrNotificationDurationIn.setBackground(new Color(240, 248, 255));
		txtrNotificationDurationIn.setText("How long should the notification be shown for? (in seconds)");
		txtrNotificationDurationIn.setBounds(64, 237, 428, 32);
		contentPane.add(txtrNotificationDurationIn);
		
		
		
		txtrColorChosen = new JTextArea();
		txtrColorChosen.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
		txtrColorChosen.setBounds(308, 79, 37, 23);
		contentPane.add(txtrColorChosen);
		
		chckbxSender = new JCheckBox("Sender");
		chckbxSender.setBounds(147, 397, 128, 23);
		contentPane.add(chckbxSender);
		chckbxSender.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		
		chckbxMessage = new JCheckBox("Message");
		chckbxMessage.setBounds(65, 164, 128, 23);
		contentPane.add(chckbxMessage);
		chckbxMessage.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		
		chckbxChannel = new JCheckBox("Channel");
		chckbxChannel.setBounds(147, 426, 128, 23);
		contentPane.add(chckbxChannel);
		chckbxChannel.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		
		chckbxGroup = new JCheckBox("Slack Group");
		chckbxGroup.setBounds(147, 458, 128, 23);
		contentPane.add(chckbxGroup);
		chckbxGroup.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		
		formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(391, 455, 180, 26);
		contentPane.add(formattedTextField);
		formattedTextField.setVisible(false);
		
		formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(391, 395, 180, 26);
		contentPane.add(formattedTextField_1);
		formattedTextField_1.setVisible(false);
		
		formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setBounds(391, 425, 180, 26);
		contentPane.add(formattedTextField_2);
		formattedTextField_2.setVisible(false);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Top Right", "Top Left"}));
		comboBox.setBounds(459, 197, 157, 27);
		contentPane.add(comboBox);
		
		txtrWhatBackgroundColor = new JTextArea();
		txtrWhatBackgroundColor.setText("What color should the notification be?");
		txtrWhatBackgroundColor.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
		txtrWhatBackgroundColor.setBackground(new Color(240, 248, 255));
		txtrWhatBackgroundColor.setBounds(64, 61, 428, 16);
		contentPane.add(txtrWhatBackgroundColor);
		
		txtrWhereShouldThe = new JTextArea();
		txtrWhereShouldThe.setText("Where should the notification be shown on the screen?");
		txtrWhereShouldThe.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
		txtrWhereShouldThe.setBackground(new Color(240, 248, 255));
		txtrWhereShouldThe.setBounds(63, 199, 428, 32);
		contentPane.add(txtrWhereShouldThe);
		
		txtrChannel_1 = new JTextArea();
		txtrChannel_1.setText("Channel:");
		txtrChannel_1.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
		txtrChannel_1.setBackground(new Color(240, 248, 255));
		txtrChannel_1.setBounds(276, 427, 118, 16);
		contentPane.add(txtrChannel_1);
		txtrChannel_1.setVisible(false);
		
		txtrSlackGroup_1 = new JTextArea();
		txtrSlackGroup_1.setText("Slack Group:");
		txtrSlackGroup_1.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
		txtrSlackGroup_1.setBackground(new Color(240, 248, 255));
		txtrSlackGroup_1.setBounds(276, 458, 118, 23);
		contentPane.add(txtrSlackGroup_1);
		txtrSlackGroup_1.setVisible(false);
		
		txtrSender_1 = new JTextArea();
		txtrSender_1.setText("Sender Name:");
		txtrSender_1.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
		txtrSender_1.setBackground(new Color(240, 248, 255));
		txtrSender_1.setBounds(276, 397, 118, 16);
		contentPane.add(txtrSender_1);
		txtrSender_1.setVisible(false);
		
		txtrWhatInformationShould = new JTextArea();
		txtrWhatInformationShould.setText("What information should be shown on the notification? (Check all that apply)");
		txtrWhatInformationShould.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
		txtrWhatInformationShould.setBackground(new Color(240, 248, 255));
		txtrWhatInformationShould.setBounds(60, 143, 511, 23);
		contentPane.add(txtrWhatInformationShould);
		
		chckbxPicture = new JCheckBox("Picture");
		chckbxPicture.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		chckbxPicture.setBounds(316, 164, 128, 23);
		contentPane.add(chckbxPicture);
		
		txtrWhichSenderChannel = new JTextArea();
		txtrWhichSenderChannel.setText("Which sender, channel or slack group does this notification setting apply to? \n(Check all that apply)");
		txtrWhichSenderChannel.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
		txtrWhichSenderChannel.setBackground(new Color(240, 248, 255));
		txtrWhichSenderChannel.setBounds(70, 356, 642, 42);
		contentPane.add(txtrWhichSenderChannel);
		
		btnSaveNotification = new JButton("Save Notification");
		btnSaveNotification.setForeground(Color.BLACK);
		btnSaveNotification.setBackground(new Color(255, 215, 0));
		btnSaveNotification.setBounds(308, 485, 208, 42);
		contentPane.add(btnSaveNotification);
		
		chckbxSender_1 = new JCheckBox("Sender");
		chckbxSender_1.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		chckbxSender_1.setBounds(190, 164, 128, 23);
		contentPane.add(chckbxSender_1);
		
		chckbxChannel_1 = new JCheckBox("Channel");
		chckbxChannel_1.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		chckbxChannel_1.setBounds(443, 164, 128, 23);
		contentPane.add(chckbxChannel_1);
		
		chckbxSlackGroup = new JCheckBox("Slack Group");
		chckbxSlackGroup.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		chckbxSlackGroup.setBounds(584, 164, 128, 23);
		contentPane.add(chckbxSlackGroup);
		
		btnChooseBackgroundColor = new JButton("Choose Background Color");
		btnChooseBackgroundColor.setBounds(60, 79, 232, 27);
		contentPane.add(btnChooseBackgroundColor);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Black", "White"}));
		comboBox_1.setBounds(150, 106, 174, 32);
		contentPane.add(comboBox_1);
		
		txtrTextColor = new JTextArea();
		txtrTextColor.setText("Text color:");
		txtrTextColor.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
		txtrTextColor.setBackground(new Color(240, 248, 255));
		txtrTextColor.setBounds(64, 110, 428, 25);
		contentPane.add(txtrTextColor);
		
		btnChooseBackgroundColor.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) {
				colorChooser = new JColorChooser();
				JDialog dialog = JColorChooser.createDialog( null, "Choose a Color for the Notification", false, colorChooser,
				new ActionListener(){
					public void actionPerformed(ActionEvent event)	{
						color = colorChooser.getColor();
						txtrColorChosen.setBackground(colorChooser.getColor());
					}
				}
				, new ActionListener()
			{
			public void actionPerformed(ActionEvent event)
			{
				//txtrColorChosen.append("\nYou  clicked on cancel..");
			}
			});
			dialog.setVisible(true);
			}
		});		
			
		chckbxSender.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) {
				if(chckbxSender.isSelected()== true){
					txtrSender_1.setVisible(true);
					formattedTextField_1.setVisible(true);
					
					
				}
				else{
					txtrSender_1.setVisible(false);
					formattedTextField_1.setVisible(false);
				}
			}
		});
		
		chckbxGroup.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) {
				if(chckbxGroup.isSelected()== true){
					txtrSlackGroup_1.setVisible(true);
					formattedTextField.setVisible(true);
					
					
				}
				else{
					txtrSlackGroup_1.setVisible(false);
					formattedTextField.setVisible(false);
				}
			}
		});
		chckbxChannel.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) {
				if(chckbxChannel.isSelected()== true){
					txtrChannel_1.setVisible(true);
					formattedTextField_2.setVisible(true);
					
					
				}
				else{
					txtrChannel_1.setVisible(false);
					formattedTextField_2.setVisible(false);
				}
			}
		});
		//textColor = comboBox_1.getSelectedItem().toString();
		btnNewButton.addActionListener(new ActionListener() 
		{
			
			public void actionPerformed(ActionEvent e) {
				HiFiPrototypeScheme.play(comboBox.getSelectedItem().toString(), comboBox_1.getSelectedItem().toString(), slider.getValue(), color,chckbxMessage.isSelected(), chckbxSender_1.isSelected(), chckbxPicture.isSelected(), chckbxChannel_1.isSelected(), chckbxSlackGroup.isSelected());
			}
		});
	}
}
