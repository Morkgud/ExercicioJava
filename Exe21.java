package principal;

import java.util.Scanner;

public class Exe21 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor: ");
		int tamanho = scanner.nextInt();
		
		int vetor[] = new int[tamanho];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o número da posição " + i + ": ");
			vetor[i] = scanner.nextInt();
		}
		
		for (int numero : vetor) {
		    String classificacao;

		    if (numero > 0) {
		        classificacao = "positivo";
		    } else if (numero < 0) {
		        classificacao = "negativo";
		    } else {
		        classificacao = "zero";
		    }

		    System.out.println("O número é " + numero + " e é " + classificacao + ".");
		}
		
		scanner.close();

	}

}
