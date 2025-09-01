import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua Altura:");
        var altura = sc.nextDouble();

        System.out.println("Digite seu peso:");
        var peso = sc.nextDouble();

        var imc = peso/(altura * altura);

        if (imc <= 18.6){
            System.out.println("Abaixo do peso!");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso Ideal!");
        } else if (imc >= 30.0 && imc <=34.9) {
            System.out.println("Obesidade Grau |");
        } else if (imc >= 35.0 && imc <=39.9) {
            System.out.println("Obesidade|| (Severa)");
        } else if (imc >= 40.0 ) {
            System.out.println("Obesidade ||| (Morbida)");

        }
        sc.close();
    }
    }