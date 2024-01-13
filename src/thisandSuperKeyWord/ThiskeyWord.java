package thisandSuperKeyWord;

public class ThiskeyWord
{
	  int a=20;
	  int b =50;
	  static int c=1;

	public static void main(String[] args) 
	{
	
		ThiskeyWord t1= new ThiskeyWord ();
		t1.demo();
		t1.demo1();

	}
	public void demo()
	{
		int a=30;
		int b=50;
		int sum=a+b;  //use of local variable
		
		System.out.println("value of sum is "+sum);
		int div=c*10;
		
		
	}
	public void demo1()
	{
		int a=50;
		int b=70;
		int sub=b-this.a; // use of this keyword
		System.out.println("value od sub is "+sub);
	}

}
