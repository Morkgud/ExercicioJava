package principal;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = scanner.nextInt();
		
		if (num > 10) {
			System.out.println("O número é maior que 10");
		}
		else {
			System.out.println("O número é menor ou igual a 10");
		}
		scanner.close();
	}

}
