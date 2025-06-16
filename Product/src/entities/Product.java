package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	private int totalQuantity;
	private double totalPrice;
	
	public Product() {
    }
	
	public double totalValueInStock() {
		this.setTotalPrice(this.getTotalQuantity()*this.getPrice());
		System.out.println("A quantidade atualizada de produtos desse tipo em estoque é: "+this.getTotalQuantity());
		System.out.printf("O valor dos produtos desse tipo em estoque é: %.2f\n",this.getTotalPrice());
		System.out.println("The current quantity of products of this type in stock is: "+this.getTotalQuantity());
		System.out.printf("The value of products of this type in stock is: %.2f\n ",this.getTotalPrice());
		return(this.totalPrice);
	}
	public void addProducts() {
		this.setTotalQuantity(this.getTotalQuantity()+this.getQuantity());
		System.out.println("A quantidade atualizada de produtos desse tipo em estoque é: "+this.getTotalQuantity());
		System.out.println("The current quantity of products of this type in stock is: "+this.getTotalQuantity());
	}
	public void removeProducts() {
		this.setTotalQuantity(this.getTotalQuantity()-this.getQuantity());
		System.out.println("A quantidade atualizada de produtos desse tipo em estoque é: "+this.getTotalQuantity());
		System.out.println("The current quantity of products of this type in stock is: "+this.getTotalQuantity());
	}
	/*To String*/
	public String toString() {
		return name
				+", $ "
				+String.format("%.2f",price)
				+", "
				+quantity
				+" units, Total: $ "
				+String.format("%.2f",totalValueInStock())
				;
	}
	
	/*Getters e Setters*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
}
