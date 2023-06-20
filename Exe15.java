package principal;

import java.util.Scanner;

public class Exe15 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Digite o raio do cilindro:");
	        double raio = scanner.nextDouble();

	        System.out.println("Digite a altura do cilindro:");
	        double altura = scanner.nextDouble();
	        
	        double quadrado = raio * raio;
	        
	        double volume = Math.PI * quadrado * altura;
	        
	        System.out.println("O volume do cilindro equivale a: " +volume);
	        
	        scanner.close();

	}

}
