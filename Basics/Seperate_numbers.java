package Basics;

public class SeparateNumbers {

	public static void main(String[] args) {

		int a[] = new int[10];
		int b[] = new int[10];
		
		int number=1;
		int indexA=0;
		int indexB=0;
		while(number<=20)
		{
			if(number%2==0)
			{
				a[indexA++]=number;
			}
			if(number%2==1)
			{
				b[indexB++]=number;
			}
			number++;
		}
		
		System.out.println("The even numbers are: ");
		for(int i=0; i<a.length-1;i++)
		{
			
			System.out.println(a[i]);
		}
		System.out.println("The odd numbers are: ");
		for(int j=0; j<b.length-1;j++)
		{
			System.out.println(b[j]);
		}
		

	}

}

Result:-

The even numbers are: 
2
4
6
8
10
12
14
16
18
The odd numbers are: 
1
3
5
7
9
11
13
15
17
