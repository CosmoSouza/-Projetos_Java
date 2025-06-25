package course;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Usuario:  ");
		String usuario = sc.nextLine();
		
		System.out.println();
		System.out.println("Senha: ");
		String senha = sc.nextLine();
		
		if (usuario.equalsIgnoreCase("Admin") && senha.equals("12345")) {
			System.out.println("Acesso Permitido");
		} else {
			
			System.out.println("Usuario ou senha invalidos");
		}

	}

}
