/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex06;

import java.util.Scanner;

/**
 *
 * @author Yannr
 */
public class ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crie um algoritmo que leia a idade de uma pessoa e calcule quantos dias essa pessoa já viveu.
        //declaração das variaveis
        int idade, dias, total;
        //Adiciona a função de leitura do teclado ("leia")
        Scanner input = new Scanner(System.in);
        //declaração dos valores
        dias = 365;
        //Impressão e leitura da solicitação da idade do usuario 
        System.out.println("Por favor, informe a sua idade: ");
        idade = input.nextInt();
        total = idade * dias;
        //Impressão do valor total
        System.out.println("A quantidade de dias vividos por você são: " +total);
        
    }
    
}
