package abstractClass;

public class Test2 extends Test1
{

	public static void main(String[] args)
	{
		
		Test2 t2=new Test2();
		t2.demo();      //calling method from test1  //complete in test2 class
		t2.cricket();    //calling method from test1  //complete in test2 class
		t2.football(); //calling method from abstract class  //complete in test2 class
		Test1.tenis();  //calling static method from test1   //complete in test2 class
		t2.review();    //own method of test2
		

	}

	@Override
	public void demo() 
	{
	
		System.out.println("this method complete in test2");
		
	}

	@Override
	public void cricket() 
	{
		
		System.out.println("this method complete in test2");
		
	}
	
	public void review()
	{
		System.out.println("own method of test2");
	}

}
