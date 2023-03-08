package fundamentos.exercicios;

import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor da base do triangulo: ");
		double base = entrada.nextDouble();
		
		System.out.println("Digite o valor da altura do trianglo: ");
		double altura = entrada.nextDouble();
		
		// Calculo da área do triangulo
		
		double area = (base*altura)/2;
		
		System.out.printf("A área do triangulo é de: %.1f cm²", area);
		
		entrada.close();
				
	}
	
}
