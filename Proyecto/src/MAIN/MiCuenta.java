package MAIN;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiCuenta {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiCuenta window = new MiCuenta();
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
	public MiCuenta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 248, 255));
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JLabel label = new JLabel("");
		label.setBounds(244, 0, 271, 97);
		frame.getContentPane().add(label);
		Image logo = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png")).getImage().getScaledInstance(240, 240, java.awt.Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(logo));
        
        JLabel correo = new JLabel("Direcci\u00F3n de correo electr\u00F3nico:\r\n");
        correo.setBounds(60, 173, 260, 26);
        correo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
        frame.getContentPane().add(correo);
        
        textField = new JTextField();
        textField.setBounds(60, 201, 217, 20);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("Direcci\u00F3n de env\u00EDo:");
        lblNewLabel_1.setBounds(60, 305, 176, 14);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
        frame.getContentPane().add(lblNewLabel_1);
        
        textField_2 = new JTextField();
        textField_2.setBounds(60, 338, 217, 26);
        frame.getContentPane().add(textField_2);
        textField_2.setColumns(10);
        
        JLabel lblNewLabel_2 = new JLabel("DNI o NIF:");
        lblNewLabel_2.setBounds(60, 241, 104, 14);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
        frame.getContentPane().add(lblNewLabel_2);
        
        textField_3 = new JTextField();
        textField_3.setBounds(60, 266, 217, 20);
        textField_3.setText("\r\n");
        frame.getContentPane().add(textField_3);
        textField_3.setColumns(10);
        
        JLabel lblNewLabel_3 = new JLabel("Provincia:");
        lblNewLabel_3.setBounds(503, 179, 157, 14);
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
        frame.getContentPane().add(lblNewLabel_3);
        
        textField_4 = new JTextField();
        textField_4.setBounds(503, 204, 217, 20);
        frame.getContentPane().add(textField_4);
        textField_4.setColumns(10);
        
        JLabel lblNewLabel_4 = new JLabel("C\u00F3digo Postal:");
        lblNewLabel_4.setBounds(503, 241, 162, 26);
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
        frame.getContentPane().add(lblNewLabel_4);
        
        textField_5 = new JTextField();
        textField_5.setBounds(503, 278, 217, 20);
        frame.getContentPane().add(textField_5);
        textField_5.setColumns(10);
        
        JLabel lblNewLabel_5 = new JLabel("Datos Personales:");
        lblNewLabel_5.setBounds(332, 122, 131, 40);
        lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
        frame.getContentPane().add(lblNewLabel_5);
        
        JButton save = new JButton("Guardar y salir");
        
        save.setBounds(503, 344, 217, 55);
        save.setBackground(new Color(248, 248, 255));
        save.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
        frame.getContentPane().add(save);
        save.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		frame.setVisible(false);
        		Tienda t = new Tienda(null);
        		t.frame.setVisible(true);
        	}
        });
        
        JLabel lblNewLabel_1_1 = new JLabel("Informaci\u00F3n adicional:");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
        lblNewLabel_1_1.setBounds(60, 380, 176, 14);
        frame.getContentPane().add(lblNewLabel_1_1);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(60, 412, 217, 26);
        frame.getContentPane().add(textField_1);
		
	}
}