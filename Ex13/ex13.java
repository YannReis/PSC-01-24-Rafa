/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex13;

import java.util.Scanner;

/**
 *
 * @author Yannr
 */
public class ex13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escreva um programa que calcula o salário líquido de um funcionário. 
        O programa deve solicitar o valor da hora de trabalho, 
        o número de horas trabalhadas no mês e o percentual de desconto do INSS.
        */
        //adiciona a leitura do teclado
        Scanner input = new Scanner(System.in);
        //declaração das variaveis
        double valorHora, inss, salarioBruto, salarioLiquido;
        int horasMes;
        //Solicitação das informações
        System.out.println("Qual o valor da hora de trabalho? ");
        valorHora = input.nextDouble();
        System.out.println("Quantas horas são trabalhadas no mês? ");
        horasMes = input.nextInt();
        System.out.println("Qual o desconto do INSS? ");
        //declaração dos valores
        inss = input.nextDouble();
        salarioBruto = valorHora * horasMes;
        salarioLiquido = salarioBruto * inss/100;
        //impressão do resultado 
        System.out.println("O salário liquido é: "+salarioLiquido);
    }
    
}
