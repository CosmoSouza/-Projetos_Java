package Default;

import java.util.Scanner;
public class Java_NumeroNegativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Entrada
		System.out.print("Digite Um Numero?");

		double numero = sc.nextDouble();
		
		//verificacao
		if(numero < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Nao negativo!");
		}
		
		sc.close();
		

	}

}
