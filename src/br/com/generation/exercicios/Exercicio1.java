package br.com.generation.exercicios;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, num3, maior ;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1� n�mero inteiro: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2� n�mero inteiro: "));
		num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3� n�mero inteiro: "));
		maior = 0;
		
		if(num1 > num2 && num1> num3) {
			maior = num1;
			
		}else if(num2 >= num1 && num2 > num3) {
			maior = num2;
			
		}else if(num3 >= num1  && num3 > num2) {
			maior = num3;
			
		}else {
			JOptionPane.showMessageDialog(null, "O n�mero est� errado!");
		}
		
		JOptionPane.showMessageDialog(null, "O Maior n�mero � o " + maior);
		
		

	}

}
