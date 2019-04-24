
package tablero;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import Movements.Movs;

public class ValidMoves  implements Runnable{
	Thread hilo = new Thread(this);

	public static int fromX;
	public static int fromY;
	public static int toX;
	public static int toY;
	

	public ValidMoves() {
		hilo.start();
	}


	public void run() {

		try {
			File archivo = new File("moves.xml");
			DocumentBuilderFactory una = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = una.newDocumentBuilder();
			Document document = documentBuilder.parse(archivo);
			document.getDocumentElement().normalize();

			System.out.println("Elemento raiz:" + document.getDocumentElement().getNodeName());
			for (int jugada = 0; jugada < 15; jugada++) {
				String sJugada = "Jugada" + jugada;
				NodeList Movements = document.getElementsByTagName(sJugada);
				for (int temp = 0; temp < Movements.getLength(); temp++) {
					Node nodo = Movements.item(temp);
					//System.out.println("Elemento:" + nodo.getNodeName());
					if (nodo.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) nodo;
						fromX = Integer.parseInt(element.getElementsByTagName("FromX").item(0).getTextContent());
						System.out.println(fromX);
						fromY = Integer.parseInt(element.getElementsByTagName("FromY").item(0).getTextContent());
						System.out.println(fromY);
						toX = Integer.parseInt(element.getElementsByTagName("ToX").item(0).getTextContent());
						System.out.println(toX);
						toY = Integer.parseInt(element.getElementsByTagName("Toy").item(0).getTextContent());
						System.out.println(toY);
						// System.out.println("X2: " +
						// element.getElementsByTagName("ToX").item(0).getTextContent());
						// System.out.println("Y2: " +
						// element.getElementsByTagName("Toy").item(0).getTextContent());

						Movs.chessMovs(fromX, fromY);
						hilo.sleep(600);
						Movs.chessMovs(toX, toY);
						hilo.sleep(600);
						
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
