package com.product;
import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		Product product = new Product();
		
		int select;
		
		do {
			System.out.println("Menu:");
			System.out.println("Enter the number of the operation you wish to perform:");
			System.out.println("Digite o número da operação que deseja realizar:");
			System.out.println("1. Register Product");
			System.out.println("2. Remove Product");
			System.out.println("3. Consult Stock");
			System.out.println("4. Update Stock");
			System.out.println("5. Exit");
			select = scanner.nextInt();
			scanner.nextLine(); // Limpa o buffer após nextInt
			
			switch(select) {
				case 1: 
					System.out.println("Enter product data:");
					System.out.println("Entre com os dados do produto:");
					System.out.print("Name:");
					product.setName(scanner.nextLine());
					System.out.print("Price:");
					product.setPrice(scanner.nextDouble());
					System.out.print("Quantity in stock:");
					product.setQuantity(scanner.nextInt());
					product.addProducts();
					break;
				case 2: 
					System.out.print("Enter the number of products to be removed in stock:");
					System.out.print("Entre com o número de produtos a serem removidos do estoque:");
					product.setQuantity(scanner.nextInt());
					product.removeProducts();
					break;
				case 3: 
					product.totalValueInStock();
					break;
				case 4:
					product.removeProducts();
					System.out.println("Enter product data:");
					System.out.println("Entre com os dados do produto:");
					System.out.print("Name:");
					product.setName(scanner.nextLine());
					System.out.print("Price:");
					product.setPrice(scanner.nextDouble());
					System.out.print("Quantity in stock:");
					product.setQuantity(scanner.nextInt());
					product.addProducts();
					break;
				case 5:
					System.out.println("Programa Finalizado...");
					System.out.println("Program closed...");
					break;
				default: 
					System.out.println("Please review the value entered and try again.");
					System.out.println("Accepted values ​​1, 2 or 3...");
					System.out.println("Revise o valor informado e tente novamente");
					System.out.println("Valores aceitos 1, 2 ou 3...");
					break;
			}
		}while(select != 5);
		scanner.close();
	}
}
