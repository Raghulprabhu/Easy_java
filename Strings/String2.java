package String;

public class String2 {

	public static void main(String[] args) {
		    // TODO Auto-generated method stub
		
		    char[] chr = {'a','b','c','d'};
		    String str = new String(chr);
        System.out.println(str);     // abcd
        
        String str1="abcd";
        System.out.println(str1.length()); //4
        System.out.println(str.length()); // 4
        
        
        String c = "Hello World";
        int start =2;
        int end = 9;
        char s[]=new char[end-start];//only 7
        c.getChars(start,end,s,0);
        System.out.println(s);  // llo Wor
        
        //append string
        
        StringBuilder s1 = new StringBuilder("123");
        s1.append("456");
        System.out.println(s1); // 123456
        
        
        String chars[] = {"a", "b", "c", "a", "c"};

        for (int i = 0; i < chars.length; ++i)

            for (int j = i + 1; j < chars.length; ++j)

                if(chars[i].compareTo(chars[j]) == 0)

                    System.out.print(chars[j]); 
           
        //Ans: ac
        
        
        String chars1[] = {"a", "b", "c", "a", "c"};
        
        System.out.println(chars1[0]!=chars[1]); //ture

        for (int i = 0; i < chars1.length; ++i)

        	for(int k=i+1;k<chars1.length;k++)
            {
            	if(chars1[i]!=chars[k])

                    System.out.print(chars1[k]);
            }
            	
        //Ans: bcccacac
        
    }

}
