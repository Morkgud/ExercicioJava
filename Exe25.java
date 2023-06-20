package principal;

import java.util.Scanner;

public class Exe25 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double notas[] = new double[5];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a sua " +(i+1)+ " nota: ");
			notas[i] = scanner.nextInt();
		}
		
		double pesos[] = new double[5];
		
		for (int i = 0; i < pesos.length; i++) {
			System.out.println("Digite o " +(i+1)+ " peso da nota: ");
			pesos[i] = scanner.nextInt();
		}
		
		double soma_produtos = 0;
		double soma_pesos = 0;
		
		for (int i = 0; i < notas.length; i++) {
			soma_produtos += notas[i] * pesos[i];
			soma_pesos += pesos[i];
		}
		
		double media_ponderada = soma_produtos / soma_pesos;
		
		System.out.println("A média ponderada das notas equivale a: " +media_ponderada);
		scanner.close();
	}

}
