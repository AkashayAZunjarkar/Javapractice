package collectionstudy;

import java.util.ArrayList;

public class ArraylistMethod {

	public static void main(String[] args)
	{
		ArrayList<Object> al=new ArrayList<>();
		System.out.println(al.add("Pune"));  //boolean
		System.out.println(al);
		

		//(int index,obj element)   -----------Shifting the element position
		al.add(0, "Nashik");
		System.out.println(al);
		
		//al.clear
		//al.clear();
		//System.out.println(al);
		
		// al.clone  ----------duplicate obj
		Object alNew = al.clone();
		System.out.println("clone array list "+alNew);
		
		//al.contains();
		System.out.println(al.contains("Nashik")); //true- becasue nashik is given above
		System.out.println(al.contains("mumbai")); // false-mumbai is not given above
		
		al.ensureCapacity(3); // we take max capacity 3,(3+) 
		
		al.add("shirdi");
		System.out.println(al);
		
		al.add("goa");
		System.out.println(al);
		
		System.out.println("---------------------------------------------------------");
		
		al.equals(alNew);// al and alnew (same element yes/no)
		
		System.out.println(alNew);
		System.out.println(al);
	
		System.out.println(al.equals(alNew));
		
		System.out.println("---------------------------------------------------------");
		
		//al.get();-------------index no of element
		System.out.println(al.get(2));
		
		//System.out.println(al.get(5));
		
		System.out.println("---------------------------------------------------------");
		
		
		al.indexOf("goa");
		System.out.println(al.indexOf("goa"));
		
		System.out.println("---------------------------------------------------------");
		
		al.isEmpty();
		System.out.println(al.isEmpty());
		
		System.out.println("---------------------------------------------------------");
		
		System.out.println(al.remove(1));
		System.out.println(al);
		
		System.out.println("---------------------------------------------------------");
		
		System.out.println(al.size());
		
		System.out.println("---------------------------------------------------------");
		
		al.set(1, "paris");
		System.out.println(al);
		
	
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		

	}

}
