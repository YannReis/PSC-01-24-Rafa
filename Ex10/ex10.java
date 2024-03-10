/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex10;

import java.util.Scanner;

/**
 *
 * @author Yannr
 */
public class ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Faça um programa que converta a temperatura dada em Fahrenheit para Celsius.  Para testar se a sua resposta está correta saiba que 100ºC = 212F. Considere C/5 = (F-32)/9
        //Declaração das variaveis 
        double fah;
        //Adiciona a função de leitura
        Scanner input = new Scanner(System.in);
        //impressão da solicitação do valor em fahrenheit
        System.out.println("Insira a temperatura em fahrenheit: ");
        fah = input.nextDouble();
          //declaração da diferença entre fahrenheit e celsius
        double cel = (fah - 32)/1.8;
        //impressão do resultado
        System.out.println("O valor em celsius é: " +cel);
        
    }
    
}
