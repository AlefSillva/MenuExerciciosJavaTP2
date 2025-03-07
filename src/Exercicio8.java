import java.util.Scanner;

public class Exercicio8 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("   Classificação de triângulos   ");
        System.out.println("==================================");

        double lado1 = obterLado(scanner, "primeiro");
        double lado2 = obterLado(scanner, "segundo");
        double lado3 = obterLado(scanner, "terceiro");

        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            System.out.println("Os lados do triângulo devem ser maiores que zero. Tente novamente.");
        } else {

            if (validarTriangulo(lado1, lado2, lado3)) {
                String tipo = classificarTriangulo(lado1, lado2, lado3);
                System.out.println("O triângulo é " + tipo + ".");
            } else {
                System.out.println("As medidas informadas não formam um triângulo válido.");
            }
        }

    }

    private static double obterLado(Scanner scanner, String lado) {
        double valorLado = 0;
        boolean valorValido = false;

        while (!valorValido) {
            try {
                System.out.println("Digite o comprimento do " + lado + " lado: ");
                valorLado = scanner.nextDouble();
                valorValido = true;
            } catch (Exception e) {
                System.out.println("Valor inválido! Por favor, digite um número válido.");
                scanner.nextLine();
            }
        }

        return valorLado;
    }

    public static boolean validarTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }

    public static String classificarTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return "Isósceles";
        } else {
            return "Escaleno";
        }
    }
}
