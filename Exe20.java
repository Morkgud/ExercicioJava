/*package principal;

import java.util.Scanner;

public class Exe20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // vetor e pergunta
        int numeros[] = new int[5];

        for (int counter = 0; counter < numeros.length; counter++) {
            System.out.println("Digite o " + (counter + 1) + " número: ");
            numeros[counter] = scanner.nextInt();
        }

        // soma
        double soma = 0;
        for (int num : numeros) {
            soma += num;
        }

        // media
        double media = soma / 5;

        // classificação dos valores em relação à média
        int classificacao[] = new int[5];
        for (int i = 0; i < classificacao.length; i++) {
            if (numeros[i] < media) {
                classificacao[i] = -1;
            } else if (numeros[i] == media) {
                classificacao[i] = 0;
            } else if (numeros[i] > media) {
                classificacao[i] = 1;
            }
        }

        // demonstração dos valores
        System.out.println("A soma dos valores equivale a: " + soma);
        System.out.println("A média desses números equivale a: " + media);

        StringBuilder menoresBuilder = new StringBuilder("Valores menores que a média: ");
        StringBuilder iguaisBuilder = new StringBuilder("Os valores iguais à média são: ");
        StringBuilder maioresBuilder = new StringBuilder("Os valores maiores que a média são: ");

        boolean existeIgualMedia = false;
        for (int i = 0; i < numeros.length; i++) {
            if (classificacao[i] == -1) {
                menoresBuilder.append(numeros[i]).append(" ");
            } else if (classificacao[i] == 0) {
                iguaisBuilder.append(numeros[i]).append(" ");
                existeIgualMedia = true;
            } else if (classificacao[i] == 1) {
                maioresBuilder.append(numeros[i]).append(" ");
            }
        }

        System.out.println(menoresBuilder.toString());
        if (!existeIgualMedia) {
            System.out.println("Não existem números iguais à média!");
        } else {
            System.out.println(iguaisBuilder.toString());
        }
        System.out.println(maioresBuilder.toString());

        scanner.close();
    }
}*/
package principal;
import java.util.Scanner;

public class Exe20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + " número: ");
            numeros[i] = scanner.nextInt();
        }

        double soma = 0;
        for (int num : numeros) {
            soma += num;
        }

        double media = soma / numeros.length;

        System.out.println("A soma dos valores equivale a: " + soma);
        System.out.println("A média desses números equivale a: " + media);

        StringBuilder menores = new StringBuilder("Valores menores que a média: ");
        StringBuilder iguais = new StringBuilder("Os valores iguais à média são: ");
        StringBuilder maiores = new StringBuilder("Os valores maiores que a média são: ");

        for (int num : numeros) {
            if (num < media) {
                menores.append(num).append(" ");
            } else if (num > media) {
                maiores.append(num).append(" ");
            } else {
                iguais.append(num).append(" ");
            }
        }

        System.out.println(menores.toString());
        System.out.println(iguais.length() > "Os valores iguais à média são: ".length() ? iguais.toString() : "Não existem números iguais à média!");
        System.out.println(maiores.toString());

        scanner.close();
    }
}


