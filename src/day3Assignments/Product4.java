package day3Assignments;

public class Product4 {
	private String productCode;
	private String productName;
	private double productPrice;
	private char categoryCode;
	private static int prodCounter=100;
	
	private String genertateProductCode(){
		productCode = productCode + categoryCode + prodCounter++;  
		return productCode;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public char getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(char categoryCode) {
		this.categoryCode = categoryCode;
	}

}
