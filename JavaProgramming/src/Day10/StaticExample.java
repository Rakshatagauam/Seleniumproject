package Day10;

public class StaticExample {

	static int a=10;  //static variable 
	int b=20; // non static
	
	static void m1()
	{
		System.out.println("m1 is static");
	}
	
	void m2()
	{
		System.out.println("m2 is non static");
	}
	
	void m()
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	//1) static methods can access static stuff directly ( without object).
        System.out.println(a);
     // System.out.println(b); // incorrect because b is non static
     m1();
     
     // 2.static methods can access non-static stuff through object
     StaticExample se= new StaticExample();
     System.out.println(se.b);
     se.m2();
     
     se.m(); */
     
     
       
	}

}
