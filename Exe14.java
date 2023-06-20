package principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
        double A = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        double B = scanner.nextDouble();
        
        System.out.println("Digite a terceira nota:");
        double C = scanner.nextDouble();
        
        double media = (A + B + C) / 3;
        
        DecimalFormat df = new DecimalFormat("#.##"); // Define o padrão de formatação com duas casas decimais
        String mediaFormatada = df.format(media);
        
        System.out.printf("A sua média é: " +mediaFormatada);
        
        scanner.close();

	}

}
