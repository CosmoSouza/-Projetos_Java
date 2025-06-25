package course;

import java.util.Locale;
import java.util.Scanner;

public class entities {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
      
        System.out.println();
        System.out.println("Digite 1 um numero: ");
        double numero = sc.nextDouble();
        
        System.out.println("Voce Digitou: " + numero);
        
        sc.close();
	}

}
