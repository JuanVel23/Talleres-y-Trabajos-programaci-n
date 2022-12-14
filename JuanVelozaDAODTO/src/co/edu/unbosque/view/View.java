package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

import co.edu.unbosque.controller.Controller;

public class View extends JFrame{

	public static final long serialversionUID = 1L;
	private JLabel lb1, lb2, lb3, titulo;
	private JTextField txt1, txt2, txt3;
	private JTextArea txtinformacion;
	private JButton btinsertar, btlistar;
	private JScrollPane scroll;
	public static final String  INSERTAR  ="Insertar";
	public static final String  LISTAR  ="Listar";
	
	public View(Controller control) {
		setSize(400,400);
		setResizable(false);
		setTitle("Sala");
		setBackground(Color.black);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setLocationRelativeTo(null);
		
		Font font = new Font("Arial", 1, 15);
		Font font2 = new Font("Times New Roman", 1, 28);
		titulo = new JLabel("SALA");
		titulo.setBounds(160, 0, 100, 45);
		titulo.setFont(font2);
		titulo.setForeground(Color.GRAY);
		lb1 = new JLabel("ID");
		lb1.setBounds(75, 15, 100, 100);
		lb1.setFont(font);
		lb2 = new JLabel("Nombre");
		lb2.setBounds(50, 45, 100, 100);
		lb2.setFont(font);
		lb3 = new JLabel("Carrera");
		lb3.setBounds(50, 75, 100, 100);
		lb3.setFont(font);
	
		txt1 = new JTextField();
		txt1.setForeground(Color.black);
		txt1.setBackground(Color.white);
		txt1.setBounds(120, 55, 200, 20);
		txt2 = new JTextField();
		txt2.setForeground(Color.black);
		txt2.setBackground(Color.white);
		txt2.setBounds(120, 85, 200, 20);
		txt3 = new JTextField();
		txt3.setForeground(Color.black);
		txt3.setBackground(Color.white);
		txt3.setBounds(120, 115, 200, 20);
		
		btinsertar = new JButton("Insertar");
		btinsertar.setActionCommand(INSERTAR);
		btinsertar.setBounds(65, 150,100, 35);
		btlistar = new JButton("Listar");
		btlistar.setActionCommand(LISTAR);
		btlistar.setBounds(205, 150,100, 35);
		
		txtinformacion = new JTextArea();
		scroll = new JScrollPane(txtinformacion);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll.setBounds(25,200, 350, 150);
		txtinformacion.setForeground(Color.black);
		txtinformacion.setBackground(Color.white); 
		txtinformacion.setEditable(false);
		
		add(titulo);
		add(lb1);
		add(lb2);
		add(lb3);
		add(txt1);
		add(txt2);
		add(txt3);
		add(btinsertar);
		add(btlistar);
		add(scroll);
		
		btinsertar.addActionListener(control);
		btlistar.addActionListener(control);
	}

	public void devolverInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
	public JLabel getLb1() {
		return lb1;
	}

	public void setLb1(JLabel lb1) {
		this.lb1 = lb1;
	}

	public JLabel getLb2() {
		return lb2;
	}

	public void setLb2(JLabel lb2) {
		this.lb2 = lb2;
	}

	public JLabel getLb3() {
		return lb3;
	}

	public void setLb3(JLabel lb3) {
		this.lb3 = lb3;
	}

	public JTextField getTxt1() {
		return txt1;
	}

	public void setTxt1(JTextField txt1) {
		this.txt1 = txt1;
	}

	public JTextField getTxt2() {
		return txt2;
	}

	public void setTxt2(JTextField txt2) {
		this.txt2 = txt2;
	}

	public JTextField getTxt3() {
		return txt3;
	}

	public void setTxt3(JTextField txt3) {
		this.txt3 = txt3;
	}


	public JButton getBtinsertar() {
		return btinsertar;
	}

	public void setBtinsertar(JButton btinsertar) {
		this.btinsertar = btinsertar;
	}

	public JButton getBtlistar() {
		return btlistar;
	}

	public void setBtlistar(JButton btlistar) {
		this.btlistar = btlistar;
	}

	public JTextArea getTxtinformacion() {
		return txtinformacion;
	}

	public void setTxtinformacion(JTextArea txtinformacion) {
		this.txtinformacion = txtinformacion;
	}

	public JScrollPane getScroll() {
		return scroll;
	}

	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}

	
	
	
}
