package tablero;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Settings {

	public static JPanel panel;

	static void DefaultSet(JFrame x) {
		x.setSize(600, 600); // fijar (ancho, largo.)
		x.setLocationRelativeTo(null);
		x.setTitle("Ajedrez");
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		x.setMinimumSize(new Dimension(350, 350));
	}

	static void initPanel(JFrame x) {
		panel = new JPanel();
		x.getContentPane().add(panel);

	}

	static void close(JFrame x) {
		x.dispose();
	}
}