package Exercicios;

import java.util.Scanner;

public class Exe30 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        double r = scanner.nextDouble();

        System.out.println("Digite o valor da altura: ");
        double h = scanner.nextDouble();

        double v = 3.14159 * r * r * h;

        System.out.println("O volume da lata de óleo: " +v+ "m³");

        scanner.close();
    }
}
