package abstractClass;

public abstract class Test1 {

	public static void main(String[] args)
	{
	//	Test1 t=new Test1();  // we cannaot create object of an abstract class
	//	t.demo();
	//	t.football();
		tenis();

	}
	
	public abstract void demo();  //incomplete method
	public abstract void cricket();  //incomplete method
	
	public void football()       //complete method
	{
		System.out.println("complete method from abstract class");
	}
	
	public static void tenis()
	{
		System.out.println("complete static method ");
	}

}
