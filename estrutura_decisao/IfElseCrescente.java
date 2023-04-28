package estrutura_decisao;

import java.util.Scanner;

public class IfElseCrescente {

	public static void main(String[] args) {

/*Faça um programa que entre com três números e coloque em ordem crescente.*/
		
Scanner input = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.println("Digite o n° 1:");
		n1 = input.nextInt();
		
		System.out.println("Digite o n° 2:");
		n2 = input.nextInt();
		
		System.out.println("Digite o n° 3:");
		n3 = input.nextInt();
		
		if(n1 <= n2 && n2 <= n3) {
			System.out.println("A ordem crescente é: " + n1 + n2 + n3);	
		}
		
			else if(n1 <= n3 && n3 <= n2) {
				System.out.println("A ordem crescente é: " + n1 + n3 + n2);	
			}

				else if(n2 <= n1 && n1 <= n3) {
					System.out.println("A ordem crescente é: " + n2 + n1 + n3);	
			
				}
		
				else if(n2 <= n3 && n3 <= n1) {
					System.out.println("A ordem crescente é: " + n2 + n3 + n1);	
			
					}
		
					else if(n3 <= n1 && n1 <= n2) {
						System.out.println("A ordem crescente é: " + n3 + n1 + n2);	
			
						}
		
						else
							{
							System.out.println("A ordem crescente é: " + n3 + n2 + n1);
			
			}

	}

}
