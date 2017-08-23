package day3_class_module;

class Animal{
	
}
class Dog extends Animal{
	public void walk(){}
}
class Bird extends Animal{
	public void fly(){}
}
public class CastingDemo {
	public static void main(String[] args) {
		Animal obj1 = new Dog();
		if(obj1 instanceof Bird){
		Bird d = (Bird)obj1;
		}
		System.out.println("test");
	}

}
