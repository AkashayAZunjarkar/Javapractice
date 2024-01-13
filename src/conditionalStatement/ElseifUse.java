package conditionalStatement;

public class ElseifUse {
 
	public static void main(String[] args)
	{
		//If my gender is M then I am Male
		//If my gender is f i am female
		//else please enter gender value either M or F
		
		char gender='F';
		if(gender=='M')	
		{
			System.out.println("I am male");
		}
		else if(gender=='F')
		{
			System.out.println("I am female");
		}
		else
		{
			System.out.println("Please enter the gender value either M or f");
		} 
		
		System.out.println("================================================");
		
		//If any marks are greater than or equal to 80 and less than equal 100->I am in dist
		//else if any marks are greater than equal to 66 and less than to 80--> I am in 1st class
		//else if any marks are greater than  or equal to 50 and less than 66-> I am in 2nd class
		// else I m fail
		
		
		int marks=49;
		if(marks>=80 && marks<=100)
		{
			System.out.println("I am in dist");
		}
		else if(marks>=66 && marks<=80)
		{
			System.out.println("I am in 1st class");
		}
		else if(marks>=50 && marks<=66)
		{
			System.out.println("I am in 2nd class");
		}
		else
		{
			System.out.println("I m fail");
		}

	}

}
