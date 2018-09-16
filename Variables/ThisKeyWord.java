package Variables;

public class ThisKeyWord {
	
	  //‘this’ is a reference variable that refers to the current object
	
       static String name="Guhan";
	   int first;
       int second;
       int third=30;
       
       // Purpose of this is for the varible hiding
       
		void  run(int a, int b) // should not use as static method, 
	    {
			
			
				 System.out.println(ThisKeyWord.name);// ClassName.property --->  Guhan
			
	    	ThisKeyWord object = new ThisKeyWord();
	    	
	    	
	    	this.first=a; 
	    	
	    		 System.out.println(this.first); // 10
	    	
			this.third=200;
			
			
                 System.out.println(object.third); //30
	    	
	    	     System.out.println(this.third);//200
			
			object.third=500;
	    	
				System.out.println(object.third); //500
				System.out.println(this.third);  //200
				
		    second=450;
		    System.out.println(second);//450 // local variable
		    System.out.println(this.second);//450 local variable
		    System.out.println(object.second);//0 instance variable
		    
		    int second=550;
		    
		    System.out.println(second);//550   local variable
		    System.out.println(this.second);//450  local variable but not same memory
		    System.out.println(object.second);// 0 instance variable   
		    
		    
   	
	    }
		
		void check()
		{
			System.out.println(this.first);//10
			System.out.println(this.third);//200
			this.third=50;
		}
		
		void test()
		{
			System.out.println(this.third);//50
		}
	    
	    public static void main(String args[])
	    {
	    	
	    	ThisKeyWord object = new ThisKeyWord();
	    	
	    	            object.run(10,20);
	    	            
	    	            object.check();
	    	            
	    	            object.test();
	    	
	    }
	    

}

// References: https://javabeginnerstutorial.com/core-java-tutorial/this-keyword-java/


Output:-

Guhan
10
30
200
500
200
450
450
0
550
450
0
10
200
50
