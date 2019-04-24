package Movements;

import java.awt.Color;

import javax.swing.ImageIcon;

import piezas.Bishop;
import piezas.Horse;
import piezas.King;
import piezas.Pawn;
import piezas.Queen;
import piezas.Root;
import tablero.Layout;

public class Movs {
	private static ImageIcon buttonImage;
	
	public static void chessMovs(int x, int y){
		if (buttonImage == null) {
			buttonImage = (ImageIcon) Layout.buttons[x][y].getIcon();
			Layout.buttons[x][y].setBackground(Color.MAGENTA);
			Layout.buttons[x][y].setIcon(null);
			Layout.casilla[x][y] = "0";
			System.out.println(buttonImage);
			

			if (Layout.userWhite == true) {
				String desc = buttonImage.getDescription();
				switch (desc) {
				case "WH":
				case "BH":
					Horse.horseMove(x, y);
					break;
				case "WP":
					Pawn.pawnWMove(x, y);
					break;
				case "WR":
					Root.rootWMove(x, y);
					break;
				case "WB":
					Bishop.bishWMove(x, y);
					break;
				case "WQ":
					Queen.queenWMove(x, y);
					break;
				case "WK":
					King.kingWMove(x, y);
					break;
				}
			} else {
				String desc = buttonImage.getDescription();
				switch (desc) {
				case "WH":
				case "BH":
					Horse.horseMove(x, y);
					break;
				case "BP":
					Pawn.pawnBMove(x, y);
					break;
				case "BR":
					Root.rootMove(x, y);
					break;
				case "BB":
					Bishop.bishMove(x, y);
					break;
				case "BQ":
					Queen.queenMove(x, y);
					break;
				case "BK":
					King.kingMove(x, y);
					break;
				}
			}
		} else {
			if (Layout.buttons[x][y].getBackground() == Color.GREEN
					|| Layout.buttons[x][y].getBackground() == Color.MAGENTA) {
				Layout.buttons[x][y].setIcon(buttonImage);
				buttonImage = null;

				if (Layout.buttons[x][y].getBackground() == Color.GREEN && Layout.userWhite == true) {
					Layout.casilla[x][y] = "W";
					Layout.userWhite = false;
					//System.out.println("Hello  " + Layout.userWhite);
					//System.out.println(Layout.casilla[x][y]);

				} else if (Layout.buttons[x][y].getBackground() == Color.GREEN && Layout.userWhite == false) {
					Layout.casilla[x][y] = "B";
					Layout.userWhite = true;
					//System.out.println("Hello2  " + Layout.userWhite);
					//System.out.println(Layout.casilla[x][y]);
				}
				Layout.cleanBoard();
			} else {
				System.out.println("Movimiento Invalido");
			}
		}
		
	}
}
