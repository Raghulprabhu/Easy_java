package Variables;

public class StaticMethod {
	
	/* The program compiled successfully, but main class was not found. 
	 * Main class should contain method: public static void main (String[] args).
	 * Servlets and applets do not require main method for their execution. 
	 * Yes their is a way to run a JAVA program without the main method. */
	
	  static int add(int a, int b)
	  {
		  return a+b;
	  }
	  
	  int sub(int a, int b)
	  {
		  return a-b;
	  }
	  
	  static void check()
	  {
		 StaticMethod object = new StaticMethod();
		              int output = object.sub(20, 10);
		              System.out.println(output);
		              
	  }

	public static void main(String[] args) {
		
		int addition = add(10,20);
		
		System.out.println(addition);
		
		//int subtraction = sub(20,10); cannot call non static method, so create object to call sub() refer check() method
		
		check();
	}

}


Result:-

30
10
