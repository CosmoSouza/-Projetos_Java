import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 7: ");
        var semana = scanner.nextInt();
       var messege =  switch (semana){
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terca";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sabado";
            default -> ("Opcao invalida");
        };
        System.out.println(messege);
    }
}