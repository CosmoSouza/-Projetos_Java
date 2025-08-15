import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        var altura = sc.nextDouble();

        System.out.println("Digite seu Peso: ");
        var peso = sc.nextDouble();

        var imc = peso/ (altura * altura);
        System.out.printf("Seu IMC e: %s \n", imc);

        if (imc <= 18.5){
            System.out.println("Esta Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso igual!");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso!");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade Grau |");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade Grau || (Severa)");
        } else if (imc >= 40.0) {
            System.out.println("Obesidade ||| (Mórbida");
        }
     }
    }