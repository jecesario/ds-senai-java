package Exercicio3;

import java.util.Scanner;

public class MesesDoAno {

	public static void main(String[] args) {

		int mes;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("*** Programa que retorna o m�s com base no n�mero ***");
		System.out.println("Digite um n�mero de 1 a 12: ");
		mes = in.nextInt();
		
		switch(mes) {
			case 1:
				System.out.println("M�s: Janeiro");
				break;
			case 2:
				System.out.println("M�s: Fevereiro");
				break;
			case 3:
				System.out.println("M�s: Mar�o");
				break;
			case 4:
				System.out.println("M�s: Abril");
				break;
			case 5:
				System.out.println("M�s: Maio");
				break;
			case 6:
				System.out.println("M�s: Junho");
				break;
			case 7:
				System.out.println("M�s: Julho");
				break;
			case 8:
				System.out.println("M�s: Agosto");
				break;
			case 9:
				System.out.println("M�s: Setembro");
				break;
			case 10:
				System.out.println("M�s: Outubro");
				break;
			case 11:
				System.out.println("M�s: Novembro");
				break;
			case 12:
				System.out.println("M�s: Dezembro");
				break;
			default:
				System.out.println("Valor digitado diferente de um n�mero de 1 a 12!");
		}
		
		in.close();
	}

}
