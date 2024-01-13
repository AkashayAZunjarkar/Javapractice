package constructor;

public class demo1 {

	public static void main(String[] args) 
	{
		demo1 de=new demo1();
     div1("Akshay", 'M');
     demo1 d1=new demo1();
     d1.div2(false, 97);
     demo1 d2=new demo1();
	}
	public static void div1(String name,char gender)
	{
		System.out.println("My name is akshay");
		System.out.println("gender is male");
	}
	public void div2(boolean statement,int marks)
	{
		System.out.println("Given statement is false");
		System.out.println("marks in written exam are 97");
	}
    public demo1()
    {
    	System.out.println("this is software testing");
    }
}
