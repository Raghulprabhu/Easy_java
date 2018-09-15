package Variables;

public class StaticVariable {
    /* Static variable is class variable
     * similar to instance variable(outside the method)
     */
	       int b=500; // Instance variable
	static int a=100; //Static variable
	
	public static void main(String[] args) {
		
		System.out.println(a);
		
		//System.out.println(b); // cannot use instance variable without object
		
		StaticVariable.a=200;
		
		System.out.println(a);
		
		StaticVariable object = new StaticVariable();
		System.out.println(object.a);
		System.out.println(object.b);
	}

}

Output:-

100
200
200
500
