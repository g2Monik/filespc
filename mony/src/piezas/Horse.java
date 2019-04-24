package piezas;

import java.awt.Color;
import java.util.ArrayList;

import tablero.Layout;

public class Horse {

	public static void horseMove(int x, int y) {
		try {			
				if (x == 0 && y == 0 && Layout.casilla[x][y] == "B") { // Posiciones de X=0
					Layout.buttons[x + 1][y + 2].setBackground(Color.GREEN);
					Layout.buttons[x + 2][y + 1].setBackground(Color.GREEN);
				} else if (x == 0 && y == 1 && Layout.casilla[x][y] != "B") {
					Layout.buttons[x + 1][y + 2].setBackground(Color.GREEN);
					Layout.buttons[x + 2][y + 1].setBackground(Color.GREEN);
					Layout.buttons[x + 2][y - 1].setBackground(Color.GREEN);
				} else if (x == 0 && (2 < y && y <= 5 && Layout.casilla[x][y] != "B")) {
					Layout.buttons[x + 1][y + 2].setBackground(Color.GREEN);
					Layout.buttons[x + 2][y + 1].setBackground(Color.GREEN);
					Layout.buttons[x + 2][y - 1].setBackground(Color.GREEN);
					Layout.buttons[x + 1][y - 2].setBackground(Color.GREEN);
				} else if (x == 0 && y == 7 && Layout.casilla[x][y] != "B") {
					Layout.buttons[x + 1][y - 2].setBackground(Color.GREEN);
					Layout.buttons[x + 2][y - 1].setBackground(Color.GREEN);
				} else if (x == 0 && y == 6 && Layout.casilla[x][y] != "B") {
					Layout.buttons[x + 2][y + 1].setBackground(Color.GREEN);
					Layout.buttons[x + 2][y - 1].setBackground(Color.GREEN);
					Layout.buttons[x + 1][y - 2].setBackground(Color.GREEN);
				} else if (x == 1 && y == 0 && Layout.casilla[x][y] != "B") {// Posiciones de X= 1
					Layout.buttons[x - 1][y + 2].setBackground(Color.GREEN);
					Layout.buttons[x + 1][y + 2].setBackground(Color.GREEN);
					Layout.buttons[x + 2][y + 1].setBackground(Color.GREEN);

				} else if (x == 1 && y == 1 && Layout.casilla[x][y] != "B") {
					Layout.buttons[x - 1][y + 2].setBackground(Color.GREEN);
					Layout.buttons[x + 1][y + 2].setBackground(Color.GREEN);
					Layout.buttons[x + 2][y + 1].setBackground(Color.GREEN);
					Layout.buttons[x + 2][y - 1].setBackground(Color.GREEN);

				} else if (x == 1 && (2 <= y && y <= 5) && Layout.casilla[x][y] != "B") {
					Layout.buttons[x - 1][y + 2].setBackground(Color.GREEN);
					Layout.buttons[x + 1][y + 2].setBackground(Color.GREEN);
					Layout.buttons[x + 2][y + 1].setBackground(Color.GREEN);
					Layout.buttons[x + 2][y - 1].setBackground(Color.GREEN);
					Layout.buttons[x + 1][y - 2].setBackground(Color.GREEN);
					Layout.buttons[x - 1][y - 2].setBackground(Color.GREEN);

				} else if (x == 1 && y == 6 && Layout.casilla[x][y] != "B") {
					Layout.buttons[x - 1][y + 2].setBackground(Color.GREEN);
					Layout.buttons[x + 1][y + 2].setBackground(Color.GREEN);
					Layout.buttons[x + 2][y + 1].setBackground(Color.GREEN);
					Layout.buttons[x + 2][y - 1].setBackground(Color.GREEN);

				} else if (x == 1 && y == 7 && Layout.casilla[x][y] != "B") {
					Layout.buttons[x - 1][y - 2].setBackground(Color.GREEN);
					Layout.buttons[x + 1][y - 2].setBackground(Color.GREEN);
					Layout.buttons[x + 2][y - 1].setBackground(Color.GREEN);

				} else if ((x >= 2 && x <= 5) && (y >= 2 && x <= 5) && Layout.casilla[x][y] != "B") {
					Layout.buttons[x - 2][y - 1].setBackground(Color.GREEN);
					Layout.buttons[x - 2][y + 1].setBackground(Color.GREEN);
					Layout.buttons[x - 1][y + 2].setBackground(Color.GREEN);
					Layout.buttons[x + 1][y + 2].setBackground(Color.GREEN);
					Layout.buttons[x + 2][y + 1].setBackground(Color.GREEN);
					Layout.buttons[x + 2][y - 1].setBackground(Color.GREEN);
					Layout.buttons[x + 1][y - 2].setBackground(Color.GREEN);
					Layout.buttons[x - 1][y - 2].setBackground(Color.GREEN);

				} else if (x == 7 && y == 0 && Layout.casilla[x][y] != "B") { // Movimientos en X = 7
					Layout.buttons[x - 2][y + 1].setBackground(Color.GREEN);
					Layout.buttons[x - 1][y + 2].setBackground(Color.GREEN);

				} else if (x == 7 && y == 1 && Layout.casilla[x][y] != "B") {
					Layout.buttons[x - 2][y + 1].setBackground(Color.GREEN);
					Layout.buttons[x - 1][y + 2].setBackground(Color.GREEN);
					Layout.buttons[x - 2][y - 1].setBackground(Color.GREEN);

				} else if (x == 7 && (2 <= y && y <= 5) && Layout.casilla[x][y] != "B") {
					Layout.buttons[x - 2][y - 1].setBackground(Color.GREEN);
					Layout.buttons[x - 2][y + 1].setBackground(Color.GREEN);
					Layout.buttons[x - 1][y + 2].setBackground(Color.GREEN);
					Layout.buttons[x - 1][y - 2].setBackground(Color.GREEN);

				} else if (x == 7 && y == 6 && Layout.casilla[x][y] != "B") {
					Layout.buttons[x - 2][y - 1].setBackground(Color.GREEN);
					Layout.buttons[x - 2][y + 1].setBackground(Color.GREEN);
					Layout.buttons[x - 1][y - 2].setBackground(Color.GREEN);

				} else if (x == 7 && y == 7 && Layout.casilla[x][y] != "B") {
					Layout.buttons[x - 2][y - 1].setBackground(Color.GREEN);
					Layout.buttons[x - 1][y - 2].setBackground(Color.GREEN);

				} else if (x == 6 && y == 0 && Layout.casilla[x][y] != "B") { // Movimientos en X = 6
					Layout.buttons[x - 2][y + 1].setBackground(Color.GREEN);
					Layout.buttons[x - 1][y + 2].setBackground(Color.GREEN);
					Layout.buttons[x + 1][y + 2].setBackground(Color.GREEN);

				} else if (x == 6 && y == 1 && Layout.casilla[x][y] != "B") {
					Layout.buttons[x - 2][y - 1].setBackground(Color.GREEN);
					Layout.buttons[x - 2][y + 1].setBackground(Color.GREEN);
					Layout.buttons[x - 1][y + 2].setBackground(Color.GREEN);
					Layout.buttons[x + 1][y + 2].setBackground(Color.GREEN);

				} else if (x == 6 && (2 <= y && y <= 5) && Layout.casilla[x][y] != "B") {
					Layout.buttons[x - 2][y - 1].setBackground(Color.GREEN);
					Layout.buttons[x - 2][y + 1].setBackground(Color.GREEN);
					Layout.buttons[x - 1][y + 2].setBackground(Color.GREEN);
					Layout.buttons[x + 1][y + 2].setBackground(Color.GREEN);
					Layout.buttons[x + 1][y - 2].setBackground(Color.GREEN);
					Layout.buttons[x - 1][y - 2].setBackground(Color.GREEN);

				} else if (x == 6 && y == 6 && Layout.casilla[x][y] != "B") {
					Layout.buttons[x - 2][y - 1].setBackground(Color.GREEN);
					Layout.buttons[x - 2][y + 1].setBackground(Color.GREEN);
					Layout.buttons[x + 1][y - 2].setBackground(Color.GREEN);
					Layout.buttons[x - 1][y - 2].setBackground(Color.GREEN);

				} else if (x == 6 && y == 7 && Layout.casilla[x][y] != "B") {
					Layout.buttons[x - 2][y - 1].setBackground(Color.GREEN);
					Layout.buttons[x + 1][y - 2].setBackground(Color.GREEN);
					Layout.buttons[x - 1][y - 2].setBackground(Color.GREEN);

				}
				
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
