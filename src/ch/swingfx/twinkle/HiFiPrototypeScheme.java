package ch.swingfx.twinkle;


import java.awt.Color;

import javax.swing.ImageIcon;

import ch.swingfx.twinkle.event.NotificationEvent;
import ch.swingfx.twinkle.event.NotificationEventAdapter;
import ch.swingfx.twinkle.manger.NotificationManagers;
import ch.swingfx.twinkle.style.INotificationStyle;
import ch.swingfx.twinkle.style.theme.ColorNotification;
import ch.swingfx.twinkle.window.Positions;

public class HiFiPrototypeScheme {
	
	public static void play(String pos, String textColor, int time, Color color, boolean message, boolean sender, boolean picture, boolean channel, boolean group){
				
		ImageIcon face = null;
		String senderString = " ";
		String groupString = "";
		String channelString = "";
		String messageString = "";
		Positions position = Positions.NORTH_EAST;
		if (sender == true){
			senderString = "Jack ";
		}
		if (channel == true){
			channelString = "#General ";
		}
		if(group == true){
			groupString = "Microsoft ";
			
		}
		if(picture == true){
			face = new ImageIcon(ScreenWalkthrough.class.getResource("/ch/swingfx/twinkle/resource/Boss.jpg"));
		}
		if (message == true){
			messageString = "Example message content.";
		}
		if (pos.equals("Top Left")){
			position = Positions.NORTH_WEST;
		}
		else{
			position = Positions.NORTH_EAST;
		}
		INotificationStyle style = new ColorNotification(textColor, color )
				.withWidth(400) // Optional
				.withAlpha(0.9f) // Optional
		;
		new NotificationBuilder()
		.withStyle(style) // Required. here we set the previously set style
		.withTitle(senderString + groupString + channelString ) // Required.
		.withMessage(messageString) // Optional
		.withIcon(face)
		.withNotificationManager(NotificationManagers.SEQUENTIAL)
		.withDisplayTime((time * 1000)) // Optional
		.withPosition(position) // Optional. Show it at the center of the screen
		.withListener(new NotificationEventAdapter() { // Optional
			public void closed(NotificationEvent event) {
				System.out.println("closed notification with UUID " + event.getId());
				
			}

			public void clicked(NotificationEvent event) {
		        // find and open slack
				System.out.println("clicked notification with UUID " + event.getId());
		            
		       
			}
		})
		
		.showNotification(); //fire and close
		
	

	}
}
