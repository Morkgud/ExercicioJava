package principal;

import java.util.Scanner;

public class Exe07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: \n");
		int num = scanner.nextInt();
		
		if(num > 100 && num < 200) {
			System.out.println("O número está entre 100 e 200.");
		}
		else {
			System.out.println("O número não está entre 100 e 200.");
		}
		scanner.close();

	}

}
