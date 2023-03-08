package fundamentos.exercicios;

import java.util.Scanner;

public class QuadAndCubo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		double valor = entrada.nextDouble();
		
		// Calculo quadrado e cubo
		
		double quad = valor * valor;
		double cubo = valor * valor * valor;		
		
		System.out.printf("O valor ao quadrado é: %.1f\n", quad);
		System.out.printf("O valor ao cubo é: %.1f", cubo);
		
		entrada.close();
		
		
	}

}
