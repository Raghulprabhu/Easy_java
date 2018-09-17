package Datatypes;

public class TestEnum
{
    public static void main(String[] args)
    {
    	Month m1,m2; //Datatypes.Month
    	
    	m1=Month.January;
    	m2=Month.April;
    	
    	Month obj = Month.valueOf("April");
    	
    	System.out.println(obj.toString());
    	
    	System.out.println(m1+" "+m2);
    	
    	System.out.println(m1.ordinal());
    	
    	System.out.println(m2.ordinal());
    	
    	System.out.println(m1.compareTo(m2));
    	
    	System.out.println(m1.name());
    	
    	System.out.println(m1.toString());
    	
    	
    	
    	System.out.println("Comparing the Objects");
    	
    	if(m1.equals(m2))
    	{
    		System.out.println(m1+" equals "+m2);
    	}
    	else
    	{
    		System.out.println("Not equal");
    	}
    	
    }
	
}

Output:-

April
January April
0
3
-3
January
January
Comparing the Objects
Not equal
