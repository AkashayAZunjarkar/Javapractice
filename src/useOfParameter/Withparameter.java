package useOfParameter;

public class Withparameter {

	public static void main(String[] args) 
	{
     
		 Withparameter w1=new  Withparameter();
		 w1.studentdetails("Akshay", 'M', 97, 88.98f);
		 
		 studentinfo(7775, false);

	}
    public void studentdetails(String name ,char gender,int marks,float avg)
   
    {
    	System.out.println("My name is  "+name);
    	System.out.println("My gender is "+gender);
    	System.out.println("My marks is "+marks);
    	System.out.println("My avg is "+avg);
    	
    	
    }
    public static void studentinfo (long num,boolean statement)
    
    {
    	
    	System.out.println("stundent mo no "+num);
    	System.out.println("student div is "+statement);
    }
}
