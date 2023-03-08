package fundamentos.exercicios;

import java.util.Scanner;

public class ConversorCtoF {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius");
		double cel = entrada.nextDouble();
		
		double fah = cel * 1.8 + 32;
		
		System.out.printf("A temperatura em Fahrenheit é: %.1f °F", fah);		
		
		
		entrada.close();
		
		
	}

}
