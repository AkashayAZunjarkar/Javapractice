package AccessSpecifier;

public class MyTestClass1 {

	public static void main(String[] args) 
	{
		MyClass1 m=new MyClass1();
		// System.out.println("value of a "+m2.a);  //private from MyClass1
		   System.out.println(m.b);                 //public from MyClass1
		   System.out.println("value of c "+m.c);   //default
		   System.out.println(m.d);                 //protected
		   
		   System.out.println("-------------------------");
		   
		//   m.test1();      //priavte from MyClass1
		   m.test2();        //public
		   m.test3();        //default
		   m.test4();        //protected
		 
		

	}

}