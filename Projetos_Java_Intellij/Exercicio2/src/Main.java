import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var Scanner = new Scanner(System.in);
        System.out.println("Informe o tamanho do lado do quadrado: ");
        var tamanho = Scanner.nextInt();
        var area = tamanho * tamanho;
        System.out.printf("O tamanho Da Area e: %s \n", area);

    }
}