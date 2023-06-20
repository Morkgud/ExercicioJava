package principal;

import java.util.Scanner;

public class Exe06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a têmperatura em celsius: \n");
		Double C = scanner.nextDouble();
		
		Double F = (9 * C + 160) / 5;
		
		System.out.printf("A têmperatura convertida de celsius para fahrenheit é de: %f ", F);
		scanner.close();
	}

}
