package loopUse;

public class PreAndPostIncrement {

	public static void main(String[] args)
    {
		int y=30;
		System.out.println(y);
		int z;  //post increment
		z=y++;
		System.out.println(z);
		System.out.println(y);
		
		System.out.println("------------------------------");
		
		
		int a=50;
		System.out.println(a);
		int b;
		b=a++;    //post increment
		System.out.println(b);
		System.out.println(a);
		System.out.println("------------------------------");
		
		int c=99;
	    System.out.println(c);
	    int d;
	    d=c++;   //post increment
	    System.out.println(d);
	    System.out.println(c);
	    
	    System.out.println("------------------------------");
	    
	    //pre increment
	    
	    int f=90;
	    int e;
	    e=++f;
	    System.out.println(e);
	    System.out.println(f);
	    
	    System.out.println("------------------------------");
	    
	    int m=60; 
	    int n;
	    n=++m;  //pre increment
	    System.out.println(n);
	    System.out.println(m);
	    
	    System.out.println("------------------------------");
	    
	    
	    //Post decrement
	    
	    int o=20;
	    int p;
	    p=o--;
	    System.out.println(p);
	    System.out.println(o);
	    
	    System.out.println("------------------------------");
	    
	    int s=10;
	    int t;
	    t=s--;
	    System.out.println(t);
	    System.out.println(s);
	    	
	    System.out.println("------------------------------");
	    
	    
	    //pre decrement
	    
	    int r=66;
	    int q;
	    q=--r;
	    System.out.println(q);
	    System.out.println(r);
	    
	    
	    
	    
	    

	}

}
