// 4 - Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

import java.util.Scanner;

public class TabuadaUmDez {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Exibe uma mensagem para o usuário
        System.out.println("Tabuada de 1 a 10 ");
        System.out.println("Escolha um número para fazer o cálculo: ");

        // Lê o número escolhido pelo usuário
        int numeroEscolhido = scanner.nextInt();

        // Loop para calcular e exibir a tabuada de 1 a 10
        for (int i = 1; i <= 10; i++) {
            // Calcula o resultado da multiplicação
            int resultado = numeroEscolhido * i;

            // Exibe o resultado na tela
            System.out.println(numeroEscolhido + " x " + i + " = " + resultado);
        }
    }
}
