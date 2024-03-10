/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex11;

import java.util.Scanner;

/**
 *
 * @author Yannr
 */
public class ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crie um programa que calcula a média simples de três notas fornecidas pelo usuário.
        //Declaração das variaveis
        double n1, n2, n3;
        //Adiciona a leitura do teclado
        Scanner input = new Scanner(System.in);
        //Leitura e impressão dos valores 
        System.out.println("Insira a nota da prova A1: ");
        n1 = input.nextDouble();
        System.out.println("Insira a nota da prova A2: ");
        n2 = input.nextDouble();
        System.out.println("Insira a nota da prova A3: ");
        n3 = input.nextDouble();
        //soma das notas 
        double soma = n1 + n2 + n3;
        //impressão do resultafo
        System.out.println("A média das notas é: " +soma/3);
    }
    
}
