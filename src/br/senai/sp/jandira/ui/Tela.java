package br.senai.sp.jandira.ui;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela {

	public void criarTela(){
		
		JFrame minhaTela = new JFrame();
		minhaTela.setTitle("Minha primeira tela");
		minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		minhaTela.setSize(600, 600);
		
		//Criar os componentes da tela
		JLabel lblIdade = new JLabel();
		lblIdade.setText("Qual sua idade?");
		minhaTela.getContentPane().add(lblIdade);
		
		
		minhaTela.setVisible(true);
		
	}
	
}
