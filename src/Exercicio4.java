import java.util.Scanner;

public class Exercicio4 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("     CALCULADORA DE IDADE EM DIAS     ");
        System.out.println("======================================");

        System.out.println("===== Digite sua data de nascimento =====");

        int diaNascimento = 0;
        int mesNascimento = 0;
        int anoNascimento = 0;

        while (true) {
            diaNascimento = validarEntrada(scanner ,"Digite o dia do nascimento (1-31): ");
            mesNascimento = validarEntrada(scanner , "Digite o mês de nascimento (1-12): ");
            anoNascimento = validarEntrada(scanner, "Digite o ano de nascimento (AAAA): ");

            if (validarData(diaNascimento, mesNascimento, anoNascimento)) {
                break;
            } else {
                System.out.println("Data inválida! Tente novamente.");
            }
        }

        int idadeEmDias = calcularIdadeEmDias(diaNascimento, mesNascimento, anoNascimento);

        System.out.println("Sua idade em dias é: " + idadeEmDias + " dias.");
    }

    public static int validarEntrada(Scanner scanner, String mensagem) {
        int valor;
        while (true) {
            System.out.println(mensagem);
            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida! Digite um número válido.");
                scanner.next();
                continue;
            }

            valor = scanner.nextInt();

            if (mensagem.contains("dia") && (valor < 1 || valor > 31)) {
                System.out.println("Dia inválido! Digite um número entre 1 e 31.");
            } else if (mensagem.contains("mês") && (valor < 1 || valor > 12)) {
                System.out.println("Mês inválido! Digite um número entre 1 e 12.");
            } else if (mensagem.contains("ano") && (valor < 1900 || valor > 2025)) {
                System.out.println("Ano inválido! Digite um ano entre 1900 e 2025.");
            } else {
                break;
            }
        }
        return valor;
    }



    public static boolean validarData(int dia, int mes, int ano) {

        if (mes < 1 || mes > 12) {
            System.out.println("Mês inválido! O mês deve ser entre 1 e 12.");
            return false;
        }

        int anoAtual = 2025;

        if (ano > anoAtual) {
            System.out.println("Ano inválido! O ano não pode ser maior que o ano atual.");
            return false;
        }

        if (dia < 1 || dia > diasPorMes(mes, ano)) {
            System.out.println("Dia inválido! O dia deve estar dentro do mês informado.");
            return false;
        }

        return true;
    }

    public static int calcularIdadeEmDias(int dia, int mes, int ano) {
        int dias = 0;
        int anoAtual = 2025;
        int mesAtual = 3;
        int diaAtual = 6;

        for (int i = ano; i < anoAtual; i++) {
            if (ehBissexto(i)) {
                dias += 366;
            } else {
                dias += 365;
            }
        }

        for (int i = 1; i < mesAtual; i++) {
            dias += diasPorMes(i, anoAtual);
        }

        dias += diaAtual;

        for (int i = 1; i < mes; i++) {
            dias -= diasPorMes(i, ano);
        }
        dias -= dia;

        return dias;
    }

    public static boolean ehBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public static int diasPorMes(int mes, int ano) {
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return ehBissexto(ano) ? 29 : 28;
            default:
                return 0;
        }
    }
}
