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

public class Grande {

	private JFrame frame;
	public JPanel Panel_Grande; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grande window = new Grande();
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
	public Grande() {
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
		
		Panel_Grande = new JPanel();
		Panel_Grande.setBackground(Color.WHITE);
		Panel_Grande.setBounds(183, 181, 840, 672);
		frame.getContentPane().add(Panel_Grande);
		Panel_Grande.setLayout(null);
		
		JButton Xiaomi_mi9 = new JButton("");
		Xiaomi_mi9.setBackground(Color.WHITE);
		Xiaomi_mi9.setBounds(40, 11, 150, 157);
		Image Res_Xiaomi_mi9 = new javax.swing.ImageIcon(getClass().getResource("/Moviles/Xiaomi_mi9.jpg")).getImage().getScaledInstance(140, 147, java.awt.Image.SCALE_SMOOTH);
		Xiaomi_mi9.setIcon(new ImageIcon(Res_Xiaomi_mi9));
		Panel_Grande.add(Xiaomi_mi9);
		
		JLabel JL_Xiaomi_mi9 = new JLabel("<html><center> Xiaomi MI 9 128Gb - 4Gb RAM Negro Libre </html>");
		JL_Xiaomi_mi9.setHorizontalAlignment(SwingConstants.LEFT);
		JL_Xiaomi_mi9.setBounds(40, 179, 150, 34);
		Panel_Grande.add(JL_Xiaomi_mi9);
		
		

	}

}
