package day2_class_module4;

public class Employee {
	private String empId;
	private String empName;
	private String email;
	private double salary;
	public static int counter=111;
	/*Employee(){
		System.out.println("Default Constrcutor");
	}*/
	Employee(String empName,String email,double salary){
		this.empId=generateEmpId();
		this.empName = empName;
		this.salary = salary;
		this.email = email;
		
	}
	public String generateEmpId(){
		return "ATOS"+counter++;
	}
	
	public void setEmpId(String empId){
		this.empId=empId;
	}
	public String getEmpId(){
		return generateEmpId();
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String formatDetails(){
		return "Emp Id "+empId+" Emp Name "+empName+" salary "+salary+" email "+email;
	}
	


}
