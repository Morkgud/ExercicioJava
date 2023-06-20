package principal;

import java.util.Scanner;

public class Exe19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int notas = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a " + (i+1) + " nota: ");
			notas += scanner.nextInt();
		}
		int media = notas / 5;
		
		System.out.println("A média equivale a " +media);
		scanner.close();
	}
}
