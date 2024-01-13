package arrayStudy;

public class MdArray2 {

	public static void main(String[] args)
	{
	//	|| A B C ||
	//	|| D E F ||
	//	|| G H I ||
		
		char div[][]= {{'A','B','C'}, {'D','E','F'},{'G','H','I'}};
		
		//Outer loop
		for(int i=0;i<=div.length-1;i++)
		{
			for(int j=0;j<=div.length-1;j++)
			{
				System.out.print(div[i][j]+ " ");
				
			}
			System.out.println();
			
		}
		

	}

}
