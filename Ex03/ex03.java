/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex03;

import java.util.Scanner;

/**
 *
 * @author Yannr
 */
public class ex03 {

    public static void main(String[] args) {
        
        //Adiciona o acesso ao teclado 
        Scanner input = new Scanner(System.in);
        //Declaração da variavel
        String nome;
        //Impressão e leitra da solicitação do nome do usuario
        System.out.println("Insira seu nome: ");
       nome = input.nextLine();
       //Impressão da mensagem de saudação
        System.out.println("Olá, " + nome + " Seja bem-vindo ao mundo Java, boa sorte!!!");
                
       
    }
    
}
