package ch.swingfx.twinkle;

import javax.swing.ImageIcon;

import ch.swingfx.twinkle.event.NotificationEvent;
import ch.swingfx.twinkle.event.NotificationEventAdapter;
import ch.swingfx.twinkle.manger.NotificationManagers;
import ch.swingfx.twinkle.style.INotificationStyle;
import ch.swingfx.twinkle.style.theme.LightDefaultNotification;
import ch.swingfx.twinkle.window.Positions;

public class NoColorScheme {
	
	public static void play(){
				INotificationStyle style = new LightDefaultNotification()
				.withWidth(400) // Optional
				.withAlpha(0.9f) // Optional
		;	
		
		
		new NotificationBuilder()
		.withStyle(style) // Required. here we set the previously set style
		.withTitle("Henry (Boss): (Channel: PROJECTS)") // Required.
		.withMessage("Meet with your groups before end of the day") // Optional
		.withIcon(new ImageIcon("/ch/swingfx/twinkle/resource/Boss.jpg"))
		
		.withNotificationManager(NotificationManagers.SEQUENTIAL)
		.withDisplayTime(3000) // Optional
		.withPosition(Positions.NORTH_EAST) // Optional. Show it at the center of the screen
		.withListener(new NotificationEventAdapter() { // Optional
			public void closed(NotificationEvent event) {
				System.out.println("closed notification with UUID " + event.getId());
			}

			public void clicked(NotificationEvent event) {
		        
				System.out.println("clicked notification with UUID " + event.getId());
		            
		       
			}
		})
		
		.showNotification(); // this returns a UUID that you can use to identify events on the listener
	
		
	}

}
