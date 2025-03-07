import java.util.Scanner;

public class Exercicio3 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("    CONVERSOR DE MOEDAS    ");
        System.out.println("===========================");

        double valor = validarValor(scanner);

        int escolha = 0;

        while (true) {
            System.out.println("Escolha a moeda de destino (Digite o número correspondente): ");
            System.out.println("1. Dólar (USD)");
            System.out.println("2. Euro (EUR)");
            System.out.println("3. Libra Esterlina (GBP)");

            if(scanner.hasNextInt()){
                escolha = scanner.nextInt();
                if (escolha >= 1 && escolha <= 3) {
                    break;
                } else {
                    System.out.println("Escolha um número entre 1 e 3.");
                }
            } else {
                System.out.println("Por favor, insira uma opção válida.");
                scanner.next();
            }
        }

        double taxaDolar = 5.88;
        double taxaEuro = 6.21;
        double taxaLibra = 7.42;

        double valorConvertido = 0.0;

        switch (escolha) {
            case 1:
                valorConvertido = valor / taxaDolar;
                System.out.printf("Valor convertido: $%.2f USD.\n", valorConvertido);
                break;
            case 2:
                valorConvertido = valor / taxaEuro;
                System.out.printf("Valor convertido: €%.2f EUR.\n", valorConvertido);
                break;
            case 3:
                valorConvertido = valor / taxaLibra;
                System.out.printf("Valor convertido: £%.2f GBP.\n", valorConvertido);
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha um número entre 1 e 3.");
        }
    }

    public static double validarValor(Scanner scanner) {
        double valor = 0;
        while (true) {
            System.out.println("Digite o valor em \"REAIS\" que deseja converter: ");
            String input = scanner.nextLine();
            if (input.matches("\\d+(\\.\\d{1,2})?")) { // Verifica se a entrada é numérica
                valor = Double.parseDouble(input);
                if (valor > 0) {
                    break; // Se o valor for válido, sai do loop
                } else {
                    System.out.println("O valor deve ser maior que zero.");
                }
            } else {
                System.out.println("Por favor, insira um valor válido.");
            }
        }
        return valor;
    }
}
