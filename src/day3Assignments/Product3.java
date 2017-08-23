package day3Assignments;

public class Product3 {
	private String productCode;
	private String productName;
	private double productPrice;

	Product3(String prodCode,String prodName,double prodPrice){
		this.productCode = prodCode;
		this.productName = prodName;
		this.productPrice = prodPrice;
			
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public void displayProductDetails(Product3 prod)
	{
		System.out.println("Product Code : "+prod.productCode);
		System.out.println("Product Name : "+prod.productName);
		System.out.println("Product price : "+prod.productPrice);
	}

}
