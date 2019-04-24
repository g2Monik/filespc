package piezas;

import java.awt.Color;
import java.util.ArrayList;

import tablero.Layout;

public class Pawn {

	public static void pawnBMove(int x, int y) {

		try {

			if (x == 6 && Layout.casilla[x - 1][y] == "0") {
				Layout.buttons[x - 1][y].setBackground(Color.GREEN);
				Layout.buttons[x - 2][y].setBackground(Color.GREEN);
			} else if (Layout.casilla[x - 1][y] == "0") {
				Layout.buttons[x - 1][y].setBackground(Color.GREEN);
			} else if (Layout.casilla[x - 1][y + 1] == "W" && Layout.casilla[x - 1][y - 1] == "W") {
				Layout.buttons[x - 1][y + 1].setBackground(Color.GREEN);
				Layout.buttons[x - 1][y - 1].setBackground(Color.GREEN);
			} else if (Layout.casilla[x - 1][y + 1] == "W") {
				Layout.buttons[x - 1][y + 1].setBackground(Color.GREEN);
			} else if (Layout.casilla[x - 1][y - 1] == "W") {
				Layout.buttons[x - 1][y - 1].setBackground(Color.GREEN);

			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void pawnWMove(int x, int y) {
		try {
			if (x == 1 && Layout.casilla[x + 1][y] == "0") {
				Layout.buttons[x + 1][y].setBackground(Color.GREEN);
				Layout.buttons[x + 2][y].setBackground(Color.GREEN);
			} else if (Layout.casilla[x + 1][y] != "0") {
				Layout.buttons[x + 1][y].setBackground(Color.GREEN);
			} else if (Layout.casilla[x + 1][y + 1] == "B" && Layout.casilla[x + 1][y - 1] == "B") {
				Layout.buttons[x + 1][y + 1].setBackground(Color.GREEN);
				Layout.buttons[x + 1][y - 1].setBackground(Color.GREEN);
			} else if (Layout.casilla[x + 1][y - 1] == "B") {
				Layout.buttons[x + 1][y - 1].setBackground(Color.GREEN);
			}else if (Layout.casilla[x + 1][y + 1] == "B") {
				Layout.buttons[x + 1][y + 1].setBackground(Color.GREEN);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
