package principal;

import java.util.Scanner;

public class Exe22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do vetor: ");
		int tamanho = scanner.nextInt();
		
		int vetor[] = new int[tamanho];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o número da posicao" +i+ ": ");
			vetor[i] = scanner.nextInt();
		}
		
		System.out.println("O dobro dos números de cada posição equivalem a: ");
		for(int numeros : vetor) {
			int dobro = numeros * 2;
			System.out.print(dobro + ", " );
		}
		
		
		scanner.close();

	}

}
