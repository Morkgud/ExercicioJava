package principal;

import java.util.Scanner;

public class Exe24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int vetor[] = new int[5];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o " +(i+1)+ " vetor: ");
			vetor[i] = scanner.nextInt();
		}
		
		System.out.println("Digite um número qualquer: ");
		int num = scanner.nextInt();
		
		int quantidade = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == num) {
				quantidade ++;
			}
		}
			
		System.out.println("O número aparece no vetor: " +quantidade+ " vezes");
		
		scanner.close();
	}

}
