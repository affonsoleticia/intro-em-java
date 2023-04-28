package lacos_repeticao;

import java.util.Scanner;

public class ForNumerosImpares {

	public static void main(String[] args) {
		
/*Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três 
* e que se encontram no conjunto dos números de 1 até 500.*/

		Scanner input = new Scanner(System.in);
				
				int numeros, soma = 0;
				
				for(numeros = 1; numeros <= 500; numeros++) {
					if((numeros %2) != 0) {
						if((numeros %3)==0) {
							soma +=numeros;
						}
					}
				}

				System.out.println("\nA soma dos números ímpares é:" + soma);

	}

}
