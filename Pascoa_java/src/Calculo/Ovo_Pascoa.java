package Calculo;

import java.util.ArrayList;
import java.util.Scanner;

public class Ovo_Pascoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Ingrediente> ingredientes = new ArrayList<>();

        System.out.println("=== Cadastro de Ingredientes do Ovo de Páscoa ===");

        while (true) {
            System.out.print("\nNome do ingrediente (ou 'fim' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) break;

            System.out.print("Quantidade em gramas: ");
            double quantidade = Double.parseDouble(scanner.nextLine());

            System.out.print("Preço por 100g (R$): ");
            double preco = Double.parseDouble(scanner.nextLine());

            ingredientes.add(new Ingrediente(nome, quantidade, preco));
        }

        System.out.print("\nPreço da embalagem (R$): ");
        double embalagem = Double.parseDouble(scanner.nextLine());

        double custoTotal = embalagem;
        for (Ingrediente ing : ingredientes) {
            custoTotal += ing.calcularCusto();
        }

        System.out.printf("\nCusto total para produzir o ovo de Páscoa: R$ %.2f\n", custoTotal);

        scanner.close();
    }
}
