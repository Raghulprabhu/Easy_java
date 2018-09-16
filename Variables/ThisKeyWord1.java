package Variables;

public class ThisKeyWord1 {
	
	String test()
	{
		
		return "testing";
	}
	void check()
	{
		String x = this.test();// used as a method calling
		System.out.println(x);
	}

	public static void main(String[] args) {
		
       ThisKeyWord1 object = new ThisKeyWord1();
                    object.check();                     
 
	}

}

Output:

testing
