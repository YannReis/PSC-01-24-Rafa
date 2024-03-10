/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ex01;

import java.util.Scanner;

/**
 *
 * @author Yannr
 */
public class ex01 {

   public static void main(String[] args) {
       //Declarar as variaveis
       int num1, num2, soma;
       //Adicionar a função de leitura
       Scanner input = new Scanner(System.in);      
       //imprimir a mensagem solicitando o valor ao usuario
       System.out.println ("Informe o primeiro valor: ");
       num1 = input.nextInt();
       System.out.println ("Informe o segundo valor: ");
       num2 = input.nextInt();
       //Soma dos valores 
       soma = num1 + num2;
       //Resultado da soma
       System.out.println("O resultado da soma é "+soma);
       System.out.printf("A soma de %d + %d = %d", num1, num2, soma);
                
                
    }
}
