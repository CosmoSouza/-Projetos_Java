import java.sql.DatabaseMetaData;
import java.time.OffsetDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var basiYear = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome? ");
        var nome = scanner.next();
        System.out.println("Informe seu ano de nascimento?" );
        var nascimento = scanner.nextInt();
        var age = basiYear - nascimento;
        System.out.println(" Ola " + nome + " voce tem " + age + "  Anos");

    }
}