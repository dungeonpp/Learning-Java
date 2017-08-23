package day2_class_module4.Documents;

public class FDAccount extends Account{
	private int accBalance = 1000;

	public FDAccount(String name,int accBalance) {
		super(name);
		this.accBalance = accBalance;
	}
	
	public void depositAmount(int amount){
		accBalance+=amount;
	}	
	
	
	public String withDraw(int withDrawAmount){
		int minBalance = 500;
		if((accBalance-=withDrawAmount)>=500){
			accBalance-=withDrawAmount;
			return "Transaction Successful";
		}
		return "Balance is low";
				
	}
	
	public int calculateInterest(){
	/*	int interest  =
		this.accBalance*/
		
		return 20;
	}
	
	public String displayData(){
		return super.displayData()+" Balance "+accBalance;
	}
	
public static void main(String[] args) {
	
}
}
