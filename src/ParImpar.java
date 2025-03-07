//Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        System.out.println("Verificar se é Par ou Ímpar: ");
        System.out.println("Digite um número para saber se é par ou ímpar: ");

        Scanner scanner = new Scanner(System.in);
        int numeroEscolhido = scanner.nextInt();

        if ((numeroEscolhido % 2) == 0) { // Verifica se o resto da divisão por 2 é 0
            System.out.println("Esse número é par");
        } else {
            System.out.println("Esse número é ímpar");
        }
    }
}