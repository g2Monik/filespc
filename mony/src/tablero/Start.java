package tablero;

import javax.swing.*;

import tablero.Settings;

import java.awt.*;
import java.awt.event.*;

public class Start extends JFrame implements ActionListener {

	private JMenuBar menuOptions;
	private JMenu options;
	private JMenuItem opt1, opt2, opt3;
	private String user11, user22;
	private JLabel grettings, welcome, luser1, luser2;
	private JTextField user1, user2;
	private JButton save;

	public Start() {
		Settings.DefaultSet(this);
		Settings.initPanel(this);
		content();
		save();
	}

	public void content() {
		Settings.panel.setLayout(null);
		menuOptions = new JMenuBar();
		setJMenuBar(menuOptions);
		options = new JMenu("Juego");
		menuOptions.add(options);
		opt1 = new JMenuItem("Juego Nuevo");
		opt1.addActionListener(this);
		options.add(opt1);
		opt2 = new JMenuItem("Juego Nuevo \"escrito\"");
		opt2.addActionListener(this);
		options.add(opt2);
		opt3 = new JMenuItem("Salir");
		opt3.addActionListener(this);
		options.add(opt3);

		welcome = new JLabel("Juego de Ajedrez");
		welcome.setFont(new Font("arial", 1, 20));
		Settings.panel.add(welcome);
		welcome.setBounds(200, 15, 350, 50);
		luser1 = new JLabel("Jugador 1:  ");
		luser1.setFont(new Font("arial", 1, 15));
		user1 = new JTextField();
		Settings.panel.add(luser1);
		Settings.panel.add(user1);
		luser1.setBounds(100, 80, 80, 30);
		user1.setBounds(250, 82, 150, 30);
		luser2 = new JLabel("Jugador 2: ");
		luser2.setFont(new Font("arial", 1, 15));
		user2 = new JTextField();
		Settings.panel.add(luser2);
		Settings.panel.add(user2);
		luser2.setBounds(100, 150, 80, 30);
		user2.setBounds(250, 152, 150, 30);

	}

	public void save() {
		save = new JButton("Guardar");
		Settings.panel.add(save);
		save.setBounds(190, 230, 150, 30);

		grettings = new JLabel();
		grettings.setBounds(80, 280, 500, 40);
		grettings.setFont(new Font("arial", 1, 20));
		Settings.panel.add(grettings);

		ActionListener saveNames = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				user11 = user1.getText();
				user22 = user2.getText();
				grettings.setText(user1.getText() + "Jugara con blancas." + user2.getText() + "Jugra con negras");
			}
		};
		save.addActionListener(saveNames);
	}

	public void actionPerformed(ActionEvent e) {
		Container f = this.getContentPane();
		if (e.getSource() == opt1) {
			Settings.close(this);
			Layout v1 = new Layout();
			v1.setVisible(true);
		} else if (e.getSource() == opt2) {
			Settings.close(this);
			Automatic v2 = new Automatic();
			v2.setVisible(true);
		} else if (e.getSource() == opt3) {
			Settings.close(this);

		}
	}

}