package Exercicio1;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		
		int numero;
		int resultado;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("*** Programa que calcula um n�mero elevado a 3 ***");
		System.out.println("Digite um n�mero: ");
		numero = in.nextInt();
		
		resultado = (int) Math.pow(numero, 3);
		
		System.out.println(numero + "� � igual a: " + resultado);
		
		in.close();

	}

}
