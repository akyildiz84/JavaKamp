package oopIntro;

public class Product {
	//
	public Product() {
		System.out.println("Ben çalýþtým");
	}
	//constructor yapýcý
	
	public Product(int id, String name, double unitPrice, String detail) {
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
	
	//class lar ikiye ayrýlýr. iþ yapan, özellik tutan
	
	
}
