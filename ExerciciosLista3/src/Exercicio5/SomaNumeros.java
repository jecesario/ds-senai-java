package Exercicio5;

import java.util.Scanner;

public class SomaNumeros {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		float soma = 0;
		
		for(int i=1; i<=5; i++) {
			System.out.println("Digite o "+i+"� numero decimal: ");
			float n = in.nextFloat();
			soma += n;
		}
		
		System.out.println("A soma dos n�meros �: "+soma);		
		
		in.close();
	}
	
}
