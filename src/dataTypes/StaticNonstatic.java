package dataTypes;

public class StaticNonstatic {

	public static void main(String[] args)
	{
	StaticNonstatic obj=new StaticNonstatic();
			obj.demo1();
	sample1();
	
	}
    public static void sample1()
	{
		System.out.println("hi guys");
	}
    public static void  sample2()
    {
    	System.out.println("hi public");
    }
    public void demo1()
    {
    	System.out.println("this is non-static method");
    }

}
