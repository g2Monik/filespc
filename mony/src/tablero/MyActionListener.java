package tablero;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.ImageIcon;

import Movements.Movs;
import piezas.Bishop;
import piezas.Horse;
import piezas.King;
import piezas.Pawn;
import piezas.Queen;
import piezas.Root;

public class MyActionListener implements ActionListener {

	private int x;
	private int y;

	public MyActionListener(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Movs.chessMovs(x, y);

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}