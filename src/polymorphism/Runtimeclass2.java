package polymorphism;

public class Runtimeclass2 extends   RuntimeClass    //using inheritace
{

	public static void main(String[] args) 
	{
		 RuntimeClass r1=new  RuntimeClass();  //create obj for calling superclass (test)
		 r1.test();
		 r1.demo();
		 
		 Runtimeclass2 r2=new Runtimeclass2();  //create new obj for calling sub class (test)
		 r2.test();
		 
	

	}
	
	public void test()
	{
		System.out.println("this method is sub class"); //use override concept //method same only defination diff
	}

}
