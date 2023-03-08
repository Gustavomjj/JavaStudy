package fundamentos.exercicios;

import java.util.Scanner;

public class FormulaDeBhaskara {
	
	public static void main(String[] args) {
		
		System.out.println("CALCULADORA DE EQUAÇÕES DO 2º GRAU");
		System.out.println("----------------------------------");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de A:");
		int a = entrada.nextInt();
		
		System.out.println("Digite o valor de B:");
		int b = entrada.nextInt();
		
		System.out.println("Digite o valor de C:");
		int c = entrada.nextInt();
		
		// Calculo do delta
		
		int delta = (b*b) - 4*(a*c);
		
		System.out.printf("\nSua equação é: %dx² + %dx + %d = 0", a, b, c);
		
		System.out.printf("\nO valor de delta é: %d", delta);
		
		double x1 = (-b + Math.sqrt(delta))/(2*a);
		double x2 = (-b - Math.sqrt(delta))/(2*a);
		
		System.out.printf("\nAs raízes da equação são %.0f e %.0f", x1, x2);
		
		
		entrada.close();
	}
}
