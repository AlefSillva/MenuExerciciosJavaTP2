import java.util.Scanner;

public class Exercicio1 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("    CADASTRO DE USUÁRIO    ");
        System.out.println("===========================");


        String nome = validarNome(scanner, "nome completo");

        int idade = validarIdade(scanner);
        scanner.nextLine();

        String nomeDaMae = validarNome(scanner, "nome da mãe");
        String nomeDoPai = validarNome(scanner, "nome do pai");

        System.out.println("\n=================================");
        System.out.println("Nome completo: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nome da mãe: " + nomeDaMae);
        System.out.println("Nome do pai: " + nomeDoPai);
        System.out.println("=================================");

        int tamanhoNome = nome.length();
        int tamanhoNomeMae = nomeDaMae.length();
        int tamanhoNomePai = nomeDoPai.length();

        if (tamanhoNome > tamanhoNomeMae && tamanhoNome > tamanhoNomePai) {
            System.out.println("Seu nome tem mais letras que o nome da sua mãe e do seu pai. ");
        } else if (tamanhoNomeMae > tamanhoNome && tamanhoNomeMae > tamanhoNomePai) {
            System.out.println("O nome da sua mãe tem mais letras que o seu nome e o nome do seu pai.");
        } else if (tamanhoNomePai > tamanhoNome && tamanhoNomePai > tamanhoNomeMae) {
            System.out.println("O nome do seu pai tem mais letras que o seu nome e o nome da sua mãe.");
        } else {
            System.out.println("Há nomes com o mesmo número de letras.");
        }
    }

    public static int validarIdade(Scanner scanner) {
        int idade;
        while (true) {
            System.out.println("Digite sua idade: ");
            if (scanner.hasNextInt()) {
                idade = scanner.nextInt();
                if (idade > 0) {
                    break; // Se a idade for válida, sai do loop
                } else {
                    System.out.println("A idade não pode ser negativa. Insira uma idade válida.");
                }
            } else {
                System.out.println("Por favor, insira uma idade válida.");
                scanner.next(); // Limpar o buffer para evitar loop infinito
            }
        }
        return idade;
    }


    public static String validarNome(Scanner scanner, String tipoNome) {
        String nome;
        do {
            System.out.println("Digite o " + tipoNome + ": ");
            nome = scanner.nextLine();


            if (nome.trim().isEmpty()) {
                System.out.println("O campo " + tipoNome + " não pode ser vazio. Insira um nome válido.");
            } else if (!nome.matches("^[a-zA-ZÀ-ÿ\\s]+$")) {
                System.out.println("O " + tipoNome + " não pode conter caracteres especiais ou números. Insira um nome válido.");
            } else {
                break;
            }
        } while (true);

        return nome;
    }
}
