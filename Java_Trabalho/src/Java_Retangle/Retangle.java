package Java_Retangle;
import java.util.Locale;
import java.util.Scanner;

public class Retangle {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);	
    Scanner sc = new Scanner (System.in);
    
    Rectangle rect = new Rectangle();
    
    
    System.out.print("Enter rectangle width: ");
    rect.width = sc.nextDouble();
    
    System.out.print("Enter rectangle height: ");
    rect.height = sc.nextDouble();
    
    System.out.printf("Area = %.2f%n", rect.Area());
    System.out.printf("Perimeter = %.2f%n", rect.Perimeter());
    System.out.printf("DIAGONAL = %.2f%n", rect.Diagonal());
    sc.close();
	}

}
