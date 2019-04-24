package tablero;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Automatic extends JFrame {

	File archivo;
	int mas = 5;
	String cadena;
	private JLabel pieza;
	private JTextField pos;
	public static JPanel pane;

	public Automatic() {
		DefaultSet();
		crearArchivo();
		escribirArchivo();
		anadirArchivo();
		LeerArchivo();
		initPanel();
		initp();
	}

	static void initPanel() {
		pane = new JPanel();
		pane.setBackground(Color.YELLOW);
	}

	public void initp() {
		pane.setLayout(null);
		pieza = new JLabel("Pieza:  ");
		pieza.setFont(new Font("arial", 1, 15));
		pos = new JTextField();
		pane.add(pieza);
		pane.add(pos);

	}

	public void DefaultSet() {
		setSize(300, 600); // fijar (ancho, largo.)
		setLocation(1200, 300);
		setTitle("Ajedrez");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(350, 400));
	}

	public void crearArchivo() {
		archivo = new File("prueba.txt");
		try {
			if (archivo.createNewFile()) {
				System.out.println("El archivo se ha creado correctamete");
			}
		} catch (Exception e) {
			System.out.println("no se pudo crear el archivo");
		}

	}

	private void escribirArchivo() {
		try {
			FileWriter escribir = new FileWriter(archivo);
			escribir.write("esta es la 1 prueba escribiendo"); // escribir y
																// sobreescribir

			escribir.close();
		} catch (Exception e) {
			System.err.println("no se pudo escribir el archivo");

		}
	}

	private void anadirArchivo() {
		try {
			FileWriter escribir = new FileWriter(archivo, true);
			escribir.write("\r\n");
			escribir.write("esta es la 2 prueba anadiendo:  " + mas); // escribir
																		// y
																		// sobreescribir

			escribir.close();
		} catch (Exception e) {
			System.err.println("no se pudo escribir el archivo");

		}
	}

	private void LeerArchivo() {
		try {
			FileReader leer = new FileReader(archivo);
			BufferedReader lectura = new BufferedReader(leer);
			cadena = lectura.readLine();
			while (cadena != null) {
				System.out.println(cadena);
				cadena = lectura.readLine();

			}

		} catch (FileNotFoundException e) { // catch para el file reader
			System.err.println(" error 1");
			e.printStackTrace();
		} catch (IOException e) { // catch para el readline
			System.err.println(" error 2");
			e.printStackTrace();
		}
	}

}
