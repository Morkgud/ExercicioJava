package principal;

import java.util.Scanner;

public class Exe26 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int vetor1[] = new int[5];
		
		for (int i = 0; i < vetor1.length; i++) {
			System.out.println("Digite o " +(i+1)+ " item do vetor 1: ");
			vetor1[i] = scanner.nextInt();
		}
		
		
		int vetor2[] = new int[5];
		
		for (int i = 0; i < vetor2.length; i++) {
			System.out.println("Digite o " +(i+1)+ " item do vetor 2: ");
			vetor2[i] = scanner.nextInt();
		}
		
		System.out.println("O vetor 1 e 2 são: ");
		for (int i = 0; i < vetor1.length; i++) {
		    if (vetor1[i] == vetor2[i]) {
		        System.out.println("Iguais");
		    } else {
		        System.out.println("Diferentes");
		    }
		}
			
		scanner.close();

	}

}
