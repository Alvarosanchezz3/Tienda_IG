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

public class Samsung {

	private JFrame frame;
	public JPanel Panel_sams;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Samsung window = new Samsung();
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
	public Samsung() {
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
		
		Panel_sams = new JPanel();
		Panel_sams.setBackground(Color.WHITE);
		Panel_sams.setBounds(183, 181, 840, 672);
		frame.getContentPane().add(Panel_sams);
		Panel_sams.setLayout(null);
		
		JButton Sams20 = new JButton("");
		Sams20.setBackground(Color.WHITE);
		Sams20.setBounds(246, 11, 150, 157);
		Image Res_Sams20 = new javax.swing.ImageIcon(getClass().getResource("/Moviles/S20.jpg")).getImage().getScaledInstance(140, 147, java.awt.Image.SCALE_SMOOTH);
		Sams20.setIcon(new ImageIcon(Res_Sams20));
		Panel_sams.add(Sams20);
		
		JLabel JL_Sams20 = new JLabel("<html><center> Samsung S20 64Gb - 6Gb RAM Negro Libre </html>");
		JL_Sams20.setHorizontalAlignment(SwingConstants.LEFT);
		JL_Sams20.setBounds(246, 179, 150, 34);
		Panel_sams.add(JL_Sams20);
		
		JButton Sams21 = new JButton("");
		Sams21.setBackground(Color.WHITE);
		Sams21.setBounds(40, 11, 150, 157);
		Image Res_Sams21 = new javax.swing.ImageIcon(getClass().getResource("/Moviles/S21.jpg")).getImage().getScaledInstance(150, 157, java.awt.Image.SCALE_SMOOTH);
		Sams21.setIcon(new ImageIcon(Res_Sams21));
		Panel_sams.add(Sams21);
		
		JLabel JL_Sams21 = new JLabel("<html><center> Samsung S21 256Gb - 8Gb RAM Plata Libre </html>");
		JL_Sams21.setHorizontalAlignment(SwingConstants.LEFT);
		JL_Sams21.setBounds(40, 179, 150, 34);
		Panel_sams.add(JL_Sams21);
		
	}

}
