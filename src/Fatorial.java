import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Exibe uma mensagem para o usuário
        System.out.println("Digite um número para calcular o fatorial: ");

        // Lê o número escolhido pelo usuário
        int numeroEscolhido = scanner.nextInt();

        // Verifica se o número é negativo
        if (numeroEscolhido < 0) {
            System.out.println("Não é possível calcular o fatorial de um número negativo.");
        } else {
            // Inicializa a variável fatorial com 1
            long fatorial = 1;

            // Calcula o fatorial usando um loop for
            for (int i = numeroEscolhido; i >= 1; i--) {
                fatorial *= i; // Multiplica o fatorial pelo valor atual de i
            }

            // Exibe o resultado
            System.out.println("O fatorial de " + numeroEscolhido + " é: " + fatorial);
        }
    }
}