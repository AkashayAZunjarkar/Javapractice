package thisandSuperKeyWord;

public class SuperKeyWord extends ThiskeyWord
{

	public static void main(String[] args) 
	{
		SuperKeyWord s1= new SuperKeyWord();
		s1.test();

	}
	
	public void test()
	{
		int a=30;
		int b=10;
		int multi=super.b*a;
		System.out.println("value of multi "+multi);
	}

}
