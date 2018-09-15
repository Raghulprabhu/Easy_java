package Variables;

public class Local {

	/* A variable defined within the method or constructor
	 * The life time of the variable only in the block (method)
	 */
	  void add()

	  {
		  int a=10;
		  int b=20;
		  System.out.println(a+b);
	  }
	  //System.out.println(a+b); cannot print or use outside the method
	
	public static void main(String[] args) {
		
		//add(); cannot call directly without object
		
		Local object = new Local();
		object.add();
		//System.out.println(a); Error
		

	}

}


Output:-

30
