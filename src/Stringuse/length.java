package Stringuse;

public class length {

	public static void main(String[] args) 
	{
		   //length
		    String s="Nashik";
		    int slength = s.length();
		    System.out.println("lenghth of string is "+s.length());
		    
		    
		    String s1="Pune";
            int s1length = s1.length();
            System.out.println("length of string "+s1.length());
            
            System.out.println("_____________________________________________");
            
            // uppercase
               
               String b="mumbai";
               String btouppercase = b.toUpperCase();
               System.out.println("uppercase of string "+b.toUpperCase());
               
            //lowercase
               
               String c="NASHIK";
               System.out.println("string of lowercase "+c.toLowerCase());
               
               System.out.println("________________________________________________________");
               
             //equals()
             //equalsIgnoreCase()   
               
               String x1="Akshay";
               String x2="Akshay";
               String x3="akshay";
               
               String x4=new String ("Akshay");
               String x5=new String ("Akshay");
               String x6=new String ("akshay");
               
               boolean result = x1.equals(x2);
               System.out.println(x1.equals(x2));
               System.out.println(x1.equals(x3));     //case sensitive
               System.out.println(x1.equals(x4));
               System.out.println(x1.equals(x6));    //case sensitive
		       System.out.println (x2.equals(x3));  //case sensitive
		       
		       
		       System.out.println("_____________________________________");
		       
		       System.out.println(x1==x2);
		       System.out.println(x1==x4);
		       System.out.println(x5==x6);
		       
		       System.out.println("_____________________________________");
		      
		       //contains()
		       
		       String y1="INDIA";
		       System.out.println(y1.contains("A"));
		       System.out.println(y1.contains("IIA"));
		       System.out.println(y1.contains("NDA"));
		       
		       System.out.println("_____________________________________");
		       
		       //is Empty()
               
		       String a1="Satara";
		       String a2="   ";
		       String a3="";
		       System.out.println(a1.isEmpty());
		       System.out.println(a2.isEmpty());
		       System.out.println(a3.isEmpty());
		       
		       System.out.println("_____________________________________");
		       
		       //isBlank
		       
		       System.out.println(a2.isBlank());
		       System.out.println(a1.isBlank());
		       System.out.println(a3.isBlank());
		       
		       System.out.println("_____________________________________");
		       
		       
		       //chatAt
		       
		        String z1="Nashik";
		        System.out.println(z1.charAt(1));
		        System.out.println(z1.charAt(3));
		     //   System.out.println(z1.charAt(20)); 
		      
		        System.out.println("_____________________________________");
		        
		        //end with
		        //Start with
		        
		        String b1="Virat";
		        System.out.println(b1.endsWith("ir"));
		        System.out.println(b1.endsWith("rat"));
		        System.out.println(b1.endsWith("vir"));
		       
		        System.out.println("_____________________________________");
		        
		        System.out.println(b1.startsWith("Vir"));
		        
		        System.out.println("_____________________________________");
		        
		        System.out.println(b1.startsWith("Vi", 0));
		        System.out.println(b1.startsWith("at", 3));
		        
		        System.out.println("_____________________________________");
		        
		        //Substring
		        
		        String l1="India is my country";
		        System.out.println(l1.substring(8));
		        System.out.println(l1.substring(5));
		        System.out.println(l1.substring(4, 12));
		     
		        System.out.println("_____________________________________");
		        
		        //concat
		        String f1="harshal";
		        String f2="pagare";
		        System.out.println(f1.concat(f2));
		        System.out.println(f1.concat("pooja"));
		       
		        System.out.println("_____________________________________");
		        
		        
		        //indexof
		        //lastindex of
		        
		        String c1="mumbai";
		        System.out.println(c1.indexOf('m'));
		        System.out.println(c1.indent('b'));
		      
		        System.out.println("_____________________________________");
		        
		        System.out.println(c1.lastIndexOf("ai"));
		        
		        //replace
		        String h1="pooja";
		        System.out.println(h1.replaceAll("pooja", "harshal"));
		        
		
		

	}

}
