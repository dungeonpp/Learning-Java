package day2;
import java.util.*;

public class MarkStatistics {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int number = input.nextInt();
		int[] marksArray = new int[number];
		int sum=0;
		System.out.println("Enter marks Scored by Students: ");
		for(int i=0;i<number;i++)
		{
			marksArray[i]=input.nextInt();
			sum+=marksArray[i];
		}
		double average = sum/number;
		Arrays.sort(marksArray);
		System.out.println("Minimum marks : " + marksArray[0]);
		System.out.println("Maximum marks : " + marksArray[number-1]);
		System.out.println("Average marks : " + average);
		input.close();
		
	}

}
