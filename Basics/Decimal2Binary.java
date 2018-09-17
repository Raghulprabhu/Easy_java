package Basics;
import java.util.Scanner;

public class Decimal2Binary {
	
	public  void convertBinary(int num){
	     int binary[] = new int[40];
	     int index = 0;
	     while(num > 0){
	       binary[index++] = num%2;
	       num = num/2;
	     }
	     for(int i = index-1;i >= 0;i--){
	       System.out.print(binary[i]);
	     }
	  }
	 
	  public static void main(String a[]){
		 Decimal2Binary obj = new Decimal2Binary();
		 Scanner object = new Scanner(System.in);
		 
		 System.out.println("Enter any Decimal value");
		 int number = object.nextInt();
		 
		  obj.convertBinary(number);
	  }
    
}

Result:-

Enter any Decimal value
13
1101

