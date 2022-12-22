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

public class MuyGrande {

	private JFrame frame;
	public JPanel Panel_Grandon; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MuyGrande window = new MuyGrande();
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
	public MuyGrande() {
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
		
		Panel_Grandon = new JPanel();
		Panel_Grandon.setBackground(Color.WHITE);
		Panel_Grandon.setBounds(183, 181, 840, 672);
		frame.getContentPane().add(Panel_Grandon);
		Panel_Grandon.setLayout(null);
		
		JButton Xiaomi_mi10pro = new JButton("");
		Xiaomi_mi10pro.setBackground(Color.WHITE);
		Xiaomi_mi10pro.setBounds(246, 11, 150, 157);
		Image Res_Xiaomi_mi10pro = new javax.swing.ImageIcon(getClass().getResource("/Moviles/Xiaomi10.jpg")).getImage().getScaledInstance(140, 147, java.awt.Image.SCALE_SMOOTH);
		Xiaomi_mi10pro.setIcon(new ImageIcon(Res_Xiaomi_mi10pro));
		Panel_Grandon.add(Xiaomi_mi10pro);
		
		JLabel JL_Xiaomi_mi10pro = new JLabel("<html><center> Xiaomi MI 10 Pro 512Gb - 8Gb RAM Plata Libre </html>");
		JL_Xiaomi_mi10pro.setHorizontalAlignment(SwingConstants.LEFT);
		JL_Xiaomi_mi10pro.setBounds(246, 179, 150, 34);
		Panel_Grandon.add(JL_Xiaomi_mi10pro);
		
		JButton Sams21 = new JButton("");
		Sams21.setBackground(Color.WHITE);
		Sams21.setBounds(40, 11, 150, 157);
		Image Res_Sams21 = new javax.swing.ImageIcon(getClass().getResource("/Moviles/S21.jpg")).getImage().getScaledInstance(150, 157, java.awt.Image.SCALE_SMOOTH);
		Sams21.setIcon(new ImageIcon(Res_Sams21));
		Panel_Grandon.add(Sams21);
		
		JLabel JL_Sams21 = new JLabel("<html><center> Samsung S21 256Gb - 8Gb RAM Plata Libre </html>");
		JL_Sams21.setHorizontalAlignment(SwingConstants.LEFT);
		JL_Sams21.setBounds(40, 179, 150, 34);
		Panel_Grandon.add(JL_Sams21);

	}

}
