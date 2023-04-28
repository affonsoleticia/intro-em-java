package javaIntro;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {

		
/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/
				
		Scanner leia = new Scanner(System.in);
				
		int idade, anos, meses, dias;
				
		System.out.println("Digite sua idade em dias:");
		idade = leia.nextInt();
				
		anos = idade / 365;
		dias = idade % 365;
		meses = dias / 30;
		dias = dias % 30;
				
		System.out.println("Sua idade é:" + anos + "anos" + meses + "meses" + dias+ "dias");

	}

}
