package day2;

import java.util.Scanner;

public class PTDrill {
public static void main(String[] args) {
	int numberOfStudents=0,rows,columns;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number of students: ");
	numberOfStudents = input.nextInt();
	rows = columns = (int) Math.sqrt(numberOfStudents);
	System.out.println(rows + " "+ columns);
	String[][] students = new String[rows][columns];
	System.out.println("Enter names of Students: ");
	for(int i=0;i<rows;i++){
		for(int j=0;j<columns;j++){
			System.out.print( i+ " " + j + " : ");
			students[i][j] = input.next();
		}
	}
	System.out.println("Standing sequence is : ");
	for(int i=0;i<rows;i++){
		System.out.println("");
		for(int j=0;j<columns;j++){
			System.out.print(students[i][j] + " | ");
		}
	}
	System.out.println(" ");
	int forRows = rows/2;
	int forColumns = columns/2;
	if(rows%2==0)
		System.out.println("Input condition is not satisfied");
	else
	{
		System.out.println("Students in the middle row are: ");
			for(int k=0;k<columns;k++){
				System.out.print(students[forRows][k]+ " "); 
			}
			
		System.out.println("Students in the middle column are: ");
			for(int l=0;l<rows;l++){
				System.out.print(students[l][forColumns]+ " "); 
			}	
	}
	input.close();
  }
}
