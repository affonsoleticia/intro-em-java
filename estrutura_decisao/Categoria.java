package estrutura_decisao;

import java.util.Scanner;

public class Categoria {

	public static void main(String[] args) {

/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra: 10-14 infantil;15-17 juvenil;18-25 adulto;*/
		
Scanner input = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a sua idade:");
		idade = input.nextInt();
		
		if(idade >= 10 && idade <= 14){
			System.out.println("Categoria infatil - 10 a 14 anos");
		}
			else if(idade >= 15 &&  idade <= 17){
				System.out.println("Categoria juvenil - 15 a 17 anos");
			}
				else if(idade >= 18 &&  idade <= 25){
					System.out.println("Categoria adulto - 18 a 25 anos");
				}
					else{
						System.out.println("Não está na escala de classificação");
					}
	}

}
