package day2;

public class CricketRunRate {
	private int oversBowled;
	public int getOversBowled() {
		return oversBowled;
	}
	public void setOversBowled(int oversBowled) {
		this.oversBowled = oversBowled;
	}
	public int getTargetScore() {
		return targetScore;
	}
	public void setTargetScore(int targetScore) {
		this.targetScore = targetScore;
	}
	public double getCurrentRunRate() {
		return currentRunRate;
	}
	public void setCurrentRunRate(double currentRunRate) {
		this.currentRunRate = currentRunRate;
	}
	public double getRequiredRunRate() {
		return requiredRunRate;
	}
	public void setRequiredRunRate(double requiredRunRate) {
		this.requiredRunRate = requiredRunRate;
	}
	private int targetScore;
	private double currentRunRate;
	private double requiredRunRate;
	
	public double calculateRequiredRunRate(){
		int oversLeft = 50 - oversBowled;
		this.requiredRunRate = ((this.targetScore - this.currentRunRate * this.oversBowled)/oversLeft); 
		return this.requiredRunRate;
		
	}
	public static void main(String[] args) {
		CricketRunRate crr = new CricketRunRate();
		crr.currentRunRate=4.2;
		crr.oversBowled = 10;
		crr.targetScore = 250;
		double result = crr.calculateRequiredRunRate();
		System.out.println("req run rate : " + result);
	}
}
