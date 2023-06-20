package principal;

import java.util.Scanner;

public class Exe09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		int A = scanner.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int B = scanner.nextInt();
		
		if (A != B) {
			System.out.println("Os números são diferentes!");
		}
		else {
			System.out.println("Os números são iguais");
		}
		scanner.close();
	}

}
