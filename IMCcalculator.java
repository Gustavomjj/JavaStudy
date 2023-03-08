package fundamentos.exercicios;

import java.util.Scanner;

public class IMCcalculator {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
			System.out.println("Digite seu peso: ");
			double peso = entrada.nextDouble();
			
			System.out.println("Digite sua altura: ");
			double altura = entrada.nextDouble();
			
			// Calculo IMC
			
			double imc = peso / (altura*altura);
			
			System.out.printf("Seu IMC é de: %.1f ", imc);
			
		entrada.close();
		
	}
}
