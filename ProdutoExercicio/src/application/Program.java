package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Produto;

public class Program {
    public static void main(String[] args) {
        
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        Produto produto = new Produto(nome, preco);

        System.out.println("\nProduto cadastrado:");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: R$" + produto.getPreco());

        sc.close();
    }
}
