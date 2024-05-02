package Day3;

import java.util.Scanner;

public class Demoswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num1= 20, num2= 30;
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter choice");
       int ch= sc.nextInt();
       switch(ch)
       {
       case 1:
    	   System.out.println("ADD " +(num1+num2));
    	   //break;
       case 2:
    	   System.out.println("sub " +(num1-num2));
    	   //break;
       case 3:
    	   System.out.println("Multi " +(num1*num2));
    	   break;
       case 4:
    	   System.out.println("dive " +(num1/num2));
    	   break;
       case 5:
    	   System.out.println("Mod " +(num1%num2));
    	   break;
    	   default:
    		   System.out.println("Invalid");
    	   
    	   
       }
       
	}

}
