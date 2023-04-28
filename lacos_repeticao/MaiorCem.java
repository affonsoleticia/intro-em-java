package lacos_repeticao;

import java.util.Scanner;

public class MaiorCem {

	public static void main(String[] args) {

/*Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três 
* (imprimindo o novo valor) até que ele seja maior do que 100. 
* Ex.: se o usuário digita 5, deveremos observar na tela a seguinte sequência: 5 15 45 135.
*/
				
				Scanner input = new Scanner(System.in);
				
				int numero;
				
				System.out.println("Digite algum número:");
				numero = input.nextInt();

				while(numero < 100) {
					numero = numero % 3;
					System.out.println("\n" + numero);		
				}
	}

}
