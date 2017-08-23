package day3Assignments;

public class TestMyUtil2 {
public static void main(String[] args) {
	System.out.println(MyUtil.throwDice());
	
	double result = Averager.avg(23,45);
	double result1 = Averager.avg(234.34543, 12344.456222);
	double result2 = Averager.avg(12,23,54);
	
	System.out.println(result+" "+result1+" "+result2);
	
	double max = Math.max(123.34, 345.12454);
	double min = Math.min(2345.123454231,123.345423231);
	
	System.out.println(max + " " + min);
	
	double ceil = Math.ceil(1234.5432);
	double floor = Math.floor(123.435324342);
	double round = Math.round(145.4657);
	
	System.out.println(ceil+" "+floor+" "+round);
}
}
