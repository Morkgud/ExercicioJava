package Exercicios;

import java.util.Scanner;

public class Exe28 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Defina o primeiro salário: ");
        double s1 = scanner.nextDouble();

        System.out.println("Defina o segundo salário: ");
        double s2 = scanner.nextDouble();

        System.out.println("Defina o terceiro salário: ");
        double s3 = scanner.nextDouble();

        System.out.println("Defina o quarto salário: ");
        double s4 = scanner.nextDouble();

        double mediaSalarial = (s1+s2+s3+s4) / 4;

        System.out.println("A Média salarial dos funcionários foi de " +mediaSalarial+ "R$ reais");*/

        double salarios[] = new double[10];

        for (int c = 0; c < salarios.length; c++){
            System.out.println("Defina o " +(c+1)+ "º salário: ");
            salarios[c] = scanner.nextDouble();
        }

        //media dos salarios
        double salario = 0;
        for (int c = 0; c < salarios.length; c++){
            salario += salarios[c];
        }

        double media = salario / salarios.length;

        System.out.println("A média salarial de" +salarios.length+ "funcionários equivale a: " +media+ "R$ reais");
        scanner.close();
    }
}



