package Ex6;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
			//entrada de dados
			Scanner leitor = new Scanner(System.in);
			System.out.println("Digite o valor para A:");
		    double A = leitor.nextDouble();
		    
		    System.out.println("Digite o valor para B:");
		    double B = leitor.nextDouble();
		    
		    System.out.println("Digite o valor para C:");
		    double C = leitor.nextDouble();
		    
		    //fim de entrada de dados
		    
		    //calculo
		    double pi = 3.14159;
		    
		    //a) a área do triângulo retângulo que tem A por base e C por altura.
		    double triangulo = (A * C) / 2;
		    
		    //b) a área do círculo de raio C. (pi = 3.14159) 
		    double Circulo = (C * pi );
		    
		    //c) a área do trapézio que tem A e B por bases e C por altura. 
		     double Trapezio = (A + B) * C;
		     
		     //d) a área do quadrado que tem lado B.  
		     double Quadrado = (B * B);
		     
		     //e) a área do retângulo que tem lados A e B. 
		     double Retangulo = (A * B);
		     //fim calculo 
		     
		     //saida de dados
		     System.out.printf("Triangulo e: %.10f%n ", triangulo);
		     System.out.printf("Circulo e: %.10f%n ", Circulo);
		     System.out.printf("Trapezio e: %.10f%n ", Trapezio);
		     System.out.printf("Quadrado e: %.10f%n ", Quadrado);
		     System.out.printf("Retangulo e: %.10f%n ", Retangulo);
		    
		    //fim saida de dados

	}

}
