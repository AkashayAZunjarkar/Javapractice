package arrayStudy;

public class MultiDiamensionalArray {

	public static void main(String[] args)
	{
		
		//  || 10 20 ||
		//  || 30 40 ||
		
		//Array Declaration
		
		int num[][]=new int [2][2];
		
		// Array Initialization
		
		num [0][0]=10;
		num [0][1]=20;
		num [1][0]=30;
		num [1][1]=40;
		
		// Usage
		System.out.print(num [0][0]+" ");
		System.out.println(num [0][1]);
		System.out.print(num [1][0]+" ");
		System.out.println(num [1][1]);
		
		System.out.println("===================================");
		
		// use of nested for loop
		//row=> outer loop
		
		for(int i=0;i<=num.length-1;i++) //0,1,2
		{
			//column=> inner loop
			for(int j=0;j<=num.length-1;j++)//0,1,2
			{
				System.out.print(num [i][j]+" ");
			}
			
			    System.out.println();
			
		}
		System.out.println("===================================");
		
	//	|| AZ Vk SG ||
	//	|| AA BA CA ||
	//  || CA BA CC ||
			
		//Array Declaration
		
		String[][] names=new String[3][3];
		
		// Array Initialization
		
		names[0][0]="AZ";
		names[0][1]="VK";
		names[0][2]="SG";
		names[1][0]="AA";
		names[1][1]="BA";
		names[1][2]="CA";
		names[2][0]="CA";
		names[2][1]="CB";
		names[2][2]="CC";
		
		
	    //usage
		System.out.print(names[0][0]+ " ");
		System.out.print(names[0][1]+ " ");
		System.out.println(names[0][2]+ " ");
		System.out.print(names[1][0]+ " ");
		System.out.print(names[1][1]+ " ");
		System.out.println(names[1][2]+ " ");
		System.out.print(names[2][0]+ " ");
		System.out.print(names[2][1]+ " ");
		System.out.println(names[2][2]+ " ");
		
		System.out.println("===================================");
		
		// use of nested for loop
		for(int i=0;i<=names.length-1;i++)
		{
			for(int j=0;j<=names.length-1;j++)
			{
				System.out.print(names[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
