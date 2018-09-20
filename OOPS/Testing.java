
1. Who call main method?

package DataVariables;

public class Testing {
	
	
	public static void main(String[] args) {
		
        
		System.out.println("Java");  //Java --> JVM Calls
		

	}

}


2. How to call a method without object?

package DataVariables;

public class Testing {
	
	static void add()  //method
	{
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		
        
		add();// we can not call without static
		
	}
}


3. How to call method with object?

package DataVariables;

public class Testing {
	
	 void add() // dont use static here
	{
		//local variables
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	 
	void sub()
	{
		//Local variables
		int a=10;
		int b=20;
		System.out.println(a-b);
		
	}
	public static void main(String[] args) {
		
        
		// We have to create object
		
		Testing object1 = new Testing();
		Testing object2 = new Testing();
		
		         object1.add();
		         object1.sub();
		         object2.add();
		         object2.sub();
		
	}
  
}

4. How to create object using constructor?

public class Testing {
	
	
	Testing()//constructor, no need 
	{
		
		System.out.println("Welcome to Java!!!");
	}
	
	public void add()
	{
		System.out.println("I am add method");
	}
	
	public static void main(String[] args) {
		
     
          Testing object1 = new Testing();
                  object1.add();
		
	}
}
   Output:
           Welcome to Java!!!
           I am add method

   

5. Why we are using class name for creating object?


package DataVariables;

public class MyClass extends Testing {
	
	  public void test()
	   {
		   System.out.println("Hi dear");
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Testing obj1 = new Testing(); //parent only class parent class methods
		
		MyClass obj2 = new MyClass(); // child can access own class and parent class
		
		       obj2.test();
		       obj2.add();
		       obj1.add();
   }
}







