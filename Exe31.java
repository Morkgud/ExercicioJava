package Exercicios;

import java.util.Scanner;

public class Exe31 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da massa: ");
        double m = scanner.nextDouble();

        System.out.println("Digite a altura: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o tempo em segundos: ");
        double s = scanner.nextDouble();

        double qtd = (m * a) / (s * 745.6999);

        System.out.println("A quantidade de cavalos necessários é de " +qtd);

        scanner.close();
    }
}
