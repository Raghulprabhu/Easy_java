package Variables;

public class Instance {

/*  Instance variable is a non-static variable
 *  declared only outsite the class not inside the method
 */
	int a=1;
	private int b;
	public int c;
    public String name;
    
    
}

class Checking
{
    
	public static void main(String[] args) {
		
		//we cannot get any output bcz there is no main method above class 

		Instance Object = new Instance();
		         Object.a=10;
		         //Object.b=20; cannot use
		         Object.c=30;
		         Object.name="Anbu";
		         System.out.println(Object.name); 
		         //System.out.println(a); cannot use
		         //System.out.println(name); cannot use if u assign a static variable
		}
}

Output:-

     Cannot get output bcz no main method in Instance class
