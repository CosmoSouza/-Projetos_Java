import java.sql.DatabaseMetaData;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var Databasi = 2025;
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome? ");
        var nome = scanner.next();
        System.out.println("Informe seu ano de nascimento?" );
        var nascimento = scanner.nextInt();
        var age = Databasi - nascimento;
        System.out.println(" Ola " + nome + " voce tem " + age + "  Anos");

    }
}