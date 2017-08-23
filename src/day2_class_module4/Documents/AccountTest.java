package day2_class_module4.Documents;

public class AccountTest {
	public static void main(String[] args) {
		SBAccount sba = new SBAccount("dave",342);
		System.out.println(sba.displayData());
		sba.depositAmount(1000);
		System.out.println(sba.displayData());
		
		SBAccount sba1 = new SBAccount("ravan",942);
		System.out.println(sba1.displayData());
		sba1.depositAmount(1000);
		System.out.println(sba1.displayData());
		
		
	}

}
