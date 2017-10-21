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


public class RedDefaultNotification extends AbstractNotificationStyle {
	public RedDefaultNotification() {
		super();
		withNotificationWindowCreator(NotificationWindowTypes.DEFAULT);
		withTitleFontColor(Color.BLACK);
		withMessageFontColor(Color.BLACK);
		withAlpha(0.85f);
		withWidth(320);
		withBackground(new ColorBackground(new Color(255, 6, 0)));
		withWindowCornerRadius(8);
		withOverlay(new BorderOverlay(1, Color.BLACK, OverlayPaintMode.ALWAYS,
					new GradientOverlay(ColorUtil.withAlpha(Color.BLACK, 0f), ColorUtil.withAlpha(Color.BLACK, 0.1f), OverlayPaintMode.MOUSE_OVER)));
		withCloseButton(new RectangleCloseButton(ColorUtil.withAlpha(Color.WHITE, 0.8f), Color.BLACK).withPosition(9, 9));
	}
}