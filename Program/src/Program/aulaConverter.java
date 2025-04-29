package Program;

import java.util.Scanner;

public class aulaConverter {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        
        System.out.println("how many dollars will be  bought? ");
        double amount = sc.nextDouble();
        
        double result = aula.convert(dollarPrice, amount);
        
        System.out.printf("Amount to be  paid  in reais = %.2f%n", result);
        
        sc.close();
        
	}
}
