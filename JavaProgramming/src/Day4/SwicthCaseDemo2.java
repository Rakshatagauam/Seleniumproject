package Day4;

public class SwicthCaseDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a=18, b=20, c=5;
    // if(a>b)
    /* {
    	 System.out.println("a is largest");
     }
     else
     {
    	 System.out.println("b is largest");*/
   
    	if (a>b && a>c)
    	{
    		System.out.println("a is smallest: "+a);
    	}
    	else if (b>a && b>c)
    	{
    		System.out.println("b is smallest "+b);
    	}
    	else
    	{
    		System.out.println("c is smallest: "+c);
    	}
     }
   
	}


