/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex02;

import java.util.Scanner;

/**
 *
 * @author Yannr
 */
public class ex02 {

    public static void main(String[] args) {
        //Crie um algoritmo que lê dois números, X e Y, e mostra o resto da divisão entre eles.
        //Ddeclaração das variaveis
        int n1, n2, resto;
        //Acesso ao teclado ("leia")
       Scanner input = new Scanner(System.in);
       //Impressão da solicitação do valor x ao usuario
        System.out.println("Digite o primeiro valor (x):");
        //Leitura do valor x inserido pelo usuario
        n1 = input.nextInt();
        //Impressao da solicitaçãp do valor y ao usuario
        System.out.println("Digite o segundo valor (y): ");
        //Leitura do valor y inserido pelo usuario
        n2 = input.nextInt();
        //Declaração do valor da variavel "resto"
        resto = n1 % n2;
        //impressão do resto
        System.out.println("O resultado da divisão é: "+resto);
        
        }
    }
    

