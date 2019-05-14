import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_Kategoriewahl extends JFrame {

	private JPanel contentPane;
	private JLabel lblKat;
	private JButton btnKategorie1;
	private JButton btnKategorie2;
	private JButton btnKategorie3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Kategoriewahl frame = new GUI_Kategoriewahl();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//Zufällige Kategorie
	public void zufaelligeKategorienauswahl(int anzahlKategorien)
	{
		String ausgewaehlteKategorie;
		
		//Aufruf: zufaelligeKategorienauswahl(HauptKlasse.fragenkatalog.kategorien.size())
		
	}
	

	/**
	 * Create the frame.
	 */
	public GUI_Kategoriewahl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblKat = new JLabel("Waehle eine Kategorie");
		lblKat.setBounds(184, 0, 48, 14);
		contentPane.add(lblKat);
		
		btnKategorie1 = new JButton("");
		btnKategorie1.setBounds(162, 28, 89, 23);
		contentPane.add(btnKategorie1);
		
		btnKategorie2 = new JButton("");
		btnKategorie2.setBounds(162, 112, 89, 23);
		contentPane.add(btnKategorie2);
		
		btnKategorie3 = new JButton("");
		btnKategorie3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnKategorie3.setBounds(162, 181, 89, 23);
		contentPane.add(btnKategorie3);
	}
}
