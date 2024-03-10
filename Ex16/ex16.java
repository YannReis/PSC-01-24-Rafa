/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex16;

import java.util.Scanner;

/**
 *
 * @author Yannr
 */
public class ex16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Faça um programa que receba de entrada a distância total (em km) percorrida por um automóvel
        e a quantidade de combustível (em litros) consumida para percorrê-la, calcule e imprima o consumo 
        médio de combustível. Fórmula: distância/litro.*/
        //adiciona a leitura do teclado
        Scanner input = new Scanner(System.in);
        //declaração das variaveis
        double km, lt, kml;
        //impresssão e leitura dos dados inseridos pelo usuario
        System.out.println("Qual a distância em km percorrida pelo veiculo? ");
        km = input.nextDouble();
        System.out.println("Quantos litros foram necessários para percorrer essa distância? ");
        lt = input.nextDouble();
        //calculo da distancia por litro
        kml = km / lt;
        //impressão do resultado
        System.out.println("A autonomia do veiculo foram de "+kml +" Km/L");

    }
    
}
