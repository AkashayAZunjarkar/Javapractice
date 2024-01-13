package interfaceuse;

public interface Mother 
{
	
	static void look()
	{
		System.out.println("mothers look");
	}
	default void maturity()
	{
		System.out.println("Mothers maturity");
	}
	
		
	
	void money();

}
