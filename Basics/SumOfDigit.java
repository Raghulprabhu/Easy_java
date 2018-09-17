package Basics;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner object = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = object.nextInt();
		
		int rem=0,sum = 0;
		
		while(number>0)
		{
			rem=number%10;
			sum=sum+rem;
			number=number/10;
		}
        System.out.println("The sum of digit is: "+sum);
	}

}


Result:-

Enter any number
1234
The sum of digit is: 10


