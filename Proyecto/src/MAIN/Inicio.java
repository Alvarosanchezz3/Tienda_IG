package MAIN;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Toolkit;



public class Inicio {

	private JFrame frame;
	private JTextField Usuario;
	private JPasswordField passwordField;
	
	private JTextField usuario_regist;
	private JPasswordField contraseña_regist;
	
	//SQL
	private String Nombre_u;
	private String Ctrn;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Inicio() {
		initialize();
	}
	

	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Inicio.class.getResource("/Imagenes/Logo.png")).getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
		frame.setBounds(400, 50, 1039, 892);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Inicio de sesión");
		frame.setResizable(false);
		@SuppressWarnings("unused")
		
		
		Image Res_imagen = new javax.swing.ImageIcon(getClass().getResource("/Imagenes_inicioSesion/city.png")).getImage().getScaledInstance(301, 561, java.awt.Image.SCALE_SMOOTH);
		frame.getContentPane().setLayout(null);
		
		JLabel IniciarSesion = new JLabel(" lNICIAR SESI\u00D3N");
		IniciarSesion.setBounds(28, 84, 228, 46);
		IniciarSesion.setFont(new Font("Roboto Black", Font.ITALIC, 23));
		IniciarSesion.setHorizontalAlignment(SwingConstants.LEFT);
		frame.getContentPane().add(IniciarSesion);
		
		JLabel JL_Usuario = new JLabel("USUARIO :");
		JL_Usuario.setBounds(28, 141, 143, 29);
		JL_Usuario.setFont(new Font("Roboto Black", Font.BOLD, 15));
		frame.getContentPane().add(JL_Usuario);
		
		Usuario = new JTextField();
		Usuario.setBounds(28, 181, 307, 35);
		Usuario.setForeground(Color.GRAY);
		Usuario.setText("");
		Usuario.setBorder(null);
		frame.getContentPane().add(Usuario);
		Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
            	
            
            }});
		
		JLabel Contraseña = new JLabel("CONTRASE\u00D1A :");
		Contraseña.setBounds(28, 227, 143, 29);
		Contraseña.setFont(new Font("Roboto Black", Font.BOLD, 15));
		frame.getContentPane().add(Contraseña);
		
		JButton Entrar = new JButton("ENTRAR");
		Entrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Entrar.addActionListener(new ActionListener() {
			

			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {	
				try { 
		        	 Class.forName("com.mysql.cj.jdbc.Driver");
		             Connection con=DriverManager.getConnection(
		                     "jdbc:mysql://localhost:3306/OGT","root","");
		             java.sql.Statement stmt=con.createStatement();  
		            String st= "SELECT * FROM usuarios WHERE Nombre_u = '" + Usuario.getText()+"'";
		            	System.out.println(st);
		            	ResultSet rs= stmt.executeQuery(st);
		             System.out.println("Connected"); 
		             if (rs.next()) {
		            	 
		        	  String contra = rs.getString("Ctrn");
		        	  String usu = rs.getString("Nombre_u");
		        	  if (contra.equals(passwordField.getText())) {
		        		  Tienda tienda = new Tienda(Usuario.getText());
		        		  tienda.frame.setVisible(true);
		        		  frame.setVisible(false);
		        	  } else {
		        		 JOptionPane.showMessageDialog(Entrar, "Contraseña incorrecta", "Error", 0);
		        		  
		        	  }
		        	}else {
		        		JOptionPane.showMessageDialog(Entrar, "Usuario incorrecto", "Error", 0);
		        	}
		        }
		        catch(Exception e1)
		        {
		            System.out.println(e1);
		        }
		    }  
				
			
		});
		Entrar.setBounds(28, 327, 239, 71);
		Entrar.setForeground(Color.WHITE);
		Entrar.setBackground(new java.awt.Color(0, 134, 190));
		frame.getContentPane().add(Entrar);
	
		passwordField = new JPasswordField();
		passwordField.setBounds(28, 267, 307, 35);
		passwordField.setToolTipText("");
		passwordField.setBorder(null);
		frame.getContentPane().add(passwordField);
		
		JLabel JL_logo = new JLabel("OGT");
		JL_logo.setBounds(99, 27, 110, 46);
		JL_logo.setHorizontalAlignment(SwingConstants.LEFT);
		JL_logo.setFont(new Font("Roboto Black", Font.ITALIC, 23));
		frame.getContentPane().add(JL_logo);
		
		JLabel Circulo = new JLabel("");
		Circulo.setBounds(28, 27, 61, 46);
		Image Res_circulo = new javax.swing.ImageIcon(getClass().getResource("/Imagenes_inicioSesion/circulo.jpg")).getImage().getScaledInstance(61, 46, java.awt.Image.SCALE_SMOOTH);
		Circulo.setIcon(new ImageIcon(Res_circulo));
		frame.getContentPane().add(Circulo);
		
		// Panel city
		Image Res_city = new javax.swing.ImageIcon(getClass().getResource("/Imagenes_inicioSesion/city.png")).getImage().getScaledInstance(356, 853, java.awt.Image.SCALE_SMOOTH);
		JPanel panel = new JPanel() { 
			private static final long serialVersionUID = 1L;

			@Override
			  protected void paintComponent(Graphics g) {

			    super.paintComponent(g);
			        g.drawImage(Res_city, 0, 0, null);
			}
		}; 
		panel.setBounds(667, 0, 356, 853);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Logo = new JLabel("");
		Logo.setBounds(36, 280, 300, 250);
		panel.add(Logo);
		Logo.setHorizontalAlignment(SwingConstants.CENTER);
		Image Res_logo = new javax.swing.ImageIcon(getClass().getResource("/Imagenes_inicioSesion/Logo.png")).getImage().getScaledInstance(500, 450, java.awt.Image.SCALE_SMOOTH);
		Logo.setIcon(new ImageIcon(Res_logo));
		
		JLabel Registrarse = new JLabel("REGISTRARSE");
		Registrarse.setHorizontalAlignment(SwingConstants.LEFT);
		Registrarse.setFont(new Font("Roboto Black", Font.ITALIC, 23));
		Registrarse.setBounds(28, 468, 228, 46);
		frame.getContentPane().add(Registrarse);
		
		JLabel JL_Usuario_regist = new JLabel("NOMBRE DE USUARIO :");
		JL_Usuario_regist.setFont(new Font("Roboto Black", Font.BOLD, 15));
		JL_Usuario_regist.setBounds(28, 527, 228, 29);
		frame.getContentPane().add(JL_Usuario_regist);
		
		usuario_regist = new JTextField();
		usuario_regist.setText("");
		usuario_regist.setForeground(Color.GRAY);
		usuario_regist.setBorder(null);
		usuario_regist.setBounds(28, 574, 307, 35);
		frame.getContentPane().add(usuario_regist);
		
		JLabel Contraseña_regist = new JLabel("CONTRASE\u00D1A :");
		Contraseña_regist.setFont(new Font("Roboto Black", Font.BOLD, 15));
		Contraseña_regist.setBounds(28, 620, 143, 29);
		frame.getContentPane().add(Contraseña_regist);
		
		contraseña_regist = new JPasswordField();
		contraseña_regist.setToolTipText("");
		contraseña_regist.setBorder(null);
		contraseña_regist.setBounds(28, 660, 307, 35);
		frame.getContentPane().add(contraseña_regist);
		
		JButton Registarse = new JButton("Registrarse");
		Registarse.setForeground(Color.WHITE);
		Registarse.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Registarse.setBackground(new Color(0, 134, 190));
		Registarse.setBounds(28, 721, 239, 71);
		frame.getContentPane().add(Registarse);	
		Registarse.addActionListener(new ActionListener() {	
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
			Nombre_u = "'" + usuario_regist.getText() + "'";
			Ctrn = "'" + contraseña_regist.getText() + "'"; // sale eso por ser contraseña
				
				try
			        {
			        	 Class.forName("com.mysql.cj.jdbc.Driver");
			             Connection con=DriverManager.getConnection(
			                     "jdbc:mysql://localhost:3306/OGT","root","");
			             java.sql.Statement stmt=con.createStatement();  
			            String st= "INSERT INTO usuarios (Nombre_u, Ctrn)\r\n"
			            		+ "VALUES ("+Nombre_u  + ", "+ Ctrn + ")";
			            System.out.println(st);
			             stmt.execute(st);
			             System.out.println("Connected");
			             JOptionPane.showMessageDialog(null, "Registro realizado con éxito");
			        }
			        catch(Exception e1)
			        {
			            System.out.println(e1);
			        }
			}
		});
		
		JLabel JL_Usuario_regist_1 = new JLabel("\u00BFNo tienes una cuenta? Registrate!");
		JL_Usuario_regist_1.setFont(new Font("Roboto Black", Font.BOLD, 15));
		JL_Usuario_regist_1.setBounds(28, 423, 270, 29);
		frame.getContentPane().add(JL_Usuario_regist_1);
		
		
	}
}
