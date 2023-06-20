package principal;

import java.util.Scanner;

public class Exe04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int num2 = scanner.nextInt();
		
		int soma = num1 + num2;
		int sub = num1 - num2;
		int mult = num1 * num2;
		int div;
		
		System.out.println("A soma dos números equivale a "+soma);
		System.out.println("A subtração dos números equivale a "+sub);
		System.out.println("A multiplicação dos números equivale a "+mult);

        if (num2 != 0) {
            div = num1 / num2;
            System.out.println("A divisão dos números equivale a " + div);
        } else {
            System.out.println("Não é possível dividir por zero.");
        }
		
		scanner.close();
}
}