package ch.swingfx.twinkle.style.theme;

import ch.swingfx.color.ColorUtil;
import ch.swingfx.twinkle.style.AbstractNotificationStyle;
import ch.swingfx.twinkle.style.background.ColorBackground;
import ch.swingfx.twinkle.style.closebutton.RectangleCloseButton;
import ch.swingfx.twinkle.style.overlay.BorderOverlay;
import ch.swingfx.twinkle.style.overlay.GradientOverlay;
import ch.swingfx.twinkle.style.overlay.OverlayPaintMode;
import ch.swingfx.twinkle.window.NotificationWindowTypes;

import java.awt.*;


public class ColorNotification extends AbstractNotificationStyle {
	public ColorNotification(String textColor, Color color) {
		super();
		System.out.print(textColor);
		if (textColor.equals("Black")){
			
			withNotificationWindowCreator(NotificationWindowTypes.DEFAULT);
			withTitleFontColor(Color.BLACK);
			withMessageFontColor(Color.BLACK);
			withAlpha(0.85f);
			withWidth(320);
			withBackground(new ColorBackground(color));
			withWindowCornerRadius(8);
			withOverlay(new BorderOverlay(1, Color.BLACK, OverlayPaintMode.ALWAYS,
						new GradientOverlay(ColorUtil.withAlpha(Color.BLACK, 0f), ColorUtil.withAlpha(Color.BLACK, 0.1f), OverlayPaintMode.MOUSE_OVER)));
			withCloseButton(new RectangleCloseButton(ColorUtil.withAlpha(Color.WHITE, 0.8f), Color.BLACK).withPosition(9, 9));
		}
		else{
			withNotificationWindowCreator(NotificationWindowTypes.DEFAULT);
			withTitleFontColor(Color.WHITE);
			withMessageFontColor(Color.WHITE);
			withAlpha(0.85f);
			withWidth(320);
			withBackground(new ColorBackground(color));
			withWindowCornerRadius(8);
			withOverlay(new BorderOverlay(1, Color.WHITE, OverlayPaintMode.MOUSE_OVER,
						new GradientOverlay(ColorUtil.withAlpha(Color.WHITE, 0f), ColorUtil.withAlpha(Color.WHITE, 0.1f), OverlayPaintMode.MOUSE_OVER)));
			withCloseButton(new RectangleCloseButton(ColorUtil.withAlpha(Color.WHITE, 0.8f), Color.BLACK).withPosition(9, 9));
		}

	
	}
}