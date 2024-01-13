package dataTypes;

public class StudentInfo {

	public static void main(String[] args) {
		//  name,gender,%result,marks,pass-fail status
		
		// 1.Variable declaration
		String name;
		char gender;
		float result;
		int marks;
		boolean result_status;
		
		//2. Variable initialization
		
		name="Akshay";
		gender='M';
		result=6.99f;
		marks=99;
		result_status= true;
		
		//3.usage
		
		System.out.println("-------------------------------------");
		System.out.println("My name is "+name);
		System.out.println("My gender is "+gender);
		System.out.println("My result is "+result);
		System.out.println("My marks is "+marks);
		System.out.println("My result status is "+result_status);
		System.out.println("----------------------------");
		

	}

}
