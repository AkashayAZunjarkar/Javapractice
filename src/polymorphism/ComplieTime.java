package polymorphism;

public class ComplieTime {

	public static void main(String[] args)
	{
		ComplieTime c= new ComplieTime();
		c.addition();
		c.addition(50, 50);
		c.addition(4.777f, 30);
		c.addition("Akshay", 20);

	}
	
	public void addition()
	{
		int a=30; int b=50;
		int sum= a+b;
		System.out.println("sum of "+sum);
	}
	
	public void addition(int a,int b)
	{
		int sum= a+ b;
		System.out.println("sum is "+sum);
	}

	public void addition(float a,int b)
	{
		float sum=a+b;
		System.out.println("sum of ");
	}
	
	public void addition(String a,int b)
	{
		String sum=a+b;
		System.out.println("sum is "+sum);
	}
}
