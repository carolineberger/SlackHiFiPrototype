package ch.swingfx.twinkle;


import java.net.URISyntaxException;

import ch.swingfx.twinkle.event.NotificationEvent;
import ch.swingfx.twinkle.event.NotificationEventAdapter;
import ch.swingfx.twinkle.style.INotificationStyle;
import ch.swingfx.twinkle.style.theme.LightDefaultNotification;
import ch.swingfx.twinkle.window.Positions;
import io.socket.client.IO;
import io.socket.client.Socket;
import io.socket.emitter.Emitter;

public class QuickStart {

	public static void main(String[] args) throws URISyntaxException {
		// AA the text
		System.setProperty("swing.aatext", "true");
		Socket socket = IO.socket("http://localhost:3001");
		socket.on(Socket.EVENT_CONNECT, new Emitter.Listener() {
			public void call(Object... arg0) {
				// TODO Auto-generated method stub
				System.out.println("connected to server");
			}
		})
		.on("notify", new Emitter.Listener() {
			
			public void call(Object... arg0) {
				// TODO Auto-generated method stub
				HiFiPrototypeScheme.play((String) arg0[0]);
			}
		});
		
		socket.connect();
		// First we define the style/theme of the window.
		// Note how we override the default values
	
		
		
		
		//NoColorScheme.play();
		
			

	}
}