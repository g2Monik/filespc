package piezas;

import java.awt.Color;
import java.util.ArrayList;

import tablero.Layout;

public class Root {

	public static void rootMove(int x, int y) {

		try {
			int n = y;
			int m = x;
			int p = y;
			int q = x;

			while (n <= 6 && Layout.casilla[x][n] == "0") {
				n++;
				if (Layout.casilla[x][n] == "B") {
					Layout.buttons[x][n].setBackground(null);
				} else {
					Layout.buttons[x][n].setBackground(Color.GREEN);
				}
			}
			while (m <= 6 && Layout.casilla[m][y] == "0") {
				m++;
				if (Layout.casilla[m][y] == "B") {
					Layout.buttons[m][y].setBackground(null);
				} else {
					Layout.buttons[m][y].setBackground(Color.GREEN);
				}
			}
			while (p >= 1 && Layout.casilla[x][p] == "0") {
				p--;
				if (Layout.casilla[x][p] == "B") {
					Layout.buttons[x][p].setBackground(null);
				} else {
					Layout.buttons[x][p].setBackground(Color.GREEN);
				}
			}
			while (q >= 1 && Layout.casilla[q][y] == "0") {
				q--;
				if (Layout.casilla[q][y] == "B") {
					Layout.buttons[q][y].setBackground(null);
				} else {
					Layout.buttons[q][y].setBackground(Color.GREEN);
				}
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

	public static void rootWMove(int x, int y) {

		try {
			int n = y;
			int m = x;
			int p = y;
			int q = x;

			while (n <= 6 && Layout.casilla[x][n] == "0") {
				n++;
				if (Layout.casilla[x][n] == "W") {
					Layout.buttons[x][n].setBackground(null);
				} else {
					Layout.buttons[x][n].setBackground(Color.GREEN);
				}
			}
			while (m <= 6 && Layout.casilla[m][y] == "0") {
				m++;
				if (Layout.casilla[m][y] == "W") {
					Layout.buttons[m][y].setBackground(null);
				} else {
					Layout.buttons[m][y].setBackground(Color.GREEN);
				}
			}
			while (p >= 1 && Layout.casilla[x][p] == "0") {
				p--;
				if (Layout.casilla[x][p] == "W") {
					Layout.buttons[x][p].setBackground(null);
				} else {
					Layout.buttons[x][p].setBackground(Color.GREEN);
				}
			}
			while (q >= 1 && Layout.casilla[q][y] == "0") {
				q--;
				if (Layout.casilla[q][y] == "W") {
					Layout.buttons[q][y].setBackground(null);
				} else {
					Layout.buttons[q][y].setBackground(Color.GREEN);
				}
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
}