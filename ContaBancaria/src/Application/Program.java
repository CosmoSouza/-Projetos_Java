package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero da conta: ");
		int number = sc.nextInt();
		sc.nextLine(); //consumir quebra de linha
		
		System.out.print("Titular: ");
		String holder = sc.nextLine();
		
		System.out.print("Saldo inicial: ");
		double balance = sc.nextDouble();
		
		System.out.print("Limite de saque: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.print("Valor para saque: ");
		double amount = sc.nextDouble();
		
		try {
			acc.withdraw(amount);
			System.out.printf("Novo saldo: %.2f\n", acc.getBalance());
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
