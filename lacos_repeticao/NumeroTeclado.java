package lacos_repeticao;

import java.util.Scanner;

public class NumeroTeclado {

	public static void main(String[] args) {
/*Faça um programa que pegue um número do teclado e calcule a soma de todos os números  de 1 
* até ele.Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
*/
				
				Scanner input = new Scanner(System.in);
				
				int numero, soma = 0;
				
				System.out.println("Digite um número:");
				numero = input.nextInt();
				
				do {
					soma = soma + numero;
					numero = numero -1;
					
				}while(numero >= 0);
				System.out.println("A soma é:" + soma);
	}

}
