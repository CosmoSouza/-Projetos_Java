import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        var nome = scanner.next();
        System.out.println("Digite sua idade: ");
        var idade = scanner.nextInt();
        System.out.println("Voce e emancipado? (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        var canDrive = (idade >= 18) || (idade >=16 && isEmancipated);
        var messege = canDrive ?
                nome + ", voce pode Dirigir! \n" :
                nome + ", voce nao pode Dirigir! \n";

        System.out.println(messege);
        System.out.println("Boa noite!");

    }
}