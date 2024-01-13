package CastingStudy;

public class Upcasting {

	public static void main(String[] args) 
	{
		Father f1=new Father();
		f1.bike();
		f1.land();
		
		System.out.println("==============================");
		
		Son s1=new Son();
		s1.bike();
		s1.car();
		
		System.out.println("==============================");
		
		//Upcasting
		//creating object of subClass and giving ref of super class
		Father f= new Son();
		f.bike();
		f.land();
	
		
	

	}

}
