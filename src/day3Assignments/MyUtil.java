package day3Assignments;

public class MyUtil {
	static int randomNumber=100;
	static int throwDice(){
		do{
		randomNumber = (int) (10*Math.random());}while(randomNumber>0 && randomNumber>6);
		return randomNumber;
		}
	static double findAverage(int[] array,int size){
		int sum=0;
		for(int i=0;i<size;i++)
			sum+=array[i];
		double average = sum/size;
		
		return average;
	}
		
}
