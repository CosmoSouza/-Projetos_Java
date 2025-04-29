package java_Student;

import java.util.Locale;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
               
			Studeent studeent = new Studeent();
			
			System.out.print("Name: ");
			studeent.name = sc.nextLine();
			
			System.out.print("garde1: ");
			studeent.grade1 = sc.nextDouble();
			
			System.out.print("Grade2: ");
			studeent.grade2 = sc.nextDouble();
			
			System.out.print("Grade3: ");
			studeent.grade3 = sc.nextDouble();
			
			System.out.printf("Final Grade = %.2f%n", studeent.finalGrade());
			
			if (studeent.pass()) {
				System.out.println("Pass");
			}else {
				System.out.println("FAILED");
				System.out.printf("MISSING  %.2f POINTS%n", studeent.missingPoints());
			}
			
			sc.close();
	}

}
