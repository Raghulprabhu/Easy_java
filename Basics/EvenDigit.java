package Basics;
import java.util.Scanner;

public class EvenDigit {

	public static void main(String[] args) {
		
		Scanner object = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = object.nextInt();
		
		int rem=0,sum = 0;
		
		while(number>0)
		{
			rem=number%10;
			if(rem%2==0)
			{
			  sum=sum+rem;
			}
			number=number/10;
		}
        System.out.println("The sum of even digit is: "+sum);
	}

}


Result:-

Enter any number
125463
The sum of even digit is: 12

