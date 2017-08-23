package day3Assignments;

public class TestProduct2 {
public static void main(String[] args) {
	Product2 prod1= new Product2();
	prod1.setProductCode("A1234");
	prod1.setProductName("Oil");
	prod1.setProductPrice(123.342);
	
	System.out.println("Product Code : "+ prod1.getProductCode());
	System.out.println("Product Name : "+ prod1.getProductName());
	System.out.println("Product Price : "+ prod1.getProductPrice());
	
}
}
