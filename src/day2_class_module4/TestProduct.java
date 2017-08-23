package day2_class_module4;

public class TestProduct {
public static void main(String[] args) {
		Product prod1 = new Product();
		prod1.setProductCode("P101");
		prod1.setProductName("Laptop");
		prod1.setProductPrice(45000.00);
		
		System.out.println("Product Code: " + prod1.getProductCode());
		System.out.println("Product Name: "+ prod1.getProductName());
		System.out.println("Product Price: "+ prod1.getProductPrice());
		
}
}
