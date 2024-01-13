package useOfParameter;

public class Withoutparameter {

	public static void main(String[] args) 
	{
		Withoutparameter c1=new Withoutparameter();
		c1.addition();
		
		substraction();

	}
	public void addition()
	{
	 int a;
	 int b;
	 int sum;
	 a=20;b=30;
	 sum=a+b;
	 System.out.println("sum of number is "+sum);
	}
	 
	 public static void substraction()
	 {
		 int c;
		 int d;
		 int sub;
		 c=100; d=200;
		 sub=d-c;
		 System.out.println("substraction of the given no "+sub);
	 }
	
	}


