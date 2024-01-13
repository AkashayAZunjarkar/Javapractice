package constructor;

public class CS
{
	int a;
	int b;
	int c;
	public CS()
	{
		a=1;
		b=2;
		c=3;
		
	}
	public static void main(String[] args) 
	{
		CS c1=new CS();
		c1.addition();

	}
	public void addition()
	{
		int sum;
		sum=a+b+c;
	}

}
