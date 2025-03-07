import java.util.Scanner;

public class Exercicio12 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("   CONTAGEM DE PALAVRAS   ");
        System.out.println("==========================");

        String frase = "";

        while (true) {
            System.out.print("Digite uma frase: ");
            frase = scanner.nextLine().trim();

            if (frase.isEmpty()) {
                System.out.println("A frase não pode estar vazia. Tente novamente.");
            } else {
                break;
            }
        }

        String[] palavras = frase.split(" ");

        int contador = 0;
        for (String palavra : palavras) {
            if (!palavra.isEmpty()) {
                contador++;
            }
        }

        System.out.println("A frase contém " + contador + " palavras.");
    }
}
