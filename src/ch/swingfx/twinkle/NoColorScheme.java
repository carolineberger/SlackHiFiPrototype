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
		
		new NotificationBuilder()
		.withStyle(style) // Required. here we set the previously set style
		.withTitle("Sarah (co-worker): (Channel: DIRECT MESSAGE)") // Required.
		.withMessage("Laura's softball game is tonight!") // Optional
		.withIcon(new ImageIcon(QuickStart.class.getResource("/ch/swingfx/twinkle/resource/Sarah.jpg")))
		.withNotificationManager(NotificationManagers.SEQUENTIAL)
		
		//.withIcon(new ImageIcon(QuickStart.class.getResource("/twinkle.png"))) // Optional. You could also use a String path
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

		
		
		new NotificationBuilder()
		.withStyle(style) // Required. here we set the previously set style
		.withTitle("Antoine (Friends): (Channel: EVENTS)") // Required.
		.withMessage("I'm hosting a halloween party!") // Optional
		.withIcon(new ImageIcon(QuickStart.class.getResource("/ch/swingfx/twinkle/resource/Antoine.jpg")))
		
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
		
		new NotificationBuilder()
		.withStyle(style) // Required. here we set the previously set style
		.withTitle("Greg (co-worker): (Channel: RANDOM)") // Required.
		.withMessage("I can carpool people to the game!") // Optional
		.withIcon(new ImageIcon(QuickStart.class.getResource("/ch/swingfx/twinkle/resource/Greg.jpg")))
		.withNotificationManager(NotificationManagers.SEQUENTIAL)
		
		//.withIcon(new ImageIcon(QuickStart.class.getResource("/twinkle.png"))) // Optional. You could also use a String path
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

		new NotificationBuilder()
		.withStyle(style) // Required. here we set the previously set style
		.withTitle("Sarah (co-worker): (Channel: RANDOM)") // Required.
		.withMessage("Yay! @Greg can you give me a ride?") // Optional
		.withIcon(new ImageIcon(QuickStart.class.getResource("/ch/swingfx/twinkle/resource/Sarah.jpg")))
		.withNotificationManager(NotificationManagers.SEQUENTIAL)
		
		//.withIcon(new ImageIcon(QuickStart.class.getResource("/twinkle.png"))) // Optional. You could also use a String path
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

		new NotificationBuilder()
		.withStyle(style) // Required. here we set the previously set style
		.withTitle("Henry (Boss): (Channel: PROJECTS)") // Required.
		.withMessage("Nice work @Sarah, just saw your proposal, everyone take a look.") // Optional
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
		
		new NotificationBuilder()
		.withStyle(style) // Required. here we set the previously set style
		.withTitle("Mark (Friends): (Channel: EVENTS)") // Required.
		.withMessage("Awesome! I'm down :)") // Optional
		.withIcon(new ImageIcon(QuickStart.class.getResource("/ch/swingfx/twinkle/resource/Mark.jpg")))
		
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
		
		// High Priority notification 3
		
		new NotificationBuilder()
		.withStyle(style) // Required. here we set the previously set style
		.withTitle("Henry (Boss): (Channel: PROJECTS)") // Required.
		.withMessage("Let's touch base via Skype") // Optional
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

		
	}

}
