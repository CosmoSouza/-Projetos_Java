package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
 
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Nome? ");
		String nome = sc.nextLine();
		System.out.print("E-mail? ");
		String email = sc.nextLine();
		System.out.println("Birth-Date? ");
		String birthDate = sc.nextLine();
		
		Date date = sdf.parse(birthDate);
		
        Client client = new Client(nome, email, date);
		
        System.out.println("Status do pedido (PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED): ");
        String statusStr = sc.nextLine();
        
        OrderStatus status = OrderStatus.valueOf(statusStr);
        
        Order order = new Order(new Date(), status, client);
        System.out.println(order);
        
        System.out.print("Quantos itens tem esse pedido? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite os dados do item #" + i + ":");
            
            System.out.print("Nome do produto: ");
            String productName = sc.nextLine();

            System.out.print("Preço do produto: ");
            double productPrice = sc.nextDouble();

            System.out.print("Quantidade: ");
            int quantity = sc.nextInt();
            sc.nextLine(); 

            Product product = new Product(productName, productPrice);
            OrderItem item = new OrderItem(quantity, productPrice, product);
            
            order.addItem(item);
        }
        System.out.println();
        System.out.println("RESUMO DO PEDIDO:");
        System.out.println(order);


		
		sc.close();
		
		
	}

}
