package principal;

import java.util.Scanner;

public class Exe23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int vetor[] = new int[5];
		
		for (int i = 0; i <vetor.length; i++) {
			System.out.println("Digite o " +(i+1)+ " vetor: ");
			vetor[i] = scanner.nextInt();
		}
		
		System.out.println("Digite um número a ser comparado: ");
		int num = scanner.nextInt();
		
		System.out.println("Índices dos elementos inferiores a " + num + ":");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < num) {
				System.out.print(i+ " ");
			}
		}
		
		scanner.close();

	}

}
