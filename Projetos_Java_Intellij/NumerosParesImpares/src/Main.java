
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite o segundo número (maior que o primeiro): ");
        int numero2 = sc.nextInt();

        // Valida o segundo número
        while (numero2 <= numero1) {
            System.out.print("Número inválido! Digite novamente: ");
            numero2 = sc.nextInt();
        }

        sc.nextLine(); // limpar buffer

        System.out.print("Digite 'par' ou 'impar': ");
        String escolha = sc.nextLine().toLowerCase();

        // Valida a escolha
        while (!escolha.equals("par") && !escolha.equals("impar")) {
            System.out.print("Opção inválida! Digite 'par' ou 'impar': ");
            escolha = sc.nextLine().toLowerCase();
        }

        // Imprime em ordem decrescente
        for (int i = numero2; i >= numero1; i--) {
            if (escolha.equals("par") && i % 2 == 0 || escolha.equals("impar") && i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}