package String;

public class String1 {
	
	

	public static void main(String[] args) {
	
		String str="Guhan Ganesan"; //sequence of characters
		
		// String to charcter array
		char[] chars = str.toCharArray();
		for(int i=0; i<chars.length; i++)
		{
			System.out.println(chars[i]);
		}
		
		
		// Fetch char
		 char m = str.charAt(2);
		 System.out.println(m);
		 
		 //Get charcaters
		 
		 char[] chars1 = new char[6];
		 
		 str.getChars(1,7,chars1,0);
		 System.out.println(chars1);
		 
		 
		 //Sub String
		 String sub = str.substring(2);//uhan G
		 System.out.println(sub);//han Ganesan
		 
		 String sub1 = str.substring(2,8);
		 System.out.println(sub1);//han Ga
		 
		 //Compare to other object
		 		 
		 String str1 = new String("Guhan");
		 System.out.println(str1);//Guhan
		 if(str==str1)
		 {
			 System.out.println("true");
		 }
		 else
		 {
			 System.out.println("False");//False
		 }
		 
		 System.out.println(str.compareTo(str1));//8
		 
		 String s1 = "abcd";
		 String s2 = "abcd";
		 System.out.println(s1==s2);//true
		 
		 String s3="Guhan";
		 String s4=new String("Guhan");
		 System.out.println(s3==s4);//false
		 System.out.println(s4);//Guhan
		 
		 //To ignore case
		 
		 String s5 ="he is my dear friend";
		 String s6="he is my dear friend";
		 System.out.println(s5.compareToIgnoreCase(s6));//0
		 System.out.println(s5.contentEquals(s6));//true
		 
		 // Concatenate
		 String s7=s6.concat("guhan");
		 System.out.println(s7);//he is my dear friendguhan
		 
		 // Character array to string
		 
		 char[] s8 = {'g','u','h','a','n',' ','a','n','b','u'};
		 String s9="";
		 String s10=s9.copyValueOf(s8);
		 System.out.println(s10);//guhan anbu
		 
		 String s11="";
		        s11=s11.copyValueOf(s8, 2, 6);
		 System.out.println(s11);//han an
		 
		 //Check the end side
		 
		 System.out.println(s5.endsWith("friend"));//true
		 System.out.println(s5.endsWith("friends"));//false
		 
		 //Check equals or not
		 
		 char s12='g';
		 char s13='g';
		 System.out.println(s12==s13);//true
		 
		 String s14="Guhan";
		 String s15="Guhan";
		 System.out.println(s14==s15);//true
         System.out.println(s14.equals(s15));//true
         
         //Equal ignoore case
         
         String s16 = new String("hi dear friend");
         String s17 = new String("hi dear friend");
         
         System.out.println(s16==s17); //false
         System.out.println(s16.equals(s17));//true
         
         // Find the index value
         // Syntax: indexOf(int ch, int fromIndex)
         
         System.out.println(s16.indexOf('e',7));//11
         
         // Check sub string index
         
         System.out.println(s16.indexOf("dear"));//3
         
         //Intern in String 
         
         String s18 =new String("Guhan");
         String s19 =new String("Guhan");
         System.out.println(s18.intern());//Guhan
         System.out.println(s18.intern()==s19.intern());//true
         
         //Check from last side
         
         System.out.println(s16.lastIndexOf("dear"));//3
         System.out.println(s16.lastIndexOf('d'));//13
         
         //Match (mostly for regular expression)
         
         System.out.println(s16.matches(s17));//true
         
         // Replace
         
         String s20 = "Guhan";
                s20 =s20.replace('h','k');
         System.out.println(s20);//Gukan
         
         String s21="Guhan Ganesan";
                s21=s21.replace("Ganesan", "Anbu");
         System.out.println(s21);//Guhan Anbu
        
         
         //Split
         
         String s22="He-is-my-dear-friend";
         
         for(String retval: s22.split("-"))
         {
        	 System.out.println(retval);
         }
         
         /* He 
          * is
          * my
          * dear
          * friend
          */
         
         for(String retval: s22.split("-",2))
         {
        	 System.out.println(retval);
         }
         /* He
          * is-my-dear-friend
          */
         
         // Sub sequence
         
         String s23 ="Java is my favorite language";
         CharSequence s24 =s23.subSequence(3,10);// a is my
         
         System.out.println(s24);
         
         /* Note: CharSequence is a Datatype for storing 
          *       a each character from String Datatype
          */
         
         String s25 = s23.substring(10);
         System.out.println(s25); //favorite language
         
         String s26 = s23.substring(2, 10);
         System.out.println(s26);//va is my
         /* Note: start at index 2
          *       end before 10
          */
         
         System.out.println(s23.toLowerCase());
         //java is my favorite language
         
         
         //To remove whitespace
         
         String s27 ="   Java is my favorite language    ";
         
         System.out.println(s27.trim());
         //Java is my favorite language

         /* Leading (start) and trailing(end)
          * whitespaces are removed
          * 
          */
