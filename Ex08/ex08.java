/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex08;

import java.util.Scanner;

/**
 *
 * @author Yannr
 */
public class ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escreva um programa que converte uma quantidade de metros para centímetros.
        //adiciona a função de leitura do teclado
        Scanner input = new Scanner(System.in);
        //Declaração das variaveis 
        int metro, cent;
        //Solicita ao usuario que ele informe a metragem que queira converter
        System.out.println("Informe quantos metros serão convertidos para centímetros: ");
        //leitura da metragem
        metro = input.nextInt();
        //coversão
        cent = metro * 100;
        //impressão do resultado
        System.out.println("Aqui está a conversão em centimetros: "+cent);
        
    }
    
}
