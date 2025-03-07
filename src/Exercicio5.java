import java.util.Scanner;

public class Exercicio5 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("   CALCULADORA DE DESCONTOS PROGRESSIVOS   ");
        System.out.println("===========================================");

        double valorCompra = validarEntrada(scanner);

        double desconto = 0.0;

        if (valorCompra > 1000) {
            desconto = 0.10;
        } else if (valorCompra >= 500) {
            desconto = 0.05;
        }

        double valorDesconto = valorCompra * desconto;
        double valorFinal = valorCompra - valorDesconto;


        System.out.println("\n========== RESUMO ==========");
        System.out.printf("Valor original: R$ %.2f\n", valorCompra);
        System.out.printf("Desconto aplicado: R$ %.2f (%.0f%%)\n", valorDesconto, desconto * 100);
        System.out.printf("Valor final: R$ %.2f\n", valorFinal);
    }

    public static double validarEntrada(Scanner scanner) {
        double valor;
        while (true) {
            System.out.print("Digite o valor da compra (positivo): R$ ");
            if (scanner.hasNextDouble()) {
                valor = scanner.nextDouble();
                if (valor > 0) {
                    break;
                } else {
                    System.out.println("O valor não pode ser negativo ou zero. Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida! Digite um número válido.");
                scanner.next();
            }
        }
        return valor;
    }

}
