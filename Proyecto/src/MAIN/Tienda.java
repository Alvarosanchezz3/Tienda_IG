package MAIN;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Transparency;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import Almacenamiento.Chiquito;
import Almacenamiento.Grande;
import Almacenamiento.Mediano;
import Almacenamiento.MuyGrande;
import Color.Negro;
import Color.Plata;
import Marcas.Iphone;
import Marcas.Samsung;
import Marcas.Xiaomi;
import Ordenar.Mayor;
import Ordenar.Menor;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.LineBorder;

public class Tienda {

	public JFrame frame;
	private JTextField Buscador;
	private JPanel Panel_moviles;
	private JLabel Filtro;
	private JLabel Titulo_moviles;
	
	Iphone iphone = new Iphone();
	Xiaomi xiao = new Xiaomi();
	Samsung sams = new Samsung();
	
	MuyGrande mG = new MuyGrande();
	Grande grande = new Grande();
	Mediano med = new Mediano();
	Chiquito poco = new Chiquito();
	
	Negro negro = new Negro();
	Plata plata = new Plata();
	
	
	
	private int cont = 0;
	private JScrollPane Panel_carrito;
	private int Num_pedido;
	
	private JSpinner spinner1;
	private JSpinner spinner2;
	private JSpinner spinner3;
	private JSpinner spinner4;
	private JSpinner spinner5;
	private JSpinner spinner6;
	
	private JTable table;
	private JComboBox<?> comboBox;
	
	Inicio inicio = new Inicio();
	public DefaultTableModel modelo = new DefaultTableModel();
	private JButton BotonComprar; 
	private String usuario;
	public JButton Carrito;
	private double importe1;
	private double importe2;
	private double importe3;
	private double importe4;
	private double importe5;
	private double importe6;
	private double importeTotal;
	private JLabel JL_ImporteTotal;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda window = new Tienda("pepe");
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Tienda(String usu) {
		this.usuario=usu;
		initialize();	
		table.setModel(modelo);
		
	}


	@SuppressWarnings({ "unchecked", "rawtypes" })
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
			
		// Imagen icono logo tienda
		Image Res_icono = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png")).getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
		frame.setIconImage(Res_icono);
	
		// Jpanel principal //
		
		JPanel panel = new JPanel();
		panel.setBackground(new java.awt.Color(0, 134, 190));
		panel.setBounds(0, 0, 1023, 101);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Buscador = new JTextField();		
		Buscador.setFont(new Font("Tahoma", Font.BOLD, 15));
		Buscador.setBounds(120, 30, 518, 44);
		panel.add(Buscador);
		Buscador.setBorder(BorderFactory.createLineBorder(null, Transparency.TRANSLUCENT));
		
		
		Carrito = new JButton("Mi carrito ("+cont+")");		// Carrito
		Carrito.setBounds(843, 30, 153, 44);
		panel.add(Carrito);
		Carrito.setFont(new Font("Tahoma", Font.BOLD, 12));
		Carrito.setBackground(Color.WHITE);
		Carrito.setBorder(BorderFactory.createLineBorder(null, Transparency.TRANSLUCENT));
		Image Res_carrito = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Carrito.png")).getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
		Carrito.setIcon(new ImageIcon(Res_carrito));	
		Carrito.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				importeTotal = importe1 + importe2 + importe3 + importe4 + importe5 + importe6;
				double round = Math.round(importeTotal);
				
				Panel_moviles.setVisible(false);
				Panel_carrito.setVisible(true);
				Filtro.setText("");
				Titulo_moviles.setText("  Mi Carrito:");
				comboBox.setVisible(false);
				BotonComprar.setVisible(true);
				JL_ImporteTotal.setVisible(true);
				JL_ImporteTotal.setText("Importe Total: " + round);
				
				iphone.Panel_iphone.setVisible(false);
				xiao.Panel_xiaomi.setVisible(false);
				sams.Panel_sams.setVisible(false);
				
				mG.Panel_Grandon.setVisible(false);
				grande.Panel_Grande.setVisible(false);
				med.Panel_mediano.setVisible(false);
				poco.Panel_chiquito.setVisible(false);
				
