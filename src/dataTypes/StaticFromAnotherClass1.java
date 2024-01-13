package dataTypes;

public class StaticFromAnotherClass1 {

	public static void main(String[] args)
	{
	sample1();
	sample2();
	StaticFromAnotherClass2.demo1();
	StaticFromAnotherClass2.demo2();
	

	}
	public static void sample1()
	{
		System.out.println("this is sample1 from class1");
	}
	public static void sample2()
	{
		System.out.println("this is sample2 from class1");
	}

}