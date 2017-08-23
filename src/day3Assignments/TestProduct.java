package day3Assignments;

public class TestProduct {
public static void main(String[] args) {
	Product prod1= new Product();
	prod1.productCode="A1234";
	prod1.productName="Oil";
	prod1.productPrice=123.342;
	
	System.out.println("Product Code : "+ prod1.productCode);
	System.out.println("Product Name : "+ prod1.productName);
	System.out.println("Product Price : "+ prod1.productPrice);
	
}
}
