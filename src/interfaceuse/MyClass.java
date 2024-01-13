package interfaceuse;

public class MyClass implements MyInterface
{

	public static void main(String[] args) 
	{
		MyClass m1=new MyClass();
		m1.demo();
		m1.demo1(10, 20);
		m1.demo1();
	
	
	

	}

	@Override
	public void demo() 
	{
		System.out.println("Method completed in Myclass");
		
	}

	@Override
	public void demo1(int a, int b) 
	{
	
		int sum=a+b;
		System.out.println("sum is "+sum);
	}
	
	public void demo1()
	{
		System.out.println("Own method of Myclass");
	}

}
