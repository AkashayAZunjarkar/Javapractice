package arrayStudy;

public class ArrayEg1 {

	public static void main(String[] args)
	{
		
		// I want to store student names  akshay,aniket,machya,sham,balya
		
		String names[]=new String[4];
		names[0]="akshay";
		names[1]="aniket";
		names[2]="machya";
		names[3]="sham";
	//	names[4]="balya";
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
	//	System.out.println(names[4]);
		
		System.out.println("______________________________________________");
		
	// I want to store gender
		
		char gender[]=new char[3];
		gender[0]='m';
		gender[1]='f';
		gender[2]='o';
		System.out.println(gender[0]);
		System.out.println(gender[1]);
		System.out.println(gender[2]);
		
		System.out.println("______________________________________________");
		
   // I want to store result
		boolean result[]=new boolean[2];
		result[0]=true;
		result[1]=false;
		System.out.println("given condition is  "+gender[0]);
		System.out.println("given condition is  "+gender[1]);
		
		System.out.println("______________________________________________");
		
	
	// I want to store roll no 1 to 5
		
		int rollno[]=new int[7];
		rollno[0]=0;
		rollno[1]=1;
		rollno[2]=2;
		rollno[3]=3;
		rollno[4]=4;
		System.out.println(rollno[0]);
		System.out.println(rollno[1]);
		System.out.println(rollno[2]);
		System.out.println(rollno[3]);
		System.out.println(rollno[4]);
	
		
		System.out.println("______________________________________________");
		
		
		
		//staic for loop
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(rollno [i]);
		}
		
		System.out.println("______________________________________________");
		
		System.out.println(rollno.length);  //for length
		
		System.out.println("______________________________________________");
		
		 //Dynamic for loop
		
		for (int i=0;i<=rollno.length-1;i++)
		{
			System.out.println(rollno[i]);
		}
		
		
	}

}
