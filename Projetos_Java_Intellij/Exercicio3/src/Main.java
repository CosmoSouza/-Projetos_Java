import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var Scanner = new Scanner(System.in);
        System.out.print("Digite o valor da Base: ");
        var base = Scanner.nextInt();
        System.out.print("Digite o valor da Altura: ");
        var altura = Scanner.nextInt();

        var area = base * altura;
        System.out.println();
        System.out.printf("Valor da Area: %s \n", area);

    }
}