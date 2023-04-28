package lacos_repeticao;

import java.util.Scanner;

public class ForPrefeitura {

	public static void main(String[] args) {

/*1- A prefeitura de uma cidade fez uma pesquisa entre 3 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; b) média do número de filhos; c) maior salário; d) percentual de pessoas com salário até R$100,00.*/ 

		Scanner input = new Scanner(System.in);
		
		
		int habitantes, filhos, qtdfilhos = 0, mediafilhos,percentual, qtdpessoas100 = 0;
		double salario, qtdsalario = 0.00, mediasalario, maiorsalario = 0.00;
		
		for(habitantes = 1; habitantes <= 3; habitantes++) {
			
			System.out.println("Quantos filhos você tem?:");
			filhos = input.nextInt();
			System.out.println("Digite aqui o seu salário:");
			salario = input.nextDouble();
			
			qtdfilhos = qtdfilhos + filhos;
			qtdsalario = qtdsalario + salario;
			
				if(salario > maiorsalario) {
					maiorsalario = salario;
				}
					if(salario > 100) {
					qtdpessoas100++;			
					}
		}
			
		mediafilhos = qtdfilhos/3;
		mediasalario = qtdsalario/3;
		percentual = (qtdpessoas100/3);
		
		System.out.println("\nMédia salario dos habitantes:" + mediasalario);
		System.out.println("\nMédia número de filhos:" + mediafilhos);
		System.out.println("\nO maior salario é:" + maiorsalario);
		System.out.println("\nPercentual de pessoas com salário até R$ 100,00:" + qtdpessoas100);

	}

}
