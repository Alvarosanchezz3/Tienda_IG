package Almacenamiento;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Chiquito {

	private JFrame frame;
	public JPanel Panel_chiquito; 

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chiquito window = new Chiquito();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Chiquito() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Roboto Black", Font.BOLD, 12));
		frame.setBackground(Color.WHITE);
		frame.setResizable(false); // No deja maximizar la pantalla
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(400, 50, 1039, 892);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Tienda OGT");	
		
		Panel_chiquito = new JPanel();
		Panel_chiquito.setBackground(Color.WHITE);
		Panel_chiquito.setBounds(183, 181, 840, 672);
		frame.getContentPane().add(Panel_chiquito);
		Panel_chiquito.setLayout(null);
	
		JButton Iphone7_plata = new JButton("");
		Iphone7_plata.setBounds(40, 11, 150, 157);
		Image Res_Iphone7_plata = new javax.swing.ImageIcon(getClass().getResource("/Moviles/Iphone7_plata.jpg")).getImage().getScaledInstance(155, 162, java.awt.Image.SCALE_SMOOTH);
		Iphone7_plata.setIcon(new ImageIcon(Res_Iphone7_plata));
		Panel_chiquito.add(Iphone7_plata);
		
		JLabel JL_Iphone7_plata = new JLabel("<html><center> Iphone 7 32Gb - 3Gb RAM Plata Libre </html>");
		JL_Iphone7_plata.setHorizontalAlignment(SwingConstants.LEFT);
		JL_Iphone7_plata.setBounds(40, 179, 150, 34);
		Panel_chiquito.add(JL_Iphone7_plata);
		
	}

}
