package interfaceuse;

public class Son implements Father,Mother
{

	public static void main(String[] args)
	{
		Son s1 =new Son();
		s1.bike();
		s1.money();
		s1.maturity();
		Father.look();
		Mother.look();
		s1.thar();
		

	}


	
	@Override
	public void maturity()
	{
		Mother.super.maturity();
		Father.super.maturity();
	
		
	}
	

	@Override
	public void money()
	{
		System.out.println("this method comes from mother interface");
		
	}

	@Override
	public void bike() 
	{
		
		System.out.println("this method comes from father interface");
		
		
	}
	public void thar()
	{
		System.out.println("son own thar");
	}

}
