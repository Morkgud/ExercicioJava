package principal;

import java.util.Scanner;

public class Exe12 {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o número de algum mês:");
	        int mes = scanner.nextInt();
	        
	        switch (mes) {
	        case 1:
	        	System.out.println("O mês é janeiro!");
	        	break;
	        case 2:
	        	System.out.println("O mês é fevereiro");
	        	break;
	        case 3:
	        	System.out.println("O mês é março");
	        	break;
	        case 4:
	        	System.out.println("O mês é abril");
	        	break;
	        case 5:
	        	System.out.println("O mês é maio");
	        	break;
	        case 6:
	        	System.out.println("O mês é junho");
	        	break;
	        case 7:
	        	System.out.println("O mês é julho");
	        	break;
	        case 8:
	        	System.out.println("O mês é agosto");
	        	break;
	        case 9:
	        	System.out.println("O mês é setembro");
	        	break;
	        case 10:
	        	System.out.println("O mês é outubro");
	        	break;
	        case 11:
	        	System.out.println("O mês é novembro");
	        	break;
	        case 12:
	        	System.out.println("O mês é dezembro");
	        	break;
	        default:
	            System.out.println("Mês inválido!");
	            break; 
	        }
	        scanner.close();

	}

}
