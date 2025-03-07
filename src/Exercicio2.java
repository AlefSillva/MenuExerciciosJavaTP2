import java.util.Scanner;

public class Exercicio2 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("    CALCULADORA DE MÉDIA DE NOTAS    ");
        System.out.println("======================================");

        double[] notas = new double[4];

        for (int i = 0; i < 4; i++) {
            while (true) {
                System.out.println("Digite a nota do " + (i + 1) + "º bimestre: ");

                String input = scanner.nextLine();
                input = input.replace("," , ".");

                if (validarNumero(input)){
                    double nota = Double.parseDouble(input);

                    if (nota >= 0 && nota <= 10) {
                        notas[i] = nota;
                        break;
                    } else {
                        System.out.println("Digite uma nota entre 0 e 10");
                    }
                } else {
                    System.out.println("Insira uma nota válida.");
                }
            }
        }

        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;

        String situacao = "";
        if (media >= 7) {
            situacao = "Aprovado";
        } else if (media >= 5 && media < 7) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }

        System.out.println("\nNOTAS:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        System.out.println("Média final: " + media + " | Situação: " + situacao);
    }

    public static boolean validarNumero(String input) {
        return input.matches("[0-9]+(\\.[0-9]+)?");
    }

}
