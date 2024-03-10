/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex17;

import java.util.Scanner;

/**
 *
 * @author Yannr
 */
public class ex17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Faça um programa para o seguinte problema: Compraram-se N canetas iguais, 
que foram pagas com uma nota de Z reais, obtendo-se Y reais como troco. Quanto custou cada caneta?*/ 
        //Acesso ao teclado
        Scanner input = new Scanner(System.in);
        //Declaração das variaveis
        int caneta;
        double nota, troco, preco;
        //Impressão e solicitação das informações ao usuario
        System.out.println("Quantas canetas foram compradas? ");
        caneta = input.nextInt();
        System.out.println("Qual o valor da nota utilizada para comprar as canetas?");
        nota = input.nextDouble();
        System.out.println("Qual o valor do troco recebido na compra? ");
        troco = input.nextDouble();
        //Calculo do preço unitario
        preco = (nota - troco) / caneta;
        //impressão do resultado
        System.out.println("O valor unitário da caneta é: R$"+preco);
    }
    
}
