package principal;

import java.util.Scanner;

public class Exe03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		int A = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int B = scanner.nextInt();
		
		if (A > B) {
			System.out.println("A é maior que B");
		}
		
		else {
			System.out.println("B é maior que A");
		}
		
		scanner.close();
}
}
