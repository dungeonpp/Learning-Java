package day2;

import java.util.Scanner;

public class Accomodation {
	private int classOne,classTwo,classThree,requirement;

	public int getRequirement() {
		return requirement;
	}

	public void setRequirement(int requirement) {
		this.requirement = requirement;
	}

	public int getClassOne() {
		return classOne;
	}

	public void setClassOne(int classOne) {
		this.classOne = classOne;
	}

	public int getClassTwo() {
		return classTwo;
	}

	public void setClassTwo(int classTwo) {
		this.classTwo = classTwo;
	}

	public int getClassThree() {
		return classThree;
	}

	public void setClassThree(int classThree) {
		this.classThree = classThree;
	}
	
	public String calculateAccomodation(){
		boolean firstAvailable,secondAvailable,thirdAvailable;
		int count=0;
		if(this.classOne>= this.requirement)
			{firstAvailable = true;
			count++;}
		if(this.classTwo>= this.requirement)
			{secondAvailable = true;count++;}
		if(this.classThree>= this.requirement)
			{thirdAvailable = true;count++;}
		
		return count + " number of lab(s) can accomodate "+ this.requirement + " number of students.";
		
	}
	
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		Accomodation acc = new Accomodation();
		int c1,c2,c3,studs;
		System.out.println("Enter C1 capacity");
		c1 = input.nextInt() ;
		acc.classOne=c1;
		
		System.out.println("Enter C2 capacity");
		c2 = input.nextInt() ;
		acc.classTwo=c2;
		
		System.out.println("Enter C3 capacity");
		c3 = input.nextInt() ;
		acc.classThree=c3;
		
		System.out.println("Enter Number of students : ");
		studs = input.nextInt();
		acc.requirement = studs;
		
		String res = acc.calculateAccomodation();
		System.out.println(res);
		input.close();
	}

}
