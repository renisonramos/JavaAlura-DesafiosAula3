// 2 - Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

import java.util.Scanner;

public class ComparacaoNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Comparação de Números");

        // Lê o primeiro valor
        System.out.println("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        // Lê o segundo valor
        System.out.println("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        // Compara os números e exibe a mensagem apropriada
        if (valor1 == valor2) {
            System.out.println("Os números são iguais");
        } else {
            System.out.println("Os números são diferentes");

            // Verifica qual número é maior
            if (valor1 > valor2) {
                System.out.println("O primeiro é maior");
            } else {
                System.out.println("O segundo é maior");
            }
        }
    }
}