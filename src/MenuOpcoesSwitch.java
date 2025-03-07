// Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

import java.util.Scanner;

public class MenuOpcoesSwitch {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Exibe o menu de opções
        System.out.println("Escolha alguma das opções:");
        System.out.println("1 - Calcular área do quadrado");
        System.out.println("2 - Calcular área do círculo");

        // Lê a escolha do usuário
        int escolha = scanner.nextInt();

        // Executa a ação correspondente à escolha do usuário
        switch (escolha) {
            case 1:
                System.out.println("Qual o lado do quadrado?");
                double ladoQuadrado = scanner.nextDouble();
                double areaQuadrado = ladoQuadrado * ladoQuadrado;
                System.out.println("A área do quadrado é igual a: " + String.format("%.2f", areaQuadrado));
                break;
            case 2:
                System.out.println("Qual é o raio do círculo?");
                double raioCirculo = scanner.nextDouble();
                double areaCirculo = Math.PI * (raioCirculo * raioCirculo); // Usando Math.PI
                System.out.println("A área do círculo é igual a: " + String.format("%.2f", areaCirculo)); // Usando Math.PI
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}