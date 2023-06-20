package principal;

import java.util.Scanner;

public class Exe13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor:");
        double A = scanner.nextInt();

        System.out.println("Digite o segundo valor:");
        double B = scanner.nextInt();
        
        System.out.println("Digite o operador (+, -, *, /):");
        char operador = scanner.next().charAt(0);
        
        double resultado = 0;
        
        switch (operador) {
        case '+':
        	resultado = A + B;
        	break;
        case '-':
        	resultado = A - B;
        	break;
        case '*':
        	resultado = A * B;
        	break;
        case '/':
        	resultado = A * B;
        	break;
        default:
            System.out.println("Operação inválida!");
            break; 
        }
        
        System.out.println("O resultado equivale a " + resultado);
		scanner.close();
	}
}
