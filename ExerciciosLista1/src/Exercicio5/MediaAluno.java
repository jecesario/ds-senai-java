package Exercicio5;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		
		double nota1;
		double nota2;
		double media;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("*** Programa que calcula m�dia do aluno ***");
		System.out.println("Digite a nota 1: ");
		nota1 = in.nextDouble();
		System.out.println("Digite a nota 2: ");
		nota2 = in.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 6.5) {
			System.out.println("Sua m�dia �: " + media + ", voc� foi Aprovado!");
		} else {
			System.out.println("Sua m�dia �: " + media + ", voc� foi Reprovado!");
		}

		in.close();
	}

}
