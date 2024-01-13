package accessSpecifiertest;

import AccessSpecifier.MyClass1;

public class MyTestClass2 extends MyClass1
{
	
	
	

	public static void main(String[] args) 
	{
		MyClass1 m=new MyClass1();
		//m.test1();  //private method is not visible to other package
		m.test2();   //public method visible other package also
		//m.test3(); // default method can accessed only within same package
		//m.test4(); // protected package access only with the help of inheritance
		
		MyTestClass2 m2= new MyTestClass2 ();
		m2.test4();
		m2.test2();
		
	

	}

}
