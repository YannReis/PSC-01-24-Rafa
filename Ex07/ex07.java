/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex07;

import java.util.Scanner;

/**
 *
 * @author Yannr
 */
public class ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crie um algoritmo que lê o salário de um funcionário, reajusta o salário em 7% e mostra o resultado.
        //Declaração das variaveis 
        double salario, reajuste;
        //adiciona a leitura do teclado
        Scanner input = new Scanner(System.in);
        //impressão e leitura da solicitação do salario
        System.out.println("Informe seu salário: ");
        salario = input.nextDouble();
        //declaração do valor da variavel 
        reajuste = salario * 1.07;
        //impressão do reajuste 
        System.out.println("O valor do salário após o reajuste será de: " +reajuste);
    }
    
}
