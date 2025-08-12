import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var Scanner = new Scanner(System.in);
        System.out.print("Qual é a idade da Primeira pessoa: ");
        var idade1 = Scanner.nextInt();
        System.out.print("Qual é a idade da Segunda pessoa: ");
        var idade2 = Scanner.nextInt();
        var diferenca = idade1 - idade2;
        System.out.println();
        System.out.printf("Diferenca de Idade = %s Anos \n", diferenca);


        }
    }
