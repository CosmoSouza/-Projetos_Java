import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite um numero para ver a tabuada: ");
        var numero = scanner.nextInt();
        for (int i = 1; i <= 10; i++){

            System.out.println(numero + " x " + i + " = " + (numero * i));
        }


        }
    }
