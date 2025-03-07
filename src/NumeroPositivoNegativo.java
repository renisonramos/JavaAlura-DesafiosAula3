// 1 - Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

import java.util.Scanner;

public class NumeroPositivoNegativo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Verificação de Números Positivos ou Negativos");
        System.out.println("Digite um número para saber se é positivo ou negativo: ");

        // Lê o número digitado pelo usuário
        double numeroDigitado = scanner.nextDouble();

        // Verifica se o número é positivo, negativo ou zero
        if (numeroDigitado > 0) {
            System.out.println("Esse número é positivo");
        } else if (numeroDigitado < 0) {
            System.out.println("Esse número é negativo");
        } else {
            System.out.println("O número que você digitou foi ZERO");
        }
    }
}