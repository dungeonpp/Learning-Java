package day2_class_module4.Documents;

public class Account {
	public static int accountCounter=111;
	private String accountID;
	private String accountHolderName;
	
	private String generateAccNo(){
		return "ANO"+accountCounter++;
	}
	
	public Account( String accountHolderName) {
		
		
		this.accountHolderName = accountHolderName;
	}
	public String displayData(){
		return "Account Id "+generateAccNo()+" Account Holder Name "+accountHolderName;
	}
	
	
	
	
	
	
	
	
	
	

}
