package br.senai.sp.jandira.ui;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela {

	public void criarTela(){
		
		JFrame minhaTela = new JFrame();
		minhaTela.setTitle("Minha primeira tela");
		minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		minhaTela.setSize(600, 600);
		minhaTela.setLayout(null);
		
		
		//Criar os componentes da tela
		JLabel lblIdade = new JLabel();
		lblIdade.setText("Qual a sua idade?");
		lblIdade.setBounds(20, 30, 150, 30);
		
		JTextField txtIdade = new JTextField();
		txtIdade.setBounds(20, 60, 60, 30);
		
		JButton btnVerificar = new JButton();
		btnVerificar.setText("Verificar");
		btnVerificar.setBounds(90, 60, 100, 30);
		
		JLabel lblResultado = new JLabel();
		lblResultado.setText("O resultado é: ");
		lblResultado.setBounds(20, 100, 150, 30);
		
		minhaTela.getContentPane().setBackground(Color.CYAN);
		minhaTela.getContentPane().add(lblIdade);
		minhaTela.getContentPane().add(txtIdade);
		minhaTela.getContentPane().add(btnVerificar);
		minhaTela.getContentPane().add(lblResultado);
		
		minhaTela.setVisible(true);
		
		//Listeners de eventos
		// --Mouse
		txtIdade.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("Soltei o botão!");
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("Apertei o botão! ");
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("Saí do textfield!");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("Cheguei ");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Cliquei");
				
			}
		});
		
		txtIdade.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyChar());
				
			}
		});
	}
	
}
