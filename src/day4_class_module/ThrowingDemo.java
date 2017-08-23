package day4_class_module;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ThrowingDemo {
public static void main(String[] args) {
	ThrowingDemo demo = new ThrowingDemo();
	Scanner input = new Scanner(System.in);
	System.out.println("Enter data");
	String data  = input.next();
	try{
		demo.methodA(data);
	}
	catch (ParseException e)
	{
		e.printStackTrace();
	}
}
void methodA(String data) throws ParseException{
	methodB(data);
}
void methodB(String data) throws ParseException{
	methodC(data);
}
void methodC(String data) throws ParseException{
	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	Date date =  format.parse(data);
	System.out.println(date);
	
	}
}


