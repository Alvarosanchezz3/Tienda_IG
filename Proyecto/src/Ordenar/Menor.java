package Ordenar;

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

public class Menor {

	private JFrame frame;
	public JPanel Panel_menor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menor window = new Menor();
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
	public Menor() {
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
		
		Panel_menor = new JPanel();
		Panel_menor.setBackground(Color.WHITE);
		Panel_menor.setBounds(183, 181, 840, 672);
		frame.getContentPane().add(Panel_menor);
		Panel_menor.setLayout(null);
		
		JButton Iphone7_plata = new JButton("");
		Iphone7_plata.setBounds(40, 11, 150, 157);
		Image Res_Iphone7_plata = new javax.swing.ImageIcon(getClass().getResource("/Moviles/Iphone7_plata.jpg")).getImage().getScaledInstance(155, 162, java.awt.Image.SCALE_SMOOTH);
		Iphone7_plata.setIcon(new ImageIcon(Res_Iphone7_plata));
		Panel_menor.add(Iphone7_plata);
		
		JLabel JL_Iphone7_plata = new JLabel("<html><center> Iphone 7 32Gb - 3Gb RAM Plata Libre </html>");
		JL_Iphone7_plata.setHorizontalAlignment(SwingConstants.LEFT);
		JL_Iphone7_plata.setBounds(40, 179, 150, 34);
		Panel_menor.add(JL_Iphone7_plata);
		
		JButton IphoneX_negro = new JButton("");
		IphoneX_negro.setBackground(Color.WHITE);
		IphoneX_negro.setBounds(40, 224, 150, 157);
		Image Res_IphoneX_negro = new javax.swing.ImageIcon(getClass().getResource("/Moviles/IphoneX_negro.png")).getImage().getScaledInstance(155, 173, java.awt.Image.SCALE_SMOOTH);
		IphoneX_negro.setIcon(new ImageIcon(Res_IphoneX_negro));
		Panel_menor.add(IphoneX_negro);
		
		JLabel JL_IphoneX_negro = new JLabel("<html><center> Iphone X 64Gb - 3Gb RAM Negro Libre </html>");
		JL_IphoneX_negro.setHorizontalAlignment(SwingConstants.LEFT);
		JL_IphoneX_negro.setBounds(40, 392, 150, 34);
		Panel_menor.add(JL_IphoneX_negro);
		
		JButton Xiaomi_mi9 = new JButton("");
		Xiaomi_mi9.setBackground(Color.WHITE);
		Xiaomi_mi9.setBounds(246, 11, 150, 157);
		Image Res_Xiaomi_mi9 = new javax.swing.ImageIcon(getClass().getResource("/Moviles/Xiaomi_mi9.jpg")).getImage().getScaledInstance(140, 147, java.awt.Image.SCALE_SMOOTH);
		Xiaomi_mi9.setIcon(new ImageIcon(Res_Xiaomi_mi9));
		Panel_menor.add(Xiaomi_mi9);
		
		JLabel JL_Xiaomi_mi9 = new JLabel("<html><center> Xiaomi MI 9 128Gb - 4Gb RAM Negro Libre </html>");
		JL_Xiaomi_mi9.setHorizontalAlignment(SwingConstants.LEFT);
		JL_Xiaomi_mi9.setBounds(246, 179, 150, 34);
		Panel_menor.add(JL_Xiaomi_mi9);
		
		JButton Xiaomi_mi10pro = new JButton("");
		Xiaomi_mi10pro.setBackground(Color.WHITE);
		Xiaomi_mi10pro.setBounds(657, 11, 150, 157);
		Image Res_Xiaomi_mi10pro = new javax.swing.ImageIcon(getClass().getResource("/Moviles/Xiaomi10.jpg")).getImage().getScaledInstance(140, 147, java.awt.Image.SCALE_SMOOTH);
		Xiaomi_mi10pro.setIcon(new ImageIcon(Res_Xiaomi_mi10pro));
		Panel_menor.add(Xiaomi_mi10pro);
		
		JLabel JL_Xiaomi_mi10pro = new JLabel("<html><center> Xiaomi MI 10 Pro 512Gb - 8Gb RAM Plata Libre </html>");
		JL_Xiaomi_mi10pro.setHorizontalAlignment(SwingConstants.LEFT);
		JL_Xiaomi_mi10pro.setBounds(657, 179, 150, 34);
		Panel_menor.add(JL_Xiaomi_mi10pro);
		
		JButton Sams20 = new JButton("");
		Sams20.setBackground(Color.WHITE);
		Sams20.setBounds(453, 11, 150, 157);
		Image Res_Sams20 = new javax.swing.ImageIcon(getClass().getResource("/Moviles/S20.jpg")).getImage().getScaledInstance(140, 147, java.awt.Image.SCALE_SMOOTH);
		Sams20.setIcon(new ImageIcon(Res_Sams20));
		Panel_menor.add(Sams20);
		
		JLabel JL_Sams20 = new JLabel("<html><center> Samsung S20 64Gb - 6Gb RAM Negro Libre </html>");
		JL_Sams20.setHorizontalAlignment(SwingConstants.LEFT);
		JL_Sams20.setBounds(453, 179, 150, 34);
		Panel_menor.add(JL_Sams20);
		
		JButton Sams21 = new JButton("");
		Sams21.setBackground(Color.WHITE);
		Sams21.setBounds(246, 224, 150, 157);
		Image Res_Sams21 = new javax.swing.ImageIcon(getClass().getResource("/Moviles/S21.jpg")).getImage().getScaledInstance(150, 157, java.awt.Image.SCALE_SMOOTH);
		Sams21.setIcon(new ImageIcon(Res_Sams21));
		Panel_menor.add(Sams21);
		
		JLabel JL_Sams21 = new JLabel("<html><center> Samsung S21 256Gb - 8Gb RAM Plata Libre </html>");
		JL_Sams21.setHorizontalAlignment(SwingConstants.LEFT);
		JL_Sams21.setBounds(246, 392, 150, 34);
		Panel_menor.add(JL_Sams21);
		
	}

}
