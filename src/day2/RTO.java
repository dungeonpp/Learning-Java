package day2;

import java.util.Scanner;

public class RTO {
	
	private int lowerBound;
	private int upperBound;
	
	public int getLowerBound() {
		return lowerBound;
	}

	public void setLowerBound (int lowerBound) {
		if(lowerBound > 1000 && lowerBound < 10000)
			this.lowerBound = lowerBound;
		System.out.println(this.lowerBound);
	}
	public int getUpperBound() {
		return upperBound;
	}

	public void setUpperBound(int upperBound) {
		if(upperBound > 1000 && upperBound < 10000)
			this.upperBound = upperBound;
		System.out.println(this.upperBound);
		}
	
	public int[] provideOptions(int range1, int range2){
		int range[]={0};
	
		int num = range1;
		int [] numArr = new int[4];
		int sum =0;
	do{
		String number = String.valueOf(num);
		for(int i = 0; i < number.length(); i++) {
		    int j = Character.digit(number.charAt(i), 10);
		     numArr[i]=j;
		}
		sum = numArr[0]+numArr[1]+numArr[2]+numArr[3];
		}while(sum!=9);
		return numArr;
		
	}

	public static void main(String[] args) {
		int lb=0,ub=0;
		Scanner input = new Scanner(System.in);
		RTO rto = new RTO();
		System.out.println("Enter lower bound");
		lb = input.nextInt();
		rto.setLowerBound(lb);
		
		System.out.println("Enter upper bound");
		ub = input.nextInt();
		rto.setUpperBound(ub);
		
		int[] resArr = {0,0};
		resArr= rto.provideOptions(lb,ub);

		
	}

}
