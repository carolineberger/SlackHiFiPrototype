package ch.swingfx.twinkle;

import javax.swing.ImageIcon;

import ch.swingfx.twinkle.event.NotificationEvent;
import ch.swingfx.twinkle.event.NotificationEventAdapter;
import ch.swingfx.twinkle.manger.NotificationManagers;
import ch.swingfx.twinkle.style.INotificationStyle;
import ch.swingfx.twinkle.style.theme.BlueDefaultNotification;
import ch.swingfx.twinkle.style.theme.LightDefaultNotification;
import ch.swingfx.twinkle.style.theme.RedDefaultNotification;
import ch.swingfx.twinkle.window.Positions;

public class HiFiPrototypeScheme {
	
	public static void play(String text){
				INotificationStyle style = new LightDefaultNotification()
				.withWidth(400) // Optional
				.withAlpha(0.9f) // Optional
		;

		// Now lets build the notification
		
		
		
		
		
		INotificationStyle style2 = new RedDefaultNotification()
				.withWidth(400) // Optional
				.withAlpha(0.9f) // Optional
		;
		new NotificationBuilder()
		.withStyle(style2) // Required. here we set the previously set style
		.withTitle("Henry (Boss): (Channel: PROJECTS)") // Required.
		.withMessage(text) // Optional
		.withIcon(new ImageIcon(QuickStart.class.getResource("/ch/swingfx/twinkle/resource/Boss.jpg")))
		
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
		
//		
//		
//		INotificationStyle style3 = new BlueDefaultNotification()
//				.withWidth(400) // Optional
//				.withAlpha(0.9f) // Optional
//		;
//		new NotificationBuilder()
//		.withStyle(style3) // Required. here we set the previously set style
//		.withTitle("Antoine (Spanish Meetup): (Channel: PUBCRAWL)") // Required.
//		.withMessage("Guys, who's ready for tonight?") // Optional
//		.withIcon(new ImageIcon(QuickStart.class.getResource("/ch/swingfx/twinkle/resource/Antoine.jpg")))
//		
//		.withNotificationManager(NotificationManagers.SEQUENTIAL)
//		.withDisplayTime(3000) // Optional
//		.withPosition(Positions.NORTH_EAST) // Optional. Show it at the center of the screen
//		.withListener(new NotificationEventAdapter() { // Optional
//			public void closed(NotificationEvent event) {
//				System.out.println("closed notification with UUID " + event.getId());
//			}
//
//			public void clicked(NotificationEvent event) {
//		        
//				System.out.println("clicked notification with UUID " + event.getId());
//		            
//		       
//			}
//		})
//		
//		.showNotification(); // this returns a UUID that you can use to identify events on the listener
//		
//		new NotificationBuilder()
//		.withStyle(style2) // Required. here we set the previously set style
//		.withTitle("Greg (co-worker): (Channel: PROJECTS)") // Required.
//		.withMessage("Yep, can @everyone take a look?") // Optional
//		.withIcon(new ImageIcon(QuickStart.class.getResource("/ch/swingfx/twinkle/resource/Greg.jpg")))
//		.withNotificationManager(NotificationManagers.SEQUENTIAL)
//		
//		//.withIcon(new ImageIcon(QuickStart.class.getResource("/twinkle.png"))) // Optional. You could also use a String path
//		.withDisplayTime(3000) // Optional
//		.withPosition(Positions.NORTH_EAST) // Optional. Show it at the center of the screen
//		.withListener(new NotificationEventAdapter() { // Optional
//			public void closed(NotificationEvent event) {
//				System.out.println("closed notification with UUID " + event.getId());
//			}
//
//			public void clicked(NotificationEvent event) {
//		        
//				System.out.println("clicked notification with UUID " + event.getId());
//		            
//		       
//			}
//		})
//		.showNotification(); // this returns a UUID that you can use to identify events on the listener
//
//		new NotificationBuilder()
//		.withStyle(style2) // Required. here we set the previously set style
//		.withTitle("Henry (Boss): (Channel: PROJECTS)") // Required.
//		.withMessage("Please do this by the end of the week @everyone") // Optional
//		.withIcon(new ImageIcon(QuickStart.class.getResource("/ch/swingfx/twinkle/resource/Boss.jpg")))
//		
//		.withNotificationManager(NotificationManagers.SEQUENTIAL)
//		.withDisplayTime(3000) // Optional
//		.withPosition(Positions.NORTH_EAST) // Optional. Show it at the center of the screen
//		.withListener(new NotificationEventAdapter() { // Optional
//			public void closed(NotificationEvent event) {
//				System.out.println("closed notification with UUID " + event.getId());
//			}
//
//			public void clicked(NotificationEvent event) {
//		        
//				System.out.println("clicked notification with UUID " + event.getId());
//		            
//		       
//			}
//		})
//		
//		.showNotification(); // this returns a UUID that you can use to identify events on the listener
//		
//		new NotificationBuilder()
//		.withStyle(style) // Required. here we set the previously set style
//		.withTitle("Sarah (co-worker): (Channel: RANDOM)") // Required.
//		.withMessage("Who's going to the dinner tonight?") // Optional
//		.withIcon(new ImageIcon(QuickStart.class.getResource("/ch/swingfx/twinkle/resource/Sarah.jpg")))
//		.withNotificationManager(NotificationManagers.SEQUENTIAL)
//		
//		//.withIcon(new ImageIcon(QuickStart.class.getResource("/twinkle.png"))) // Optional. You could also use a String path
//		.withDisplayTime(3000) // Optional
//		.withPosition(Positions.NORTH_EAST) // Optional. Show it at the center of the screen
//		.withListener(new NotificationEventAdapter() { // Optional
//			public void closed(NotificationEvent event) {
//				System.out.println("closed notification with UUID " + event.getId());
//			}
//
//			public void clicked(NotificationEvent event) {
//		        
//				System.out.println("clicked notification with UUID " + event.getId());
//		            
//		       
//			}
//		})
//		.showNotification(); // this returns a UUID that you can use to identify events on the listener
//
//		
//		new NotificationBuilder()
//		.withStyle(style3) // Required. here we set the previously set style
//		.withTitle("Mark (Spanish Meetup): (Channel: PUBCRAWL)") // Required.
//		.withMessage("Yes 100% I can't wait dude. What time are we meeting?") // Optional
//		.withIcon(new ImageIcon(QuickStart.class.getResource("/ch/swingfx/twinkle/resource/Mark.jpg")))
//		
//		.withNotificationManager(NotificationManagers.SEQUENTIAL)
//		.withDisplayTime(3000) // Optional
//		.withPosition(Positions.NORTH_EAST) // Optional. Show it at the center of the screen
//		.withListener(new NotificationEventAdapter() { // Optional
//			public void closed(NotificationEvent event) {
//				System.out.println("closed notification with UUID " + event.getId());
//			}
//
//			public void clicked(NotificationEvent event) {
//		        
//				System.out.println("clicked notification with UUID " + event.getId());
//		            
//		       
//			}
//		})
//		
//		.showNotification(); // this returns a UUID that you can use to identify events on the listener
//		new NotificationBuilder()
//		.withStyle(style3) // Required. here we set the previously set style
//		.withTitle("Antoine (Spanish Meetup): (Channel: PUBCRAWL)") // Required.
//		.withMessage("@Mark around 8 PM") // Optional
//		.withIcon(new ImageIcon(QuickStart.class.getResource("/ch/swingfx/twinkle/resource/Antoine.jpg")))
//		
//		.withNotificationManager(NotificationManagers.SEQUENTIAL)
//		.withDisplayTime(3000) // Optional
//		.withPosition(Positions.NORTH_EAST) // Optional. Show it at the center of the screen
//		.withListener(new NotificationEventAdapter() { // Optional
//			public void closed(NotificationEvent event) {
//				System.out.println("closed notification with UUID " + event.getId());
//			}
//
//			public void clicked(NotificationEvent event) {
//		        
//				System.out.println("clicked notification with UUID " + event.getId());
//		            
//		       
//			}
//		})
//		
//		.showNotification(); // this returns a UUID that you can use to identify events on the listener
//		
//		new NotificationBuilder()
//		.withStyle(style) // Required. here we set the previously set style
//		.withTitle("Sarah (co-worker): (Channel: DIRECT MESSAGE)") // Required.
//		.withMessage("OMG I found the best sushi place last night!") // Optional
//		.withIcon(new ImageIcon(QuickStart.class.getResource("/ch/swingfx/twinkle/resource/Sarah.jpg")))
//		.withNotificationManager(NotificationManagers.SEQUENTIAL)
//		
//		//.withIcon(new ImageIcon(QuickStart.class.getResource("/twinkle.png"))) // Optional. You could also use a String path
//		.withDisplayTime(3000) // Optional
//		.withPosition(Positions.NORTH_EAST) // Optional. Show it at the center of the screen
//		.withListener(new NotificationEventAdapter() { // Optional
//			public void closed(NotificationEvent event) {
//				System.out.println("closed notification with UUID " + event.getId());
//			}
//
//			public void clicked(NotificationEvent event) {
//		        
//				System.out.println("clicked notification with UUID " + event.getId());
//		            
//		       
//			}
//		})
//		.showNotification(); // this returns a UUID that you can use to identify events on the listener
//
//	}

	}
}
