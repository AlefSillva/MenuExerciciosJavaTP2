import java.util.Scanner;

public class Exercicio6 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("    VERIFICADOR DE ANO BISSEXTO    ");
        System.out.println("===================================");

        int ano = validarEntrada(scanner);

        if (ehBissexto(ano)) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }

    }

    public static boolean ehBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public static int validarEntrada(Scanner scanner) {
        int ano = 0;

        while (true) {
            System.out.print("Digite um ano para verificar se é bissexto: ");
            if (scanner.hasNextInt()) {
                ano = scanner.nextInt();

                if (ano > 0) {
                    break;
                } else {
                    System.out.println("Por favor, insira um ano válido maior que 0.");
                }
            } else {
                System.out.println("Entrada inválida! Digite um número inteiro válido.");
                scanner.next();
            }
        }
        return ano;
    }
}
