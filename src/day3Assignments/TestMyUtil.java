package day3Assignments;

import java.util.Scanner;

public class TestMyUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MyUtil.throwDice());
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int size = input.nextInt();
		int [] numArray = new int[size];
		for(int i=0;i<size;i++)
			numArray[i] = input.nextInt();
		double result = MyUtil.findAverage(numArray,size);
		System.out.println("avg is : "+result);
		input.close();
	}

}
