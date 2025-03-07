import java.util.Scanner;

public class Exercicio7 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=====================================");
        System.out.println("   CALCULADORA DE IMPOSTO DE RENDA   ");
        System.out.println("=====================================");

        double salarioBrutoAnual = validarEntrada(scanner);

        double imposto = calcularImposto(salarioBrutoAnual);

        double salarioLiquido = salarioBrutoAnual - imposto;

        System.out.printf("Salário Bruto Anual: R$ %.2f\n", salarioBrutoAnual);
        System.out.printf("Imposto de Renda: R$ %.2f\n", imposto);
        System.out.printf("Salário Líquido: R$ %.2f\n", salarioLiquido);

        scanner.close();
    }

    public static double validarEntrada(Scanner scanner) {
        double salario = -1;

        while (salario <= 0) {
            System.out.print("Digite o seu salário bruto anual: R$ ");
            String input = scanner.nextLine();

            try {
                salario = Double.parseDouble(input);
                if (salario <= 0) {
                    System.out.println("O salário deve ser maior que zero. Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Digite um número válido.");
            }
        }

        return salario;
    }

    public static double calcularImposto(double salarioBruto) {
        double imposto = 0;

        if (salarioBruto <= 22847.76) {
            imposto = 0;
        } else if (salarioBruto <= 33919.80) {
            imposto = (salarioBruto - 22847.76) * 0.075;
        } else if (salarioBruto <= 45012.60) {
            imposto = (salarioBruto - 33919.80) * 0.15 + (33919.80 - 22847.76) * 0.075;
        } else if (salarioBruto <= 55976.16) {
            imposto = (salarioBruto - 45012.60) * 0.225 + (45012.60 - 33919.80) * 0.15 + (33919.80 - 22847.76) * 0.075;
        } else {
            imposto = (salarioBruto - 55976.16) * 0.275 + (55976.16 - 45012.60) * 0.225 +
                    (45012.60 - 33919.80) * 0.15 + (33919.80 - 22847.76) * 0.075;
        }

        return imposto;
    }
}
