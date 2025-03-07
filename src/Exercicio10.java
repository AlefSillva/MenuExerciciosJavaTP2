import java.util.Scanner;
import java.util.Random;

public class Exercicio10 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("=========================");
        System.out.println("   JOGO DE ADIVINHAÇÃO   ");
        System.out.println("=========================");

        int numeroSecreto = random.nextInt(100) + 1;
        int palpite = 0;
        int tentativas = 0;

        System.out.println("Tente adivinhar o número entre 1 e 100.");

        while (palpite != numeroSecreto) {
            System.out.print("Digite seu palpite: ");

            if (scanner.hasNextInt()) {
                palpite = scanner.nextInt();

                if (palpite < 1 || palpite > 100) {
                    System.out.println("Por favor, digite um número entre 1 e 100.");
                } else {
                    tentativas++;

                    if (palpite > numeroSecreto) {
                        System.out.println("O número secreto é menor. Tente novamente.");
                    } else if (palpite < numeroSecreto) {
                        System.out.println("O número secreto é maior. Tente novamente.");
                    }
                }
            } else {
                System.out.println("Entrada inválida! Por favor, digite um número.");
                scanner.next();
            }
        }

        System.out.println("Parabéns! Você acertou o número secreto.");
        System.out.println("Número de tentativas: " + tentativas);
    }
}
