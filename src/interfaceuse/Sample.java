package interfaceuse;

public class Sample implements Interface2

{

	public static void main(String[] args) 
	{
		Sample s=new Sample();
		s.demo();
		s.demo1();
		s.demo3();
		s.demo4();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		

	}

	@Override
	public void demo()   //method from interface1
	{
		System.out.println("demo method completed in sample class");
		
	}

	@Override
	public void demo1()  //method from interface1
	{
		
		System.out.println("demo1 method completed in sample class");
		
	}

	@Override
	public void demo3() //method from interface2
	{
		
		System.out.println("demo3 method completed in sample class");
		
	}

	@Override
	public void demo4()   //method from interface2
	{
		System.out.println("demo4 method completed in sample class");
	
		
	}
	
	
	
	

}
