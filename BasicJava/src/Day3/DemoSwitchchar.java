package Day3;

import java.util.Scanner;

public class DemoSwitchchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc= new Scanner(System.in);
    System.out.println("which day it is");
    char c= sc.next().charAt(0);
    switch(c)
    {
    case 'a':
    	System.out.println("Monday");
    	break;
    case 'b':
    	System.out.println("Tuesday");
    	break;
    case 'c':
    	System.out.println("Wednesday");
    	break;
    case 'd':
    	System.out.println("Thursday");
    	break;
    case 'e':
    	System.out.println("friday");
    	break;
    case 'f':
    	System.out.println("saturday");
    	break;
    case 'g':
    	System.out.println("Sunday");
    	break;
    	default:
    		System.out.println("Invalid");
    }
	}
	}


