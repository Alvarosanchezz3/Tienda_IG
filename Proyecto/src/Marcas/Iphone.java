package Marcas;

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

public class Iphone {

	private JFrame frame;
	public JPanel Panel_iphone;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Iphone window = new Iphone();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Iphone() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
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
		
		Panel_iphone = new JPanel();
		Panel_iphone.setBackground(Color.WHITE);
		Panel_iphone.setBounds(183, 181, 840, 672);
		frame.getContentPane().add(Panel_iphone);
		Panel_iphone.setLayout(null);
		
		JButton Iphone7_plata = new JButton("");
		Iphone7_plata.setBounds(40, 11, 150, 157);
		Image Res_Iphone7_plata = new javax.swing.ImageIcon(getClass().getResource("/Moviles/Iphone7_plata.jpg")).getImage().getScaledInstance(155, 162, java.awt.Image.SCALE_SMOOTH);
		Iphone7_plata.setIcon(new ImageIcon(Res_Iphone7_plata));
		Panel_iphone.add(Iphone7_plata);
		
		JLabel JL_Iphone7_plata = new JLabel("<html><center> Iphone 7 32Gb - 3Gb RAM Plata Libre </html>");
		JL_Iphone7_plata.setHorizontalAlignment(SwingConstants.LEFT);
		JL_Iphone7_plata.setBounds(40, 179, 150, 34);
		Panel_iphone.add(JL_Iphone7_plata);
		
		JButton IphoneX_negro = new JButton("");
		IphoneX_negro.setBackground(Color.WHITE);
		IphoneX_negro.setBounds(246, 11, 150, 157);
		Image Res_IphoneX_negro = new javax.swing.ImageIcon(getClass().getResource("/Moviles/IphoneX_negro.png")).getImage().getScaledInstance(155, 173, java.awt.Image.SCALE_SMOOTH);
		IphoneX_negro.setIcon(new ImageIcon(Res_IphoneX_negro));
		Panel_iphone.add(IphoneX_negro);
		
		JLabel JL_IphoneX_negro = new JLabel("<html><center> Iphone X 64Gb - 3Gb RAM Negro Libre </html>");
		JL_IphoneX_negro.setHorizontalAlignment(SwingConstants.LEFT);
		JL_IphoneX_negro.setBounds(246, 179, 150, 34);
		Panel_iphone.add(JL_IphoneX_negro);

		
	}

}
