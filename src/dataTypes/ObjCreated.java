package dataTypes;

public class ObjCreated {

	public static void main(String[] args)
	{
		ObjCreated obj=new ObjCreated();
		obj.test1();

	}
    public void test1()
    {
    	System.out.println("this is non-static method from same class1");
    }
    public void test2()
    {
    	System.out.println("this is non-static method from same class2");
    }
}
