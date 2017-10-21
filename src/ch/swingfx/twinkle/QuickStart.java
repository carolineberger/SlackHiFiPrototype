package ch.swingfx.twinkle;


import ch.swingfx.twinkle.event.NotificationEvent;
import ch.swingfx.twinkle.event.NotificationEventAdapter;
import ch.swingfx.twinkle.style.INotificationStyle;
import ch.swingfx.twinkle.style.theme.LightDefaultNotification;
import ch.swingfx.twinkle.window.Positions;

public class QuickStart {

	public static void main(String[] args) {
		// AA the text
		System.setProperty("swing.aatext", "true");

		// First we define the style/theme of the window.
		// Note how we override the default values
		INotificationStyle style = new LightDefaultNotification()
				.withWidth(400) // Optional
				.withAlpha(0.9f) // Optional
		;

		// Now lets build the notification
		
		new NotificationBuilder()
				.withStyle(style) // Required. here we set the previously set style
				.withTitle("Starting Simulation in 10 Seconds") // Required.
				.withDisplayTime(10000)
				.withPosition(Positions.CENTER) // Optional. Show it at the center of the screen
				.withListener(new NotificationEventAdapter() { // Optional
					public void closed(NotificationEvent event) {
						System.out.println("closed notification with UUID " + event.getId());
					}

					public void clicked(NotificationEvent event) {
						System.out.println("clicked notification with UUID " + event.getId());
				            
				       
					}
				})
				.showNotification(); // this returns a UUID that you can use to identify events on the listener
		
		
		
		HiFiPrototypeScheme.play();
		//NoColorScheme.play();
		
			

	}

}