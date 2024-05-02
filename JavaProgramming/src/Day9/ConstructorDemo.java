package Day9;

public class ConstructorDemo {
       
	int x,y;
	String s;
	
	ConstructorDemo()  //default contructor
	{
		x=100;
		y=200;
		s= "John";
		
		
	} 
	ConstructorDemo(int a, int b, String st) // parameterised constructor
	{
         x=a;   
		 y=b; 
	 s=st; 
		
	}
	void display()
	{
		  System.out.println(x);
		System.out.println(y);
		System.out.println(s);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ConstructorDemo cd= new ConstructorDemo();
		ConstructorDemo cd= new ConstructorDemo(100,200, "John");
		
		cd.display();
     
	}

}