				negro.Panel_negro.setVisible(false);
				plata.Panel_plata.setVisible(false);
				
			}
		});
		
		JButton Lupa = new JButton("");		// Button lupa
		Lupa.setBackground(Color.WHITE);
		Lupa.setBounds(637, 30, 47, 44);
		Lupa.setBorder(BorderFactory.createLineBorder(null, Transparency.TRANSLUCENT));
		Image Res_lupa = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lupa.png")).getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		Lupa.setIcon(new ImageIcon(Res_lupa));	
		panel.add(Lupa);
		Lupa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Buscador.getText().equals("Iphone")) {
					Iphone iphone = new Iphone();
					Panel_moviles.setVisible(false);
					frame.getContentPane().add(iphone.Panel_iphone);
					iphone.Panel_iphone.setVisible(true);
					comboBox.setVisible(false);
					Filtro.setText(" Móviles Iphone");
				}
				
				if (Buscador.getText().equals("Xiaomi")) {
					Xiaomi xiao = new Xiaomi();
					Panel_moviles.setVisible(false);
					frame.getContentPane().add(xiao.Panel_xiaomi);
					xiao.Panel_xiaomi.setVisible(true);
					comboBox.setVisible(false);
					Filtro.setText(" Móviles Xiaomi");
				}
				
				if (Buscador.getText().equals("Samsung")) {
					Samsung sams = new Samsung();
					Panel_moviles.setVisible(false);
					frame.getContentPane().add(sams.Panel_sams);
					sams.Panel_sams.setVisible(true);
					comboBox.setVisible(false);
					Filtro.setText(" Móviles Samsung");
				}
			}
		});
		
		JLabel Cuenta = new JLabel("Hola, " + this.usuario);
		Cuenta.setFont(new Font("Tahoma", Font.BOLD, 12));
		Cuenta.setBackground(Color.WHITE);
		Cuenta.setBounds(689, 30, 148, 44);
		Cuenta.setBorder(BorderFactory.createLineBorder(null, Transparency.TRANSLUCENT));
		Cuenta.setOpaque(true);
		Image Res_cuenta = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono.png")).getImage().getScaledInstance(35, 35, java.awt.Image.SCALE_SMOOTH);
		Cuenta.setIcon(new ImageIcon(Res_cuenta));
		panel.add(Cuenta);
		
		
		JButton Logo = new JButton();
		Logo.setHorizontalAlignment(SwingConstants.CENTER);
		Logo.setBounds(18, 13, 92, 67);
		Logo.setBackground(new java.awt.Color(0, 134, 190));
		Logo.setBorder(null);
		Image Res_logo = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png")).getImage().getScaledInstance(140, 140, java.awt.Image.SCALE_SMOOTH);	
		Logo.setIcon(new ImageIcon(Res_logo));
		panel.add(Logo);
		Logo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_moviles.setVisible(true);
			}
		});
		// Termina el primer Jpanel //
		
		// Jpanel de los filtros //
		
		JPanel Panel_filtros = new JPanel(); 
		Panel_filtros.setBorder(new LineBorder(new Color(0, 0, 0)));
		Panel_filtros.setBackground(Color.WHITE);
		Panel_filtros.setBounds(0, 100, 184, 753);
		Panel_filtros.setLayout(null);
		frame.getContentPane().add(Panel_filtros);
		
		JLabel Usuario_menu = new JLabel(" Bienvenido ");	// Usuario filtros
		Usuario_menu.setFont(new Font("Tahoma", Font.BOLD, 14));
		Usuario_menu.setForeground(Color.WHITE);
		Usuario_menu.setBounds(0, 0, 184, 43);
		Usuario_menu.setOpaque(true);
		Usuario_menu.setBackground(Color.DARK_GRAY);
		Image Res_cuenta1 = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono.png")).getImage().getScaledInstance(35, 35, java.awt.Image.SCALE_SMOOTH);
		Usuario_menu.setIcon(new ImageIcon(Res_cuenta1));
		Panel_filtros.add(Usuario_menu);
		
			// Marcas
		
		JLabel JL_Marcas = new JLabel("   Marcas");
		JL_Marcas.setFont(new Font("Tahoma", Font.BOLD, 14));
		JL_Marcas.setHorizontalAlignment(SwingConstants.LEFT);
		JL_Marcas.setBounds(0, 43, 184, 35);
		Panel_filtros.add(JL_Marcas);
		
		JButton Butt_Iphone = new JButton("Iphone");		
		Butt_Iphone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_moviles.setVisible(false);
				frame.getContentPane().add(iphone.Panel_iphone);
				iphone.Panel_iphone.setVisible(true);
				Filtro.setText(" Móviles Iphone");
			}
		});
		Butt_Iphone.setBounds(0, 81, 184, 35);
		Butt_Iphone.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Butt_Iphone.setBackground(Color.WHITE);
		Panel_filtros.add(Butt_Iphone);
		
		JButton Butt_Xiaomi = new JButton("Xiaomi");		
		Butt_Xiaomi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_moviles.setVisible(false);
				frame.getContentPane().add(xiao.Panel_xiaomi);
				xiao.Panel_xiaomi.setVisible(true);
				Filtro.setText(" Móviles Xiaomi");
			}
		});
		Butt_Xiaomi.setBounds(0, 114, 184, 35);
		Butt_Xiaomi.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Butt_Xiaomi.setBackground(Color.WHITE);
		Panel_filtros.add(Butt_Xiaomi);
		
		JButton Butt_Sams = new JButton("Samsung");		
		Butt_Sams.setBounds(0, 147, 184, 35);
		Butt_Sams.setBackground(Color.WHITE);
		Butt_Sams.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Panel_filtros.add(Butt_Sams);
		Butt_Sams.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_moviles.setVisible(false);
				frame.getContentPane().add(sams.Panel_sams);
				sams.Panel_sams.setVisible(true);
				Filtro.setText(" Móviles Samsung");
			}
		});
		
		JSeparator separator1 = new JSeparator();
		separator1.setBounds(0, 195, 184, 2);
		Panel_filtros.add(separator1);
		
			// Almacenamiento
		
		JLabel JL_Almacenamiento = new JLabel("   Almacenamiento");
		JL_Almacenamiento.setHorizontalAlignment(SwingConstants.LEFT);
		JL_Almacenamiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		JL_Almacenamiento.setBounds(0, 193, 184, 35);
		Panel_filtros.add(JL_Almacenamiento);
		
		JButton Butt_Alm256 = new JButton("+256Gb ");
		Butt_Alm256.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Butt_Alm256.setBackground(Color.WHITE);
		Butt_Alm256.setBounds(0, 229, 184, 35);
		Panel_filtros.add(Butt_Alm256);
		Butt_Alm256.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_moviles.setVisible(false);
				frame.getContentPane().add(mG.Panel_Grandon);
				mG.Panel_Grandon.setVisible(true);
				Filtro.setText(" Móviles de 256Gb de almacenamiento");
				
			}
		});
			
		
		JButton Butt_Alm128 = new JButton("128Gb");
		Butt_Alm128.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Butt_Alm128.setBackground(Color.WHITE);
		Butt_Alm128.setBounds(0, 262, 184, 35);
		Panel_filtros.add(Butt_Alm128);
		Butt_Alm128.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_moviles.setVisible(false);
				frame.getContentPane().add(grande.Panel_Grande);
				grande.Panel_Grande.setVisible(true);
				Filtro.setText(" Móviles de 128Gb de almacenamiento");
				
			}
		});
		
		
		JButton Butt_Alm64 = new JButton("64Gb");
		Butt_Alm64.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Butt_Alm64.setBackground(Color.WHITE);
		Butt_Alm64.setBounds(0, 295, 184, 35);
		Panel_filtros.add(Butt_Alm64);
		Butt_Alm64.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_moviles.setVisible(false);
				frame.getContentPane().add(med.Panel_mediano);
				med.Panel_mediano.setVisible(true);
				Filtro.setText(" Móviles de 64Gb de almacenamiento");
				
			}
		});
		
		
		JButton Butt_Alm32 = new JButton("32Gb");
		Butt_Alm32.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Butt_Alm32.setBackground(Color.WHITE);
		Butt_Alm32.setBounds(0, 328, 184, 35);
		Panel_filtros.add(Butt_Alm32);
		Butt_Alm32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_moviles.setVisible(false);
				frame.getContentPane().add(poco.Panel_chiquito);
				poco.Panel_chiquito.setVisible(true);
				Filtro.setText(" Móviles de 32Gb de almacenamiento");
			}
		});
		
		
		JSeparator Separator2 = new JSeparator();
		Separator2.setBounds(0, 375, 184, 2);
		Panel_filtros.add(Separator2);
		
			// Color
		
		JLabel JL_Color = new JLabel("   Color");
		JL_Color.setHorizontalAlignment(SwingConstants.LEFT);
		JL_Color.setFont(new Font("Tahoma", Font.BOLD, 14));
		JL_Color.setBounds(0, 375, 184, 35);
		Panel_filtros.add(JL_Color);
		
		
		JButton Butt_Col_negro = new JButton("Negro");
		Butt_Col_negro.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Butt_Col_negro.setBackground(Color.WHITE);
		Butt_Col_negro.setBounds(0, 408, 184, 35);
		Panel_filtros.add(Butt_Col_negro);
		Butt_Col_negro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_moviles.setVisible(false);
				frame.getContentPane().add(negro.Panel_negro);
				negro.Panel_negro.setVisible(true);
				Filtro.setText(" Móviles de color negro");
			}
		});
		
		JButton Butt_Col_plata = new JButton("Plata");
		Butt_Col_plata.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Butt_Col_plata.setBackground(Color.WHITE);
		Butt_Col_plata.setBounds(0, 441, 184, 35);
		Panel_filtros.add(Butt_Col_plata);
		Butt_Col_plata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel_moviles.setVisible(false);
				frame.getContentPane().add(plata.Panel_plata);
				plata.Panel_plata.setVisible(true);
				Filtro.setText(" Móviles de color plata");
				
			}
		});
		
		JSeparator Separator3 = new JSeparator();
		Separator3.setBounds(0, 487, 184, 2);
		Panel_filtros.add(Separator3);
	
			// Ayuda y ajustes
		
		JLabel JL_Ayuda_Ajustes = new JLabel("   Ayuda y ajustes");
		JL_Ayuda_Ajustes.setHorizontalAlignment(SwingConstants.LEFT);
		JL_Ayuda_Ajustes.setFont(new Font("Tahoma", Font.BOLD, 14));
		JL_Ayuda_Ajustes.setBounds(0, 487, 184, 35);
		Panel_filtros.add(JL_Ayuda_Ajustes);
		
		JButton Butt_DatosPers = new JButton("Datos personales");
		Butt_DatosPers.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Butt_DatosPers.setBackground(Color.WHITE);
		Butt_DatosPers.setBounds(0, 529, 184, 35);
		Panel_filtros.add(Butt_DatosPers);
		Butt_DatosPers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MiCuenta cuenta = new MiCuenta();
				cuenta.frame.setVisible(true);
				frame.setVisible(false);
				
			}
		});
		
		JButton Butt_salir = new JButton("Salir");		
		Butt_salir.setFont(new Font("Tahoma", Font.PLAIN, 11));
		Butt_salir.setBackground(Color.WHITE);
		Butt_salir.setBounds(0, 562, 184, 35);
		Panel_filtros.add(Butt_salir);
		Butt_salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		
		JLabel Logo1 = new JLabel();
		Logo1.setHorizontalAlignment(SwingConstants.CENTER);
		Logo1.setBorder(null);
		Logo1.setBackground(Color.WHITE);
		Logo1.setBounds(23, 619, 135, 102);
		Panel_filtros.add(Logo1);
		Image Res_logo1 = new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png")).getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);	
		Logo1.setIcon(new ImageIcon(Res_logo1));		
		
		// Moviles
		
		Panel_moviles = new JPanel();
		Panel_moviles.setBackground(Color.WHITE);
		Panel_moviles.setBounds(184, 185, 839, 571);
		frame.getContentPane().add(Panel_moviles);
		Panel_moviles.setLayout(null);
		
		JButton Iphone7_plata = new JButton("");
		Iphone7_plata.setBounds(453, 11, 150, 157);
		Image Res_Iphone7_plata = new javax.swing.ImageIcon(getClass().getResource("/Moviles/Iphone7_plata.jpg")).getImage().getScaledInstance(155, 162, java.awt.Image.SCALE_SMOOTH);
		Iphone7_plata.setIcon(new ImageIcon(Res_Iphone7_plata));
		Panel_moviles.add(Iphone7_plata);
		
		JLabel JL_Iphone7_plata = new JLabel("<html><center> Iphone 7 32Gb - 3Gb RAM Plata Libre </html>");
		JL_Iphone7_plata.setHorizontalAlignment(SwingConstants.LEFT);
		JL_Iphone7_plata.setBounds(453, 179, 150, 34);
		Panel_moviles.add(JL_Iphone7_plata);
		
		JButton IphoneX_negro = new JButton("");
		IphoneX_negro.setBackground(Color.WHITE);
		IphoneX_negro.setBounds(40, 299, 150, 157);
		Image Res_IphoneX_negro = new javax.swing.ImageIcon(getClass().getResource("/Moviles/IphoneX_negro.png")).getImage().getScaledInstance(155, 173, java.awt.Image.SCALE_SMOOTH);
		IphoneX_negro.setIcon(new ImageIcon(Res_IphoneX_negro));
		Panel_moviles.add(IphoneX_negro);
		
		JLabel JL_IphoneX_negro = new JLabel("<html><center> Iphone X 64Gb - 3Gb RAM Negro Libre </html>");
		JL_IphoneX_negro.setHorizontalAlignment(SwingConstants.LEFT);
		JL_IphoneX_negro.setBounds(40, 467, 150, 34);
		Panel_moviles.add(JL_IphoneX_negro);
		
		JButton Xiaomi_mi9 = new JButton("");
		Xiaomi_mi9.setBackground(Color.WHITE);
		Xiaomi_mi9.setBounds(246, 11, 150, 157);
		Image Res_Xiaomi_mi9 = new javax.swing.ImageIcon(getClass().getResource("/Moviles/Xiaomi_mi9.jpg")).getImage().getScaledInstance(140, 147, java.awt.Image.SCALE_SMOOTH);
		Xiaomi_mi9.setIcon(new ImageIcon(Res_Xiaomi_mi9));
		Panel_moviles.add(Xiaomi_mi9);
		
		JLabel JL_Xiaomi_mi9 = new JLabel("<html><center> Xiaomi MI 9 128Gb - 4Gb RAM Negro Libre </html>");
		JL_Xiaomi_mi9.setHorizontalAlignment(SwingConstants.LEFT);
		JL_Xiaomi_mi9.setBounds(246, 179, 150, 34);
		Panel_moviles.add(JL_Xiaomi_mi9);
		
		JButton Xiaomi_mi10pro = new JButton("");
		Xiaomi_mi10pro.setBackground(Color.WHITE);
		Xiaomi_mi10pro.setBounds(246, 299, 150, 157);
		Image Res_Xiaomi_mi10pro = new javax.swing.ImageIcon(getClass().getResource("/Moviles/Xiaomi10.jpg")).getImage().getScaledInstance(140, 147, java.awt.Image.SCALE_SMOOTH);
		Xiaomi_mi10pro.setIcon(new ImageIcon(Res_Xiaomi_mi10pro));
		Panel_moviles.add(Xiaomi_mi10pro);
		
		JLabel JL_Xiaomi_mi10pro = new JLabel("<html><center> Xiaomi MI 10 Pro 512Gb - 8Gb RAM Plata Libre </html>");
		JL_Xiaomi_mi10pro.setHorizontalAlignment(SwingConstants.LEFT);
		JL_Xiaomi_mi10pro.setBounds(246, 467, 150, 34);
		Panel_moviles.add(JL_Xiaomi_mi10pro);
		
		JButton Sams20 = new JButton("");
		Sams20.setBackground(Color.WHITE);
		Sams20.setBounds(657, 11, 150, 157);
		Image Res_Sams20 = new javax.swing.ImageIcon(getClass().getResource("/Moviles/S20.jpg")).getImage().getScaledInstance(140, 147, java.awt.Image.SCALE_SMOOTH);
		Sams20.setIcon(new ImageIcon(Res_Sams20));
		Panel_moviles.add(Sams20);
		
		JLabel JL_Sams20 = new JLabel("<html><center> Samsung S20 64Gb - 6Gb RAM Negro Libre </html>");
		JL_Sams20.setHorizontalAlignment(SwingConstants.LEFT);
		JL_Sams20.setBounds(657, 179, 150, 34);
		Panel_moviles.add(JL_Sams20);
		
		JButton Sams21 = new JButton("");
		Sams21.setBackground(Color.WHITE);
		Sams21.setBounds(40, 11, 150, 157);
		Image Res_Sams21 = new javax.swing.ImageIcon(getClass().getResource("/Moviles/S21.jpg")).getImage().getScaledInstance(150, 157, java.awt.Image.SCALE_SMOOTH);
		Sams21.setIcon(new ImageIcon(Res_Sams21));
		Panel_moviles.add(Sams21);
		
		JLabel JL_Sams21 = new JLabel("<html><center> Samsung S21 256Gb - 8Gb RAM Plata Libre </html>");
		JL_Sams21.setHorizontalAlignment(SwingConstants.LEFT);
		JL_Sams21.setBounds(40, 179, 150, 34);
		Panel_moviles.add(JL_Sams21);
		
		// Carrito 
		
		spinner1 = new JSpinner();
		spinner1.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinner1.setBounds(127, 224, 66, 39);
		Panel_moviles.add(spinner1);
		
		JButton AñadirCarro1 = new JButton("Comprar");
		AñadirCarro1.setForeground(Color.WHITE);
		AñadirCarro1.setBounds(40, 224, 87, 39);
		AñadirCarro1.setBackground(new java.awt.Color(0, 134, 190));
		Panel_moviles.add(AñadirCarro1);
		AñadirCarro1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			if ((int) spinner1.getValue() == 0) {
				
			} else {
				
				 int num = (int) spinner1.getValue();
				 cont = cont + num;
				Carrito.setText("Mi Carrito ("+cont+")");
				
				Object datos[] = new Object [4];
				
				String movil = "Samsung S21";
				double precio = 849.99;
				int cantidad = (int) spinner1.getValue();
				
				importe1 = precio * cantidad;
				double round = Math.round(importe1);
				importeTotal += importe1;
				
				datos[0] = movil;
				datos[1] = precio+" €";
				datos[2] = cantidad;
				datos[3] = round;			
				
				modelo.addRow(datos);
				
				spinner1.setValue(0);
				}
			}
			
		});
		
		spinner2 = new JSpinner();
		spinner2.setBounds(330, 224, 66, 39);
		spinner2.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		Panel_moviles.add(spinner2);
		
		JButton AñadirCarro2 = new JButton("Comprar");
		AñadirCarro2.setForeground(Color.WHITE);
		AñadirCarro2.setBackground(new Color(0, 134, 190));
		AñadirCarro2.setBounds(246, 224, 87, 39);
		Panel_moviles.add(AñadirCarro2);
		AñadirCarro2.addActionListener(new ActionListener() {	

			public void actionPerformed(ActionEvent e) {
				
				if ((int) spinner2.getValue() == 0) {
					
				} else {
					
					int num = (int) spinner2.getValue();
					cont = cont + num;
					Carrito.setText("Mi Carrito ("+cont+")");
				 
				 	Object datos[] = new Object [4];
					
					String movil = "Xiaomi MI 9";
					double precio = 319.99;
					int cantidad = (int) spinner2.getValue();
					
					datos[0] = movil;
					datos[1] = precio+" €";
					datos[2] = cantidad;				
					
					importe2 = precio * cantidad;
					double round = Math.round(importe2);
					importeTotal += importe2;
					
					datos[3] = round;
					
					modelo.addRow(datos);
					
					spinner2.setValue(0);
				}
			}
		});
		
		spinner3 = new JSpinner();
		spinner3.setBounds(537, 224, 66, 39);
		spinner3.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		Panel_moviles.add(spinner3);
		
		JButton AñadirCarro3 = new JButton("Comprar");	
		AñadirCarro3.setForeground(Color.WHITE);
		AñadirCarro3.setBackground(new Color(0, 134, 190));
		AñadirCarro3.setBounds(453, 224, 87, 39);
		Panel_moviles.add(AñadirCarro3);
		AñadirCarro3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if ((int) spinner3.getValue() == 0) {
					
				} else {
				int num = (int) spinner3.getValue();
				 cont = cont + num;
				 Carrito.setText("Mi Carrito ("+cont+")");
				 
				 Object datos[] = new Object [4];
					
					String movil = "Iphone 7";
					double precio = 199.99;
					int cantidad = (int) spinner3.getValue();				
					
					datos[0] = movil;
					datos[1] = precio+" €";
					datos[2] = cantidad;
					
					importe3 = precio * cantidad;
					double round = Math.round(importe3);
					importeTotal += importe3;
					
					datos[3] = round;			
					
					modelo.addRow(datos);
					
					spinner3.setValue(0);
				}
			}
		});
		
		spinner4 = new JSpinner();
		spinner4.setBounds(741, 224, 66, 39);
		spinner4.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		Panel_moviles.add(spinner4);
		
		JButton AñadirCarro4 = new JButton("Comprar");
		AñadirCarro4.setForeground(Color.WHITE);
		AñadirCarro4.setBackground(new Color(0, 134, 190));
		AñadirCarro4.setBounds(657, 224, 87, 39);
		Panel_moviles.add(AñadirCarro4);
		AñadirCarro4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if ((int) spinner4.getValue() == 0) {
					
				} else {
					
				
				int num = (int) spinner4.getValue();
				 cont = cont + num;
				 Carrito.setText("Mi Carrito ("+cont+")");
				 
				 Object datos[] = new Object [4];
					
					String movil = "Samsung S20";
					double precio = 449.99;
					int cantidad = (int) spinner4.getValue();
					
					datos[0] = movil;
					datos[1] = precio+" €";
					datos[2] = cantidad;
					
					importe4 = precio * cantidad;
					double round = Math.round(importe4);
					importeTotal += importe4;
					
					datos[3] = round;			
					
					modelo.addRow(datos);
					
					spinner4.setValue(0);
				}
			}
		});
		
		spinner5 = new JSpinner();
		spinner5.setBounds(124, 512, 66, 39);
		spinner5.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		Panel_moviles.add(spinner5);
		
		JButton AñadirCarro5 = new JButton("Comprar");
		AñadirCarro5.setForeground(Color.WHITE);
		AñadirCarro5.setBackground(new Color(0, 134, 190));
		AñadirCarro5.setBounds(40, 512, 87, 39);
		Panel_moviles.add(AñadirCarro5);
		AñadirCarro5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if ((int) spinner5.getValue() == 0) {
					
				} else {
				
				int num = (int) spinner5.getValue();
				 cont = cont + num;
				 Carrito.setText("Mi Carrito ("+cont+")");
				 
				 Object datos[] = new Object [4];
					
					String movil = "Iphone X";
					double precio = 749.99;
					int cantidad = (int) spinner5.getValue();
					
					datos[0] = movil;
					datos[1] = precio+" €";
					datos[2] = cantidad;
					
					importe5 = precio * cantidad;
					double round = Math.round(importe5);
					importeTotal += importe5;
					
					datos[3] = round;			
					
					modelo.addRow(datos);
					
					spinner5.setValue(0);
				}
			}
		});
		
		spinner6 = new JSpinner();
		spinner6.setBounds(330, 512, 66, 39);
		spinner6.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		Panel_moviles.add(spinner6);
		
		JButton AñadirCarro6 = new JButton("Comprar");
		AñadirCarro6.setForeground(Color.WHITE);
		AñadirCarro6.setBackground(new Color(0, 134, 190));
		AñadirCarro6.setBounds(246, 512, 87, 39);
		Panel_moviles.add(AñadirCarro6);
		
		AñadirCarro6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if ((int) spinner6.getValue() == 0) {
					
				} else {
				
				int num = (int) spinner6.getValue();
				 cont = cont + num;
				 Carrito.setText("Mi Carrito ("+cont+")");
				 
				 Object datos[] = new Object [4];
					
					String movil = "Xiaomi MI 10 Pro";
					double precio = 699.99;
					int cantidad = (int) spinner6.getValue();
					
					datos[0] = movil;
					datos[1] = precio+" €";
					datos[2] = cantidad;
					
					importe6 = precio * cantidad;
					double round = Math.round(importe6);
					importeTotal += importe6;
					
					datos[3] = round;			
					JL_ImporteTotal.setText(""+importeTotal);
					modelo.addRow(datos);
					
					spinner6.setValue(0);
				}
			}	
		});
		
 	
		// Titulo y comboBox móviles
		
		Titulo_moviles = new JLabel("  Moviles libres y smarthphones:");
		Titulo_moviles.setBounds(194, 112, 345, 48);
		frame.getContentPane().add(Titulo_moviles);
		Titulo_moviles.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		Filtro = new JLabel(" Ordenado por relevancia");
		Filtro.setBounds(204, 152, 345, 22);
		frame.getContentPane().add(Filtro);
		Filtro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		comboBox = new JComboBox();
		comboBox.setBounds(889, 129, 97, 22);
		frame.getContentPane().add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String [] {"Relevancia", "Precio más bajo", "Precio más alto"}));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				if (comboBox.getSelectedItem().equals("Relevancia")) {

					
				}
				
				if (comboBox.getSelectedItem().equals("Precio más bajo")) {
					Menor men = new Menor();
					Panel_moviles.setVisible(false);
					frame.getContentPane().add(men.Panel_menor);
					men.Panel_menor.setVisible(true);
					Filtro.setText(" Ordenado por precio de menor a mayor");
					
											
				} 
				
				if (comboBox.getSelectedItem().equals("Precio más alto")) {
					Mayor may = new Mayor();
					Panel_moviles.setVisible(false);
					frame.getContentPane().add(may.Panel_mayor);
					may.Panel_mayor.setVisible(true);
					Filtro.setText(" Ordenado por precio de mayor a menor");
				}
					
				
			}
		});
		
		Panel_carrito = new JScrollPane();
		Panel_carrito.setBounds(249, 185, 700, 450);
		frame.getContentPane().add(Panel_carrito);
		Panel_carrito.setVisible(false);
		
		modelo.addColumn("Producto");
		modelo.addColumn("Precio (IVA INCLUIDO)");
		modelo.addColumn("Cantidad");
		modelo.addColumn("Importe");
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				
			}
		));
		Panel_carrito.setViewportView(table);
		
		BotonComprar = new JButton("Tramitar pedido");
		BotonComprar.setBounds(730, 645, 218, 48); 
		BotonComprar.setForeground(Color.WHITE);
		BotonComprar.setFont(new Font("Tahoma", Font.BOLD, 16));
		BotonComprar.setBackground(new Color(0, 134, 190));
		frame.getContentPane().add(BotonComprar);
		BotonComprar.setVisible(false);
		BotonComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (table.getRowCount() > 0) {
					for (int i = 0; i < table.getRowCount(); i++) {
					
				try {
					Num_pedido++;
					
		        	 Class.forName("com.mysql.cj.jdbc.Driver");
		             Connection con=DriverManager.getConnection(
		                     "jdbc:mysql://localhost:3306/OGT","root","");
		             java.sql.Statement stmt=con.createStatement();  
		             String sl = "SELECT Factura FROM pedidos";
		            
		            String st= "INSERT INTO pedidos (Factura, Modelos,Cantidad,Importe,Nombre_u)\r\n"
		            		+ "VALUES ("+Num_pedido+ ",'"+table.getValueAt(i, 0)+"',"+table.getValueAt(i, 2)+","+table.getValueAt(i, 3)+",'"+usuario+"')";
		             System.out.println(st);
		             System.out.println(sl);
		             stmt.execute(st);
		             stmt.execute(sl);
		             System.out.println("Connected");
		             
		             
		             JOptionPane.showMessageDialog(null, "La compra se ha realizado con éxito");  
					 frame.setVisible(false);
		        }
		        catch(Exception er) {
		            System.out.println(er);
		        }
					}
					
					} else {
						 JOptionPane.showMessageDialog(BotonComprar, "El carrito está vacío", "Error", 0);
					}
				}	
		});
				
		JL_ImporteTotal = new JLabel();
		JL_ImporteTotal.setFont(new Font("Tahoma", Font.BOLD, 22));
		JL_ImporteTotal.setBounds(459, 645, 317, 48);
		frame.getContentPane().add(JL_ImporteTotal);
		JL_ImporteTotal.setVisible(false);
		
		}
}

