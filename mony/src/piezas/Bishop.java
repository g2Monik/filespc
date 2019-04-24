package piezas;

import java.awt.Color;

import tablero.Layout;

public class Bishop {

	public static void bishMove(int x, int y) {
		int x1 = x;
		int y1 = y;
		int x2 = x;
		int y2 = y;
		int x3 = x;
		int y3 = y;
		try {
			while (x >= 1 && y >= 1 && Layout.casilla[x][y] == "0") {
				x--;
				y--;
				if (Layout.casilla[x][y] == "B") {
					Layout.buttons[x][y].setBackground(null);
				} else {
					Layout.buttons[x][y].setBackground(Color.GREEN);
				}
			}
			while (x1 <= 6 && y1 <= 6 && Layout.casilla[x1][y1] == "0") {
				x1++;
				y1++;
				if (Layout.casilla[x1][y1] == "B") {
					Layout.buttons[x1][y1].setBackground(null);
				} else {
					Layout.buttons[x1][y1].setBackground(Color.GREEN);
				}
			}
			while (x2 >= 1 && y2 <= 6 && Layout.casilla[x2][y2] == "0") {
				x2--;
				y2++;
				if (Layout.casilla[x2][y2] == "B") {
					Layout.buttons[x2][y2].setBackground(null);
				} else {
					Layout.buttons[x2][y2].setBackground(Color.GREEN);
				}
			}
			while (x3 <= 6 && y3 >= 1 && Layout.casilla[x3][y3] == "0") {
				x3++;
				y3--;
				if (Layout.casilla[x3][y3] == "B") {
					Layout.buttons[x3][y3].setBackground(null);
				} else {
					Layout.buttons[x3][y3].setBackground(Color.GREEN);
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void bishWMove(int x, int y) {
		int x1 = x;
		int y1 = y;
		int x2 = x;
		int y2 = y;
		int x3 = x;
		int y3 = y;
		try {
			while (x >= 1 && y >= 1 && Layout.casilla[x][y] == "0") {
				x--;
				y--;
				if (Layout.casilla[x][y] == "W") {
					Layout.buttons[x][y].setBackground(null);
				} else {
					Layout.buttons[x][y].setBackground(Color.GREEN);
				}
			}
			while (x1 <= 6 && y1 <= 6 && Layout.casilla[x1][y1] == "0") {
				x1++;
				y1++;
				if (Layout.casilla[x1][y1] == "W") {
					Layout.buttons[x1][y1].setBackground(null);
				} else {
					Layout.buttons[x1][y1].setBackground(Color.GREEN);
				}
			}
			while (x2 >= 1 && y2 <= 6 && Layout.casilla[x2][y2] == "0") {
				x2--;
				y2++;
				if (Layout.casilla[x2][y2] == "W") {
					Layout.buttons[x2][y2].setBackground(null);
				} else {
					Layout.buttons[x2][y2].setBackground(Color.GREEN);
				}
			}
			while (x3 <= 6 && y3 >= 1 && Layout.casilla[x3][y3] == "0") {
				x3++;
				y3--;
				if (Layout.casilla[x3][y3] == "W") {
					Layout.buttons[x3][y3].setBackground(null);
				} else {
					Layout.buttons[x3][y3].setBackground(Color.GREEN);
				}
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
