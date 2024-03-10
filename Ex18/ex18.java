/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex18;

import java.util.Scanner;

/**
 *
 * @author Yannr
 */
public class ex18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Cada degrau de uma escada tem X de altura. Faça um programa que receba 
        essa altura e a altura que o usuário deseja alcançar subindo a escada, 
        calcule e mostre quantos degraus ele deverá subir para atingir seu objetivo, 
        sem se preocupar com a altura do usuário. Todas as medidas fornecidas devem estar em metros.*/ 
        
        //adiciona aleitura do teclado
        Scanner input = new Scanner(System.in);
        //declaração das variaveis
        double alturaDeg, degraus, objetivo;
        //impressão e solicitação dos dados do usuario
        System.out.println("Informe a altura em metros do degrau requisitado: ");
        alturaDeg = input.nextDouble();
        System.out.println("Informe a altura desejada em metros para a escada: ");
        objetivo = input.nextDouble();
        //calculo dos degraus necessarios
        degraus = alturaDeg / objetivo;
        //impressão dos resultados
        System.out.println("Serão necessários "+degraus +" degraus para a escada ter a altura solicitada");
        
    }
    
}
