/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex14;

import java.util.Scanner;

/**
 *
 * @author Yannr
 */
public class ex14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Desenvolva um programa que, dados dois valores A e B, troque os valores 
        de forma que A passe a ter o valor de B e vice-versa. Exiba os valores após a troca.*/
        //adiciona a função de leitura 
        Scanner input = new Scanner(System.in);
        //declaração das variaveis 
        int nA, nB;
        //impressão da solicitação dos valores e leitura de valores
        System.out.println("Insira o valor de A: ");
        nA = input.nextInt();
        System.out.println("Insira o valor de B: ");
        nB = input.nextInt();
        //impressão dos resultados 
        System.out.println("O valor de A é: " +nA);
        System.out.println("O valor de B é: "+nB);
        System.out.println("os valores invertidos são");
        System.out.println("Valor A: "+nB);
        System.out.println("Valor B: "+nA);
     
    }
    
}
