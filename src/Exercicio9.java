import java.util.Scanner;

public class Exercicio9 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================");
        System.out.println("   VALIDADOR DE SENHAS   ");
        System.out.println("=========================");

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        if (senha.length() < 8){
            System.out.println("A senha tem que ter no mínimo 8 caracteres.");
        } else {
            while (true) {
                System.out.print("Digite novamente a senha: ");
                String senhaConfirmada = scanner.nextLine();

                if (senha.equals(senhaConfirmada)) {
                    System.out.println("Senha cadastrada com sucesso!");
                    break;
                } else {
                    System.out.println("As senhas não coincidem. Tente novamente.");
                }
            }
        }
    }
}
