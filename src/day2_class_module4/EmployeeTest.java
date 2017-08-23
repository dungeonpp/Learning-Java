package day2_class_module4;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Dave","Dave@gmail.com",3245.34);
		Employee emp2 = new Employee("Mario","Mario@gmail.com",3245.34);
		Employee[] emp = {emp1,emp2};
		displayData(emp);
		
		
	}

	private static void displayData(Employee[] emp) {
		for (Employee employee : emp) {
			System.out.println(employee.formatDetails());
		}
		
	}
	
}
