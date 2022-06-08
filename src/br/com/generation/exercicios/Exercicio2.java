package br.com.generation.exercicios;

import javax.swing.JOptionPane;

public class Exercicio2 {

    public static void main(String[] args) {

        int[] digitoUsuario = new int[3] ;

        digitoUsuario [0]= Integer.parseInt(JOptionPane.showInputDialog("Vamos colocar os números em ordem!"
                + "\nDigite o primeiro número inteiro: "));

        digitoUsuario [1]= Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));

        digitoUsuario [2]= Integer.parseInt(JOptionPane.showInputDialog("Digite o último número: "));

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


        JOptionPane.showMessageDialog(null, "Os números do menor para o maior são: " + digitoUsuario[0] + " " +
        digitoUsuario[1] + " e " + digitoUsuario[2]);

    }


}
