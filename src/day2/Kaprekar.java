package day2;

import java.util.Scanner;

class Kaprekar 
{
    static boolean iskaprekar(int n)
    {
        if (n == 1)
           return true;
      
       int sq_n = n * n;
        int count_digits = 0;
        while (sq_n != 0)
        {
            count_digits++;
            sq_n /= 10;
        }
      
        sq_n = n*n; 
        for (int r_digits=1; r_digits<count_digits; r_digits++)
        {
             int eq_parts = (int) Math.pow(10, r_digits);
             if (eq_parts == n)
                continue;
      
             int sum = sq_n/eq_parts + sq_n % eq_parts;
             if (sum == n)
               return true;
        }
              return false;
    }
     

    public static void main (String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter a number: ");
      int number = input.nextInt();
        if(iskaprekar(number)){
        	System.out.println("It is kaprekar number");
        }
        else
        	System.out.println("It isnt");
        
        input.close();
/*         
        for (int i=1; i<10000; i++)
            if (iskaprekar(i))
                 System.out.print(i + " ");*/
    }
    
}