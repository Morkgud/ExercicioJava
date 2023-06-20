package principal;

import java.util.Scanner;

public class Exe08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int num = scanner.nextInt();
		
		if (num >= 50) {
			System.out.println("O número é maior ou igual a 50");
		}
		else {
			System.out.printf("O número é menor que 50");
		}
		
		scanner.close();

	}

}
