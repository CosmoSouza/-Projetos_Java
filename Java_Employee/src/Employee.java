import java.util.Scanner;
import java.util.Locale;

public class Employee {



	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
    
		Employe emp = new Employe();
		
		System.out.println("Name: ");
		emp.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f%n", emp.name, emp.NetSalary());
		
		System.out.print("With percentage to increase Salary? ");
		double percentage = sc.nextDouble();
		emp.IncreaseSalary(percentage);
		
		System.out.printf("Updated data: %s, $ %.2f%n", emp.name, emp.NetSalary());
		
		sc.close();
		
	}
}
	
