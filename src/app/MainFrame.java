package app;

import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = -5548304344461932233L;

	public MainFrame(String html) {
		try {
			JEditorPane text_area = new JEditorPane("text/html", html);
			text_area.setAutoscrolls(true);
			text_area.setEditable(false);

			URL systemResource = MainFrame.class.getResource("icon.png");

			if (systemResource != null) {
				BufferedImage image = ImageIO.read(systemResource);
				setIconImage(image);
			}

			final JScrollPane scrollPane = new JScrollPane(text_area);
			add(scrollPane);
			pack();

			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}