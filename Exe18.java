package principal;

import java.util.Scanner;

public class Exe18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor de a1: ");
        double a1 = scanner.nextDouble();
        
        System.out.println("Digite o valor de n: ");
        double n = scanner.nextDouble();
        
        System.out.println("Digite o valor de r: ");
        double r = scanner.nextDouble();
        
        double PA = a1 + (n - 1) * r; 
        
        System.out.println("An da progressão aritmética equivale a: " +PA);
        		
        scanner.close();
	}

}
