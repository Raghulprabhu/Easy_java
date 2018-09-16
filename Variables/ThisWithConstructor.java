package Variables;

public class ThisWithConstructor {
	
	ThisWithConstructor()
	{
		this("Ganesan");
		System.out.println("Hi Guhan");
		
		
	}
	
	ThisWithConstructor(String name)
	{
		System.out.println(name);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisWithConstructor object = new ThisWithConstructor();
		
		
		//ThisWithConstructor object = new ThisWithConstructor("Anbu"); // output only "Anbu"
		
		

	}

}


Output:-

Ganesan
Hi Guhan


