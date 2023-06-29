package Exercicios;

import java.util.Scanner;

public class Exe29 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura da parede: ");
        double hp = scanner.nextDouble();

        System.out.println("Digite a largura da parede: ");
        double lp = scanner.nextDouble();

        System.out.println("Digite a altura do azulejo: ");
        double ha = scanner.nextDouble();

        System.out.println("Digite a largura do azulejo: ");
        double la = scanner.nextDouble();

        double qtd = (hp / lp) * (ha / la);

        System.out.println("A quantidade de azulejos necessários para cobrir a parede é de " + qtd+ " Azulejos");

        scanner.close();

    }
}
