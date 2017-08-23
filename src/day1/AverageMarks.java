package day1;
import java.util.*;
public class AverageMarks {

	int []marks=new int[5];
	double avgResult=0;
	 public double calculateAverage(){
		for(int i=0; i < 5;i++)
		 avgResult+=this.marks[i];
		avgResult/=5;
		return avgResult;
	}
	public static void main(String [] args){
		
		AverageMarks avgClass = new AverageMarks();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter marks for 5 students: ");
		for(int i=0;i<5;i++)
			avgClass.marks[i]=input.nextInt();
		for(int i=0;i<5;i++)
			System.out.println("values are "+avgClass.marks[i]);
		double result = avgClass.calculateAverage();
		System.out.println("Average Marks for Student are: "+ result);
	}

}
