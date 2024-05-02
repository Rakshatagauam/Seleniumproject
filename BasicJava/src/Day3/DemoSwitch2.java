package Day3;

import java.util.Scanner;

public class DemoSwitch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Enter charcter");
		Scanner sc= new Scanner(System.in);
      
       char ch= sc.next().charAt(0); 
       switch(ch)
       {
       case 'a':
       System.out.println("iphone");
       break;
       case 'b':
           System.out.println("iphone");
           break;
       case 'c':
           System.out.println("MAC");
           break;
       case 'd':
           System.out.println("onepulse");
           break;
       case 'e':
           System.out.println("samsung");
           break;
           default:
        	   System.out.println("Invalid");
           
       }
	}

}
