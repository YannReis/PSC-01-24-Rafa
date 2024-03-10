/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex20;

import java.util.Scanner;

/**
 *
 * @author Yannr
 */
public class ex20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Escrever um algoritmo que lê: 
        - a porcentagem do IPI a ser acrescido no valor das peças 
        - o código da peça 1, valor unitário da peça 1, quantidade de peças 1 
        - o código da peça 2, valor unitário da peça 2, quantidade de peças 2. 
        O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.*/
        
        //declaração das variaveis
        int cod1, qntd1, cod2, qntd2;
        double vU1, vU2, vT1, vT2;
        double ipi, vtSipi, vIpi, vtCipi;
        
        //leitura do teclado
        Scanner input = new Scanner (System.in);
        
        //valor do IPI
        System.out.println("Informe a porcentagem do IPI qeu será adicionada: ");
        ipi = input.nextDouble();
        
        //Dados da peça 1
        System.out.println("Informe o código da peça 1: ");
        cod1 = input.nextInt();
        System.out.println("Informe a quantidade de peças: ");
        qntd1 = input.nextInt();
        System.out.println("Informem o valor da peça 1 ");
        vU1 = input.nextDouble();
        
        //Dados da peça 2
        System.out.println("Informe o código da peça 2: ");
        cod2 = input.nextInt();
        System.out.println("Informe a quantidade de peças: ");
        qntd2 = input.nextInt();
        System.out.println("Informem o valor da peça 2 ");
        vU2 = input.nextDouble();
        
        //calculo dos valores
        vT1 = vU1 * qntd1;
        vT2 = vU2 * qntd2;
        vtSipi = vT1  + vT2;
        vIpi = (ipi / 100) * vtSipi;
        vtCipi = vtSipi + vIpi;
        //resultado
        System.out.println("Nota fiscal: ");
        System.out.println("Código da peça 1:" +cod1);
        System.out.println("Quantidade: " +qntd1);
        System.out.println("valor total da peça 1: R$"+vT1);
        System.out.println("Código da peça 2:" +cod2);
        System.out.println("Quantidade: " +qntd2);
        System.out.println("valor total da peça 2: R$"+vT2);
        System.out.println("Valor total sem IPI: R$" +vtSipi);
        System.out.println("Valor do IPI: R$"+vIpi);
        System.out.println("Valor total com IPI R$" +vtCipi);
        
        
        
    
    }
    
}
