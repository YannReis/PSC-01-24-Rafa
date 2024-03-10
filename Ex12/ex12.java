/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex12;

import java.util.Scanner;

/**
 *
 * @author Yannr
 */
public class ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escreva um algoritmo para ler um valor e escrever o seu antecessor e o seu sucessor.
        //declaração das variaveis
        int n1, ant, suc;
        //Adiciona a função de leitura
        Scanner input = new Scanner(System.in);
        //Impressão da solicitação ao usuario
        System.out.println("Insira um número: ");
        //leitua do numero inserido pelo usuario
        n1 = input.nextInt();
        //declaração dos valores das variaveis
        ant = n1 - 1;
        suc = n1 + 1;
        //impressão dos resultados
        System.out.println("O numero inserido foi: " +n1);
        System.out.println("O antecessor dele é: "+ant);
        System.out.println("O sucessor dele é: "+suc);
        
    }
    
}
