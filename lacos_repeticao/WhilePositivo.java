package lacos_repeticao;

import java.util.Scanner;

public class WhilePositivo {

	public static void main(String[] args) {
/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final 
* o total do somatório, a média e o total de valores lidos. O programa deve fazer as leituras 
* dos valores enquanto o usuário estiver fornecendo valores positivos. 
* Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.*/
		 
				Scanner input = new Scanner(System.in);
				
				double media = 0.00, numero = 0.00, soma = 0.00;
				int totalnumeros = 0;
				
				while(numero >= 0) {
					
					System.out.println("Informe um valor numérico:");
					numero = input.nextDouble();
					
						if(numero > 0 ) {
						
							soma = soma + numero;
							totalnumeros = totalnumeros + 1;
						}
				}
						
				media = soma / totalnumeros;
				
				System.out.println("\nA soma é:" + soma);
				System.out.println("\nA média é:" + media);
				System.out.println("\nO total é:" + totalnumeros);

	}

}
