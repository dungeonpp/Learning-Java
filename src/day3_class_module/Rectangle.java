package day3_class_module;

public class Rectangle extends Shape {
	private int length;
	//private int height;
	public Rectangle(String type, int length) {
		super(type);
		this.length = length;
		
	}
	@Override
	double getArea() {
		
		return length*length;
	}
	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 4*(length);
	}
	


}
