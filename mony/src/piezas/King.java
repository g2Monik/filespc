package piezas;

import java.awt.Color;

import tablero.Layout;

public class King {
	public static void kingMove(int x, int y) {
		try {
			int x1 = x + 1;
			int x2 = x - 1;
			int y1 = y + 1;
			int y2 = y - 1;

			if (y <= 6 && Layout.casilla[x][y1] != "B") {
				Layout.buttons[x][y1].setBackground(Color.GREEN);
			}
			if (y >= 1 && Layout.casilla[x][y2] != "B") {
				Layout.buttons[x][y2].setBackground(Color.GREEN);
			}
			if (x <= 6 && Layout.casilla[x1][y] != "B") {
				Layout.buttons[x1][y].setBackground(Color.GREEN);
			}
			if (x >= 1 && Layout.casilla[2][y] != "B") {
				Layout.buttons[x2][y].setBackground(Color.GREEN);
			}
			if (x <= 6 && y >= 1 && Layout.casilla[x1][y2] != "B") {
				Layout.buttons[x1][y2].setBackground(Color.GREEN);
			}
			if (x >= 1 && y <= 6 && Layout.casilla[x2][y1] != "B") {
				Layout.buttons[x2][y1].setBackground(Color.GREEN);
			}
			if (x <= 6 && y <= 6 && Layout.casilla[x1][y1] != "B") {
				Layout.buttons[x1][y1].setBackground(Color.GREEN);
			}
			if (x >= 1 && y >= 1 && Layout.casilla[x2][y2] != "B") {
				Layout.buttons[x2][y2].setBackground(Color.GREEN);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void kingWMove(int x, int y) {
		try {
			int x1 = x + 1;
			int x2 = x - 1;
			int y1 = y + 1;
			int y2 = y - 1;

			if (y <= 6 && Layout.casilla[x][y1] != "W") {
				Layout.buttons[x][y1].setBackground(Color.GREEN);
			}
			if (y >= 1 && Layout.casilla[x][y2] != "W") {
				Layout.buttons[x][y2].setBackground(Color.GREEN);
			}
			if (x <= 6 && Layout.casilla[x1][y] != "W") {
				Layout.buttons[x1][y].setBackground(Color.GREEN);
			}
			if (x >= 1 && Layout.casilla[2][y] != "W") {
				Layout.buttons[x2][y].setBackground(Color.GREEN);
			}
			if (x <= 6 && y >= 1 && Layout.casilla[x1][y2] != "W") {
				Layout.buttons[x1][y2].setBackground(Color.GREEN);
			}
			if (x >= 1 && y <= 6 && Layout.casilla[x2][y1] != "W") {
				Layout.buttons[x2][y1].setBackground(Color.GREEN);
			}
			if (x <= 6 && y <= 6 && Layout.casilla[x1][y1] != "W") {
				Layout.buttons[x1][y1].setBackground(Color.GREEN);
			}
			if (x >= 1 && y >= 1 && Layout.casilla[x2][y2] != "W") {
				Layout.buttons[x2][y2].setBackground(Color.GREEN);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
