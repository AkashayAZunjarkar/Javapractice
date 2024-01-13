package AccessSpecifier;

public class MyClass1 {
	
	private int a=20;      //variable=> object.variable
	public int b=30;
	int c=40;
	protected int d=50;

	public static void main(String[] args) 
	{
		MyClass1 m1=new MyClass1 ();
		System.out.println("My private "+m1.a);
		System.out.println("My public "+m1.b);
		System.out.println("My default  "+m1.c);
		System.out.println(("my protected "+m1.d));
		
		System.out.println("---------------------------------");
		
		m1.test1();
		m1.test2();
		m1.test3();
		m1.test4();

	}
	
	
	private void test1()
	{
	  System.out.println("Priavte method visible only class");
	}

	public void test2()
	{
		 System.out.println("Ppublic method visible throughout the project");
	}
	
	void test3()
	{
		System.out.println("default method is visible only package");
	}
	
	protected void test4()
	{
		System.out.println("protected method is visible outside the package with the help of inheritance");
	}
}
