package principal;

import java.util.Scanner;

public class Exe05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int A = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int B = scanner.nextInt();
		
		System.out.printf("Os valores são %d e %d\n", A, B);
		
		int troca = A;
		A = B;
		B = troca;
			
		System.out.printf("Os valores trocados de lugar são %d e %d", A, B);
		scanner.close();
	}
}
