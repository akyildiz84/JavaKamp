package oopIntro;

public class Product {
	//
	public Product() {
		System.out.println("Ben �al��t�m");
	}
	//constructor yap�c�
	
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
	
	
	//class lar ikiye ayr�l�r. i� yapan, �zellik tutan
	
	
}
