package javaIntro;

import java.util.Scanner;

public class Distancia {

	public static void main(String[] args) {

		
/*Construa um programa em que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
que efetua tal cálculo é:*/
				
		Scanner input = new Scanner(System.in);
				
				Double x1, x2, y1, y2, d;
				
				System.out.println("Digite o valor de x1:");
				x1 = input.nextDouble();
				
				System.out.println("Digite valor de x2:");
				x2 = input.nextDouble();
				
				System.out.println("Digite valor de y1:");
				y1 = input.nextDouble();
				
				System.out.println("Digite valor de y2:");
				y2 = input.nextDouble();
				
				d= Math.sqrt( Math.pow(x2 - x1,2)+ Math.pow(y2-y1,2)); 
				
				System.out.println("A distância do ponto é:" + d);

	}

}
