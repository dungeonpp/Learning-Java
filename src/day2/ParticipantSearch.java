package day2;

import java.util.Arrays;
import java.util.Scanner;

public class ParticipantSearch {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number of Employees : ");
	int numberOfEmployees = 0;
	numberOfEmployees = input.nextInt();
	int [] employeeId = new int [numberOfEmployees];
	System.out.println("Enter ids'");
	for(int i = 0;i<numberOfEmployees;i++)
		employeeId[i] = input.nextInt();
	Arrays.sort(employeeId);
	System.out.println("Enter id to be searched: ");
	int key = input.nextInt(); 
	int found = Arrays.binarySearch(employeeId, key);
	if(found!=0)
		System.out.println(" Participant with ID "+ key + "exists");
	else
		System.out.println(" Participant with ID "+ key + " doesn't exists");
	
	input.close();
}	
}
