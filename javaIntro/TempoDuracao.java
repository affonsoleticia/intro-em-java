package javaIntro;

import java.util.Scanner;

public class TempoDuracao {

	public static void main(String[] args) {
	
/*Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
				
		Scanner leia = new Scanner(System.in);
				
		int tempo, horas, minutos, segundos;
				
        System.out.println("Digite o tempo de duração do evento em segundos:");
		tempo = leia.nextInt();
				
		horas = tempo / 3600;
		segundos = (tempo % 3600);
		minutos = segundos / 60;
		segundos = segundos % 60;
				
		System.out.println("O tempo do evento é:" + horas + "h:" + minutos + "min:" + segundos+ "seg:");

		
	}

}
