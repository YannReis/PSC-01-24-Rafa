/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex05;

import java.util.Scanner;

/**
 *
 * @author Yannr
 */
public class ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crie um algoritmo que lê um valor real em dólar, e converte o valor para reais. Considere que a cotação é US$ 1 = R$ 4,95.
       //Adiona o acesso ao teclado
       Scanner input = new Scanner(System.in);
       //declaração das variaveis e seus valores
       double cot = 4.95;
       //Impressão da solicitação do valor (em dolar) 
       System.out.println("Digite um valor em dolar: ");
       double dolar = input.nextDouble();
       //Declaração do valor da cotação multiplicado pelo valor em dolar
       double real = cot * dolar;
       //impressão do resultado da conversão
       System.out.printf("A conversão em Real é: R$"+real);
    }
    
}
