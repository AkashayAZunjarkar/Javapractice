package interfaceuse;

public interface Father 
{
	
	static void look()
	{
		System.out.println("father look");
	}
	
	default void maturity()
	{
		System.out.println("father maturity");
	}

	void bike();

}
