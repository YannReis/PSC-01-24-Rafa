/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex09;

import java.util.Scanner;

/**
 *
 * @author Yannr
 */
public class ex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Desenvolva um programa que calcula a área de um círculo, onde o raio é fornecido pelo usuário.
       //Declaração das variaveis
       double pi, raio;
       //Adiciona a função de leitura
       Scanner input = new Scanner(System.in);
       //Solicitação e leitura do raio do circulo
       System.out.println("Insira o raio do circulo: ");
       raio = input.nextDouble();
       //declaração do valor da area
       double area = Math.PI * raio * raio;
       //impressão do resultado
       System.out.println("A área do círculo é igual a: " +area);
    }
    
}
