import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        do {
            System.out.println("===========================");
            System.out.println("    MENU DE EXERCÍCIOS    ");
            System.out.println("===========================");

            System.out.println("===== Escolha uma opção abaixo =====");
            System.out.println("1 - Cadastro de Usuário Completo");
            System.out.println("2 - Calculadora de Média de Notas");
            System.out.println("3 - Conversor de Moedas");
            System.out.println("4 - Calculadora de Idade em Dias");
            System.out.println("5 - Calculadora de Descontos Progressivos");
            System.out.println("6 - Verificador de Ano Bissexto");
            System.out.println("7 - Calculadora de Imposto de Renda");
            System.out.println("8 - Classificação de Triângulos");
            System.out.println("9 - Validador de Senha");
            System.out.println("10 - Jogo de Adivinhação");
            System.out.println("11 - Sequência Numérica Personalizada");
            System.out.println("12 - Contagem de Palavras");
            System.out.println("0 - SAIR\n");

            System.out.println("Digita a opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Entrada inválida! Por favor, digite um número válido.");
                scanner.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    Exercicio1.executar();
                    break;
                case 2:
                    Exercicio2.executar();
                    break;
                case 3:
                    Exercicio3.executar();
                    break;
                case 4:
                    Exercicio4.executar();
                    break;
                case 5:
                    Exercicio5.executar();
                    break;
                case 6:
                    Exercicio6.executar();
                    break;
                case 7:
                    Exercicio7.executar();
                    break;
                case 8:
                    Exercicio8.executar();
                    break;
                case 9:
                    Exercicio9.executar();
                    break;
                case 10:
                    Exercicio10.executar();
                    break;
                case 11:
                    Exercicio11.executar();
                    break;
                case 12:
                    Exercicio12.executar();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            if (opcao != 0) {
                System.out.println("\nPressione ENTER para voltar ao menu...");
                scanner.nextLine();
            }

        } while (opcao !=0);
    }
}