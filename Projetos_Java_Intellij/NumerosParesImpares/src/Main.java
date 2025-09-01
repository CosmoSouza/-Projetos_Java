import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        var numero = scanner.nextInt();
       if (numero % 2 == 0) {
           System.out.printf("é Par!", numero);
       }else {
           System.out.printf("é Impar!", numero);
       }

        }
        }

