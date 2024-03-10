/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex04;

import java.util.Scanner;

/**
 *
 * @author Yannr
 */
public class ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Crie um algoritmo que solicite o nome, o endereço e o telefone do usuário e depois mostre os dados digitados.
       //declaração das variavies de nome e endereço
       String nome, end;
       int num;
        //Adiciona o acesso ao teclado
        Scanner input = new Scanner(System.in);
        // impressão e leitura dos dados solicitados
        System.out.println("Por favor, informe seu nome: ");
        nome = input.nextLine();
        System.out.println("Por favor, informe seu endereço: ");
        end = input.nextLine();
        System.out.println("Por favor, informe seu telefone: ");
        num = input.nextInt();
       
        // Impressão dos dados fornecidos pelo usuario
        System.out.println("Segue abaixo os dados do usuário: ");
        System.out.println("nome: " +nome);
        System.out.println("Endereço: " +end);
        System.out.println("Número de telefone: " +num);
    }
    
}
