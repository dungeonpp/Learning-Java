package day3_class_module;

abstract public class Shape {
	private String type;

	public Shape(String type) {
		super();
		this.type = type;
	}
	//concrete method
	public String getType(){
		return type;
	}
	//abstract method
	abstract  double getArea();
	abstract double getPerimeter();
	
	
	
	
	
	
	
	
	
	
	
}
