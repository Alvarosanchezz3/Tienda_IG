package Color;

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

public class Negro {

	private JFrame frame;
	public JPanel Panel_negro; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Negro window = new Negro();
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
	public Negro() {
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
		
		Panel_negro = new JPanel();
		Panel_negro.setBackground(Color.WHITE);
		Panel_negro.setBounds(183, 181, 840, 672);
		frame.getContentPane().add(Panel_negro);
		Panel_negro.setLayout(null);
		
		
		JButton IphoneX_negro = new JButton("");
		IphoneX_negro.setBackground(Color.WHITE);
		IphoneX_negro.setBounds(40, 11, 150, 157);
		Image Res_IphoneX_negro = new javax.swing.ImageIcon(getClass().getResource("/Moviles/IphoneX_negro.png")).getImage().getScaledInstance(155, 173, java.awt.Image.SCALE_SMOOTH);
		IphoneX_negro.setIcon(new ImageIcon(Res_IphoneX_negro));
		Panel_negro.add(IphoneX_negro);
		
		JLabel JL_IphoneX_negro = new JLabel("<html><center> Iphone X 64Gb - 3Gb RAM Negro Libre </html>");
		JL_IphoneX_negro.setHorizontalAlignment(SwingConstants.LEFT);
		JL_IphoneX_negro.setBounds(40, 179, 150, 34);
		Panel_negro.add(JL_IphoneX_negro);
		
		JButton Xiaomi_mi9 = new JButton("");
		Xiaomi_mi9.setBackground(Color.WHITE);
		Xiaomi_mi9.setBounds(246, 11, 150, 157);
		Image Res_Xiaomi_mi9 = new javax.swing.ImageIcon(getClass().getResource("/Moviles/Xiaomi_mi9.jpg")).getImage().getScaledInstance(140, 147, java.awt.Image.SCALE_SMOOTH);
		Xiaomi_mi9.setIcon(new ImageIcon(Res_Xiaomi_mi9));
		Panel_negro.add(Xiaomi_mi9);
		
		JLabel JL_Xiaomi_mi9 = new JLabel("<html><center> Xiaomi MI 9 128Gb - 4Gb RAM Negro Libre </html>");
		JL_Xiaomi_mi9.setHorizontalAlignment(SwingConstants.LEFT);
		JL_Xiaomi_mi9.setBounds(246, 179, 150, 34);
		Panel_negro.add(JL_Xiaomi_mi9);
		
		JButton Sams20 = new JButton("");
		Sams20.setBackground(Color.WHITE);
		Sams20.setBounds(453, 11, 150, 157);
		Image Res_Sams20 = new javax.swing.ImageIcon(getClass().getResource("/Moviles/S20.jpg")).getImage().getScaledInstance(140, 147, java.awt.Image.SCALE_SMOOTH);
		Sams20.setIcon(new ImageIcon(Res_Sams20));
		Panel_negro.add(Sams20);
		
		JLabel JL_Sams20 = new JLabel("<html><center> Samsung S20 64Gb - 6Gb RAM Negro Libre </html>");
		JL_Sams20.setHorizontalAlignment(SwingConstants.LEFT);
		JL_Sams20.setBounds(453, 179, 150, 34);
		Panel_negro.add(JL_Sams20);
		
	}

}
