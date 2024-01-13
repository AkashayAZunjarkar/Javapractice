package conditionalStatement;

public class NestedIfElse {

	public static void main(String[] args)
	{
		//If email Id is correct then please enter password
		//If password is correct then welcome to home page
		//else password is wrong then please enter correct password
		//else email id is wrong then please enter correct email id
		
		String email="Akshay.zunjarkar@18";
		String pass="akshay@18";
		
		if(email=="Akshay.zunjarkar@18")//Outer Statement
		{
			System.out.println("please enter pass");
		
		if(pass=="akshay@18")//inner statement
		{
			System.out.println("welcome to homepage");
		}
		else
		{
			System.out.println("please enter correct pass");
		}

	}
		else
		{
			System.out.println("please enter correct email id");
		}
	}
		

}
