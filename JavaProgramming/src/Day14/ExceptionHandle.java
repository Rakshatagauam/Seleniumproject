package Day14;

import java.util.Scanner;

public class ExceptionHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program is started");
	    System.out.println("Program is in progress");
	    
	      //Eample
	   Scanner sc= new Scanner(System.in);
	    System.out.println("Enter number");
	    int num= sc.nextInt();
	    
	    try {
	    System.out.println(100/num);
	    }
	    catch(ArithmeticException e)
	    {
	    	System.out.println("you have entered invalid data ");
	    }
	    
	    System.out.println("program exceted ");
	    System.out.println("program exit");
	    
	}

}
