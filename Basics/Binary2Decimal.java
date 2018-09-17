package Basics;
import java.util.Scanner;

public class Binary2Decimal {

	public static void main(String[] args) {
		
		Scanner object = new Scanner(System.in);
		System.out.println("Enter any binary value");
		int number = object.nextInt();
		
		int rem=0,count=0;
		double sum = 0;
		
		while(number>0)
		{
			rem=number%10;
			sum=sum+rem*Math.pow(2, count);
			number=number/10;
			count++;
		}
        System.out.println("The sum of digit is: "+sum);
	}

}


Result:-

Enter any binary value
1110
The sum of digit is: 14.0

