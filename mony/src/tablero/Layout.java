package tablero;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout extends JFrame {
	public static JButton[][] buttons = new JButton[8][8];
	public static String casilla[][] = new String[8][8];
	public static Boolean userWhite = true;

	public Layout() {
		llenarCasillas();
		Settings.DefaultSet(this);
		Settings.initPanel(this);
		init();

	}

	public static void llenarCasillas() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				casilla[i][j] = "0";
			}
		}
	}

	public static void cleanBoard() {
		for (int i = 0; i < buttons.length; i++) {
			for (int j = 0; j < buttons.length; j++) {
				buttons[i][j].setBackground(null);
				if ((i + j + 1) % 2 == 0) {
					buttons[i][j].setBackground(Color.BLACK);

				}
			}
		}
	}

	public static void init() {
		Settings.panel.setLayout(new GridLayout(8, 8));

		for (int i = 0; i < buttons.length; i++) {
			for (int j = 0; j < buttons.length; j++) {
				JButton newButton = new JButton();
				buttons[i][j] = newButton;
				MyActionListener myActionListener = new MyActionListener(i, j);
				newButton.addActionListener(myActionListener);

				Settings.panel.add(buttons[i][j]).setPreferredSize(new Dimension(50, 50));
				if ((i + j + 1) % 2 == 0) {
					buttons[i][j].setBackground(Color.BLACK);
				}

			}
		}

		ImageIcon BK = new ImageIcon("src/Images/BK.png");
		buttons[7][4].setIcon(new ImageIcon(BK.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH), "BK"));
		casilla[7][4] = "B";
		ImageIcon bqueen = new ImageIcon("src/Images/BQ.png");
		buttons[7][3].setIcon(new ImageIcon(bqueen.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH), "BQ"));
		casilla[7][3] = "B";
		ImageIcon bbishopl = new ImageIcon("src/Images/BB.png");
		buttons[7][2].setIcon(new ImageIcon(bbishopl.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH), "BB"));
		casilla[7][2] = "B";
		ImageIcon bbishopr = new ImageIcon("src/Images/BB.png");
		buttons[7][5].setIcon(new ImageIcon(bbishopr.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH), "BB"));
		casilla[7][5] = "B";
		ImageIcon bhorsel = new ImageIcon("src/Images/BH.png");
		buttons[7][1].setIcon(new ImageIcon(bhorsel.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH), "BH"));
		casilla[7][1] = "B";
		ImageIcon bhorser = new ImageIcon("src/Images/BH.png");
		buttons[7][6].setIcon(new ImageIcon(bhorser.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH), "BH"));
		casilla[7][6] = "B";
		ImageIcon brootl = new ImageIcon("src/Images/BR.png");
		buttons[7][0].setIcon(new ImageIcon(brootl.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH), "BR"));
		casilla[7][0] = "B";
		ImageIcon brootr = new ImageIcon("src/Images/BR.png");
		buttons[7][7].setIcon(new ImageIcon(brootr.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH), "BR"));
		casilla[7][7] = "B";

		for (int i = 0; i < 8; i++) {
			ImageIcon bpawn = new ImageIcon("src/Images/BP.png");
			buttons[6][i].setIcon(new ImageIcon(bpawn.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH), "BP"));
			casilla[6][i] = "B";
		}

		ImageIcon wking = new ImageIcon("src/Images/WK.png");
		buttons[0][4].setIcon(new ImageIcon(wking.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH), "WK"));
		casilla[0][4] = "W";
		ImageIcon wqueen = new ImageIcon("src/Images/WQ.png");
		buttons[0][3].setIcon(new ImageIcon(wqueen.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH), "WQ"));
		casilla[0][3] = "W";
		ImageIcon wbishopl = new ImageIcon("src/Images/WB.png");
		buttons[0][2].setIcon(new ImageIcon(wbishopl.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH), "WB"));
		casilla[0][2] = "W";
		ImageIcon wbishopr = new ImageIcon("src/Images/WB.png");
		buttons[0][5].setIcon(new ImageIcon(wbishopr.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH), "WB"));
		casilla[0][5] = "W";
		ImageIcon whorsel = new ImageIcon("src/Images/WH.png");
		buttons[0][1].setIcon(new ImageIcon(whorsel.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH), "WH"));
		casilla[0][1] = "W";
		ImageIcon whorser = new ImageIcon("src/Images/WH.png");
		buttons[0][6].setIcon(new ImageIcon(whorser.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH), "WH"));
		casilla[0][6] = "W";
		ImageIcon wrootl = new ImageIcon("src/Images/WR.png");
		buttons[0][0].setIcon(new ImageIcon(wrootl.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH), "WR"));
		casilla[0][0] = "W";
		ImageIcon wrootr = new ImageIcon("src/Images/WR.png");
		buttons[0][7].setIcon(new ImageIcon(wrootr.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH), "WR"));
		casilla[0][7] = "W";
		for (int i = 0; i < 8; i++) {
			ImageIcon bpawn = new ImageIcon("src/Images/WP.png");
			buttons[1][i].setIcon(new ImageIcon(bpawn.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH), "WP"));
			casilla[1][i] = "W";
		}
	}
}
