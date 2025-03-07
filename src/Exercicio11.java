import java.util.Scanner;

public class Exercicio11 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================");
        System.out.println("   JOGO DE ADIVINHAÇÃO   ");
        System.out.println("=========================");

        int valorInicial = 0;
        int incremento = 0;

        while (true) {
            System.out.print("Digite o valor inicial: ");
            if (scanner.hasNextInt()) {
                valorInicial = scanner.nextInt();
                break;  // Sai do loop se for um número válido
            } else {
                System.out.println("Por favor, digite um número válido.");
                scanner.next();  // Descarte a entrada inválida
            }
        }

        while (true) {
            System.out.print("Digite o incremento: ");
            if (scanner.hasNextInt()) {
                incremento = scanner.nextInt();
                break;  // Sai do loop se for um número válido
            } else {
                System.out.println("Por favor, digite um número válido.");
                scanner.next();  // Descarte a entrada inválida
            }
        }

        int valorAtual = valorInicial;
        while (valorAtual <= 100) {
            System.out.println(valorAtual);
            valorAtual += incremento;  // Atualiza o valor atual com o incremento
        }
    }
}
