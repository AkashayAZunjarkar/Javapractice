package constructor;

public class ConstructorUse {
	int a;
	int b;
	int c;
	public ConstructorUse()
	{
		a=20;
		b=30;
		c=40;
		
	}

	public static void main(String[] args) 
	{
		ConstructorUse c1=new ConstructorUse();
		c1.addition();

	}

	public void addition()
	{
		int sum;
		sum=a+b+c;
		System.out.println("sum of "+sum);
	}

}
