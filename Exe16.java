package principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exe16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a velocidade média da viagem em KM/H: ");
        double velocidade = scanner.nextDouble();

        System.out.println("Digite o tempo da viagem em horas:");
        double tempo_viagem = scanner.nextDouble();
        
        double litrosGastos = (velocidade * tempo_viagem) /12;
        
        DecimalFormat df = new DecimalFormat("#.##"); // Define o padrão de formatação com duas casas decimais
        String LitrosFormatado = df.format(litrosGastos);
        
        System.out.println("Quantidade de litros gasta nessa viagem: " +LitrosFormatado );

        scanner.close();
	}

}
