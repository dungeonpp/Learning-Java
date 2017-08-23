package day5_assiignments;
import java.util.*;
public class ExceptionTest {
public static void main(String[] args) {
	NullPointerException npe = new NullPointerException("no input recieved");
	try{
	if(args.length==0)
		throw npe;
	else
		{
		int num1= Integer.parseInt(args[0]);
		int num2= Integer.parseInt(args[1]);
		double result = num1/num2;
		System.out.println("result is : " + result);
		}
	}
	catch(NumberFormatException nfe){
		System.out.println("Only Integers Allowed");
	}
	catch(ArithmeticException ae){
		System.out.println("Divide by 0 is not allowed");
	}
	catch(Exception e)
	{System.out.println(e);
	}
	
	
}
}
