package fundamentos.exercicios;

import java.util.Scanner;

public class ConversorFtoC {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double fah = entrada.nextDouble();
		
		double cel = (fah - 32) / 1.8;
				
		System.out.printf("A temperatura em Celsius é: %.1f °C", cel);
			
		entrada.close();
			
	}

}
