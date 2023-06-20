package principal;

import java.util.Scanner;

public class Exe17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Digite o primeiro peso:");
        double peso1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo peso:");
        double peso2 = scanner.nextDouble();
        
        System.out.println("Digite o terceiro peso:");
        double peso3 = scanner.nextDouble();
        
        double media_ponderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 +peso3);
        
        System.out.println("A média ponderada dos itens é: " +media_ponderada);
		
		scanner.close();
	}

}
