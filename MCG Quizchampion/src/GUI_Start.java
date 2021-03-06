import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;

public class GUI_Start extends JFrame {

	private JPanel contentPane;
	private JLabel lblTitel;
	private JLabel lblRegeln;
	private JLabel lblSpieleranzahl;
	private JButton btnLaden;
	private JButton btnStart;
	private JTextField txtSpielername1;
	private JTextField txtSpielername2;
	private JButton btnEinSpieler;
	private JButton btnZweiSpieler;
	private JButton btnDreiSpieler;
	private JTextField txtSpielername3;
	private final ButtonGroup btnGroupSpielerZahl = new ButtonGroup();
	private JButton btnTest;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Start frame = new GUI_Start();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI_Start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTitel = new JLabel("MCG Quizchampions");
		lblTitel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitel.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblTitel.setBounds(347, 45, 290, 50);
		contentPane.add(lblTitel);
		
		lblRegeln = new JLabel("Regeln");
		lblRegeln.setBounds(347, 150, 596, 434);
		contentPane.add(lblRegeln);
		
		lblSpieleranzahl = new JLabel("Spieler-Anzahl");
		lblSpieleranzahl.setBounds(54, 150, 96, 14);
		contentPane.add(lblSpieleranzahl);
		
		btnLaden = new JButton("Laden");
		btnLaden.setBounds(71, 660, 200, 23);
		contentPane.add(btnLaden);
		
		btnStart = new JButton("Start");
		btnStart.setBounds(344, 603, 89, 23);
		contentPane.add(btnStart);
		
		txtSpielername1 = new JTextField();
		txtSpielername1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HauptKlasse.setSpielername1(txtSpielername1.getText());
				
			}
		});
		txtSpielername1.setText("Spielername 1");
		txtSpielername1.setBounds(54, 218, 100, 20);
		contentPane.add(txtSpielername1);
		txtSpielername1.setColumns(10);
		
		txtSpielername2 = new JTextField();
		txtSpielername2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HauptKlasse.setSpielername2(txtSpielername2.getText());
			}
		});
		txtSpielername2.setText("Spielername 2");
		txtSpielername2.setBounds(54, 307, 100, 20);
		contentPane.add(txtSpielername2);
		txtSpielername2.setColumns(10);
		
		btnEinSpieler = new JButton("1 Spieler");
		btnGroupSpielerZahl.add(btnEinSpieler);
		btnEinSpieler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HauptKlasse.setSpielerZahl(1);
				System.out.println("Ein Spieler gewaehlt!");
			}
		});
		btnEinSpieler.setBounds(54, 188, 89, 23);
		contentPane.add(btnEinSpieler);
		
		btnZweiSpieler = new JButton("2 Spieler");
		btnGroupSpielerZahl.add(btnZweiSpieler);
		btnZweiSpieler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HauptKlasse.setSpielerZahl(2);
				System.out.println("Zwei Spieler gewaehlt!");
			}
		});
		btnZweiSpieler.setBounds(54, 273, 89, 23);
		contentPane.add(btnZweiSpieler);
		
		btnDreiSpieler = new JButton("3 Spieler");
		btnGroupSpielerZahl.add(btnDreiSpieler);
		btnDreiSpieler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HauptKlasse.setSpielerZahl(3);
				System.out.println("Drei Spieler gewaehlt!");
			}
		});
		btnDreiSpieler.setBounds(54, 356, 89, 23);
		contentPane.add(btnDreiSpieler);
		
		txtSpielername3 = new JTextField();
		txtSpielername3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HauptKlasse.setSpielername3(txtSpielername3.getText());
			}
		});
		txtSpielername3.setText("Spielername 3");
		txtSpielername3.setBounds(54, 390, 100, 20);
		contentPane.add(txtSpielername3);
		txtSpielername3.setColumns(10);
		
		btnTest = new JButton("test");
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(HauptKlasse.getSpielername1());
				System.out.println(HauptKlasse.getSpielername2());
				System.out.println(HauptKlasse.getSpielername3());
			}
		});
		btnTest.setBounds(54, 68, 89, 23);
		contentPane.add(btnTest);
	}
}
