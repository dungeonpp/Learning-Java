package day4_class_module;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter data: ");
		String data = input.next();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try{
			Date date = format.parse(data);
			System.out.println(data);
			try{String s = null;System.out.println(s.length());}
			catch(NullPointerException npe){System.out.println(npe);}
		}
		catch(ParseException e){
			//System.out.println(e);
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
	}

}
