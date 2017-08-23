package day2_class_module4.Documents;

public class SBAccount extends Account{
	private int accBalance;

	public SBAccount(String name,int accBalance) {
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
	
	public String displayData(){
		return super.displayData()+" Balance "+accBalance;
	}
	
	
	

}
