package javaIntro;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e
5,respectivamente.*/
				
		Scanner leia = new Scanner(System.in);
				
		float n1,n2,n3,media;
				
		System.out.println("Digite a nota da n1:");
		n1 = leia.nextFloat();
				
		System.out.println("Digite a nota da n2:");
		n2 = leia.nextFloat();
				
		System.out.println("Digite a nota da n3:");
		n3 = leia.nextFloat();
				
		media = (((n1 * 2 + n2 * 3 + n3 * 5)) / 10);
				
		System.out.println("A média final é:" + media);		
		
	}

}
