package Datatypes;

public class TestEnum1 {

	public static void main(String[] args) {
		
	    Month m = Month.January; 
	    switch(m)
		{
		case January:
			System.out.println(m);
		break;
		}

	    for (Month m1:m.values() )
	    {
	    	 System.out.println(m1);
	    }
		
	}

}

#Need to refer 1. Enum methods, Enum abstract, Enum Interface, EnumSet, EnumMap


Result:-

January

January
February
March
April
May
June
July
August
September
