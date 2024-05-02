package Day12;

 interface shape
 {
	 int lenght=10;  //final & static
	 int width= 30; // final & static
	 
	 void circle();  //abstract method
	 
	default void square()   //default method
	 {
		 System.out.println("this is default method type");
	 }
	
	static void rectengle()     //static method
	{
		System.out.println("this is rectengle");
	}
 }
 
 
public class InheritenceDemo implements shape
{
	public void circle()
	{
		System.out.println("this is circle");
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritenceDemo  ID= new InheritenceDemo();
		ID.circle();
		ID.square();
		shape.rectengle();    //static method can directly access
		
		shape sh = new InheritenceDemo(); // or this 
		sh.circle();
		sh.square();
		shape.rectengle();
	}

}
