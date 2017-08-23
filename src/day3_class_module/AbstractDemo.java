package day3_class_module;

public class AbstractDemo {
	public static void main(String[] args) {
		Shape s = new Square("Square",4);
		System.out.println("Sahpe type "+s.getType());
		System.out.println("Area "+s.getArea());
		System.out.println("Perimeter "+s.getPerimeter());
	}

}
