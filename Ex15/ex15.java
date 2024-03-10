/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex15;

import java.util.Scanner;

/**
 *
 * @author Yannr
 */
public class ex15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Construa um programa que calcule as raízes de uma equação de 2º grau (Ax2+Bx+C). 
        Sendo que os valores A,B e C são fornecidos pelo usuário. Considere que tem duas raízes*/
        //Acesso ao teclado
        Scanner input = new Scanner(System.in);
        //declaração das variaveis
        int vA,vB, vC, x1, x2, delta;
        //Solicitação de dados ao usuario
        System.out.println("Informe o valor de A: ");
        vA = input.nextInt();
        System.out.println("Informe o valor de B: ");
        vB = input.nextInt();
        System.out.println("Informe o valor de C: ");
        vC = input.nextInt();
        //formula de bhaskara
        delta = vB * vB - 4 * vA * vC;
        x1 = (int) ((-vB + Math.sqrt(delta)) / (2 * vA));
        x2 = (int) ((-vB - Math.sqrt(delta)) / (2 * vA));
        //resultado
        System.out.println("As raízes são: ");
        System.out.println("Raiz X1 = "+x1);
        System.out.println("Raiz X2 = "+x2);
    }
    
}
