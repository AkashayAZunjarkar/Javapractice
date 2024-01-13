package constructor;

public class TypesOfGlobalVariable {
	static int a=20;
	int b=30;

	public static void main(String[] args) 
	{
		System.out.println("The value of a "+a);// Calling Static variable for same class
		TypesOfGlobalVariable obj=new TypesOfGlobalVariable();
		System.out.println("the value of b "+obj.b);//calling non static variable for same class
//		
		Sample1 s1=new Sample1();
		System.out.println("the value of x "+s1.y);
		System.out.println("the value of x "+Sample1.x);
		
		

	}

}