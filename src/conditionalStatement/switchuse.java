package conditionalStatement;

public class switchuse {

	public static void main(String[] args) 
	{
		//M--> Male
		//F--> Female
		//a-z->please enter correct gender value-->default
		
		char gender='A';
		switch(gender)//M,F
		{
		case 'M':
			System.out.println("I am male");
		break;
		case 'F':
			System.out.println("I am female");
		break;
		default:
			System.out.println("please enter correct gender value");
		}
		

	}

}
