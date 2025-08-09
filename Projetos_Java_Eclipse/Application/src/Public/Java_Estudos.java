package Public;

import java.util.Locale;
import java.util.Scanner;

import Util.Calculator;
public class Java_Estudos {
    
    public static void main(String [] args) {
    	
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	Calculator calc = new Calculator();
    	
    	
    	System.out.print("Enter radius: ");
    	double radius = sc.nextDouble();
    	
    	double c = calc.circumference(radius);
    	
    	Double v = calc.volume(radius);
    	
    	System.out.printf("circuference: %.2fn", c);
    	System.out.printf("Volue: %.2fn", v);
    	System.out.printf("PI value: %.2fn", calc.PI);
    		
    	sc.close();
    }
     
    
}

