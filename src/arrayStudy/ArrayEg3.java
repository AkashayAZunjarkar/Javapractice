package arrayStudy;

import java.util.Arrays;

public class ArrayEg3 {

	public static void main(String[] args)
	{
		
		int age[]= {10,27,9,13,18};
		System.out.println(age.length);
		
		// i want to print the age values as it is
		System.out.println("=================Same order====================");
		
		for(int i=0;i<=age.length-1;i++)
		{
			System.out.println(age[i]);
		}
	
		System.out.println("=================revserse order====================");
		
		for(int i=age.length-1;i>=0;i--)
		{
			System.out.println(age[i]);
		}
		
		System.out.println("=================assending order====================");
		
		Arrays.sort(age);  //using sort method of Arryasclass
		
		for(int i=0;i<=age.length-1;i++)
		{
			System.out.println(age[i]);
		}
		
		System.out.println("=================decending order====================");
		
		for(int i=age.length-1;i>0;i--)
		{
			System.out.println(age[i]);
		}
	}

}
