import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carteira carteira = new Carteira(); //classe que armazena transacoes:
        int opcao;

        do {
            System.out.println(" ===== MENU PRINCIPAL ======");
            System.out.println("1. Adicionar transação");
            System.out.println("2. Listar transações");
            System.out.println("3. Ver Saldo Atual");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); //Limpa /n

            switch (opcao) {
                case 1:
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();

                    System.out.print("Valor: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine(); //Limpa /n

                    System.out.print("tipo (Entrada/Saida): ");
                    String tipo = scanner.nextLine();

                    Transacao transacao = new Transacao(descricao, tipo, valor);
                    carteira.adicionarTransacao(transacao);
                    System.out.println("Transação adiocionada com sucesso!");
                    break;

                case 2:
                    carteira.listarTransacoes();
                    break;

                case 3:
                    System.out.println("Saldo Atual: R$ " + carteira.calcularSaldo());
                    break;

                case 0:
                    System.out.println("Encerrando Programa...");
                    break;

                default:
                    System.out.println("Opção invalida. tente novamente.");
            }
        } while (opcao !=0);

        scanner.close();
    }
}