package String;

public class String3 {

	public static void main(String[] args) {

        String c = "  Hello World  ";
        String s = c.trim();   // remove white space at first and end
        System.out.println("\'"+s+"\'");
        // \' -> add ->'  last and first
        
        //'Hello World'
        
        String s1="A";
        String s2="C";
        System.out.println(s1+"B"+s2+"D");//ABCD
        
        System.out.println(s1+55); //A55
        
        System.out.println(55+s1); //55A
        
        System.out.println(55+s1+55);//55A55
        
        System.out.println(55+55+s1);//110A
        
        System.out.println(55+"55"+55);//555555
        System.out.println("55"+55+55);//555555
        System.out.println(55+55+"55");//11055
          
        
	}

}
