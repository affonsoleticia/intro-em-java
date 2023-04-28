package estrutura_decisao;

import java.util.Scanner;

public class IfElseInteiros {

	public static void main(String[] args) {
/* Faça um programa que receba três inteiros e diga qual deles é o maior.*/
		
		Scanner input = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.println("Digite o n° 1:");
		n1 = input.nextInt();
		
		System.out.println("Digite o n° 2:");	
		n2 = input.nextInt();
		
		System.out.println("Digite o n° 3:");
		n3 = input.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O maior número é o: " + n1 + "(n1)");	
		}
		
			else if(n2 > n3) {
			System.out.println("O maior número é o: " + n2 + "(n2)");	
			}
				else
					{
			System.out.println("O maior número é o: " + n3 + "(n3)");
				}

	}

}
