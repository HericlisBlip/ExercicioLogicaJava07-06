package br.com.generation.exercicios;

import javax.swing.JOptionPane;

public class Exercicio2 {

    public static void main(String[] args) {

        int[] digitoUsuario = new int[3] ;

        
        JOptionPane.showMessageDialog(null, "Vamos colocar os n�meros em ordem!");
        for (int i = 0; i<=2; i++ ) {
        	digitoUsuario [i]= Integer.parseInt(JOptionPane.showInputDialog(" Digite um n�mero inteiro:"));
        }
        

        int auxiliar = 0;

        for (int i = 0; i < digitoUsuario.length; i++) {
            for (int j = 0; j < digitoUsuario.length - 1; j++) {
                if (digitoUsuario[j] > digitoUsuario[j + 1]) {
                    auxiliar = digitoUsuario[j];
                    digitoUsuario[j] = digitoUsuario[j + 1];
                    digitoUsuario[j + 1] = auxiliar;
                }
            }
        }


        JOptionPane.showMessageDialog(null, "Os n�meros do menor para o maior s�o: " + digitoUsuario[0] + " " +
        digitoUsuario[1] + " e " + digitoUsuario[2]);

    }


}
