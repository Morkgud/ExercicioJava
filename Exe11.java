package principal;

import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor:");
        int valor2 = scanner.nextInt();

        System.out.println("Digite o terceiro valor:");
        int valor3 = scanner.nextInt();

        if (valor1 <= valor2 && valor1 <= valor3) {
            if (valor2 <= valor3) {
                System.out.println(valor1 + ", " + valor2 + ", " + valor3);
            } else {
                System.out.println(valor1 + ", " + valor3 + ", " + valor2);
            }
        } else if (valor2 <= valor1 && valor2 <= valor3) {
            if (valor1 <= valor3) {
                System.out.println(valor2 + ", " + valor1 + ", " + valor3);
            } else {
                System.out.println(valor2 + ", " + valor3 + ", " + valor1);
            }
        } else {
            if (valor1 <= valor2) {
                System.out.println(valor3 + ", " + valor1 + ", " + valor2);
            } else {
                System.out.println(valor3 + ", " + valor2 + ", " + valor1);
            }
        }
        scanner.close();
    }
}