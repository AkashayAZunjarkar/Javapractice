package constructor;

public class CS1 
{
	int a;
	int b;
	int c;
	public CS1()
	{
		a=1;
		b=3;
		c=5;
	}
	public CS1(int x,int y)
	{
		a=x;
		b=y;
	}

	public static void main(String[] args)
	{
		CS1 cs=new CS1();
		cs.addition();
		CS1 ct=new CS1();
		ct.substraction();
	   

	}
	public void addition()
	{
		int sum=a+b+c;
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
		System.out.println("c value is "+c);
		System.out.println("sum is "+sum);
		
	}
	public void substraction()
	{
		int sub=a-b-c;
		System.out.println("sub is "+sub);
	}

}
