package Program;

public class aula {
	
	public static double IOF = 0.06;
	
	public static double convert(double dollarPrice, double amount) {
		double totalWithoutTax = dollarPrice * amount;
		double tax = totalWithoutTax * IOF;
		return totalWithoutTax + tax;
	}

}
