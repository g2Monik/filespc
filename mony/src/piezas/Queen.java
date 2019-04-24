package piezas;

import java.awt.Color;

import tablero.Layout;

public class Queen {

	public static void queenMove(int x, int y) {
		int x1 = x;
		int y1 = y;
		int x2 = x;
		int y2 = y;
		int x3 = x;
		int y3 = y;
		int n = y;
		int m = x;
		int p = y;
		int q = x;
		try {
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

	public static void queenWMove(int x, int y) {
		int x1 = x;
		int y1 = y;
		int x2 = x;
		int y2 = y;
		int x3 = x;
		int y3 = y;
		int n = y;
		int m = x;
		int p = y;
		int q = x;
		try {
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
