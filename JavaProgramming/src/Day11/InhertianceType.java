package Day11;

    class A
    {
    	// int a=100;
    	 int a;
    	 void display()
    	 {
    		 System.out.println(a);
    	 }
    }
    	 class B extends A
    	 {
    		 int b=200;
    		 void show()
    		 {
    			System.out.println(b); 
    		 }
    	 }
    	 class C extends B
    	 {
    		 int c;
    		 void print()
    		 {
    			 System.out.println(c);
    		 }
    	 }
    	 
    	
    
public class InhertianceType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// B bobj= new B();
		// System.out.println(bobj.a);
		// System.out.println(bobj.b);
		
	// 	bobj.a=500; 
		
		// bobj.display();
		// bobj.show();
		
		C cobj= new C();
		cobj.a= 100;
		cobj.b=200;
		cobj.c= 300;
		cobj.display();
		cobj.show();
		cobj.print();
		
		
		
	
		

	}

}
