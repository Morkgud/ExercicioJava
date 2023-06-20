package principal;

import java.util.Scanner;

public class Exe27 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int vetor1[] = new int[5];

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println("Digite o " + (i + 1) + " item do vetor 1: ");
            vetor1[i] = scanner.nextInt();
        }

        int vetor2[] = new int[5];
        for (int i = 0; i < vetor2.length; i++) {
            System.out.println("Digite o " + (i + 1) + " item do vetor 2: ");
            vetor2[i] = scanner.nextInt();
        }

        int tamanhoTotal = vetor1.length + vetor2.length;
        int[] vetorConcatenado = new int[tamanhoTotal];

        for (int i = 0; i < vetor1.length; i++) {
            vetorConcatenado[i] = vetor1[i];
        }

        for (int i = 0; i < vetor2.length; i++) {
            vetorConcatenado[vetor1.length + i] = vetor2[i];
        }

        System.out.println("Vetor concatenado: ");
        for (int i = 0; i < vetorConcatenado.length; i++) {
            System.out.print(vetorConcatenado[i] + " ");
        }

        scanner.close();
    }
}
