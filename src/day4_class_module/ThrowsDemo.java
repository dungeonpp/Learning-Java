package day4_class_module;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ThrowsDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter username: ");
		String data = input.next();
		System.out.println("Enter password: ");
		String password = input.next();
		if(data.equals("admin") && password.equals("admin"))
			System.out.println("Welcome User");
		else
			throw new InputMismatchException("Invalid credentials");
		input.close();
		
	}

}
