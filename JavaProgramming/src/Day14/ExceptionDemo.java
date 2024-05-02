package Day14;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("program is started");
    System.out.println("Program is in progress");
    
      //Eample
  /*  Scanner sc= new Scanner(System.in);
    System.out.println("Enter number");
    int num= sc.nextInt();
    
    System.out.println(100/num);   //Arthmetic exception */
    
    //Example 2
    int a[]= new int [5];
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number");
    int num= sc.nextInt();
    
    System.out.println("Enter position0-4");
    int pos= sc.nextInt();
    
    a[pos]= num;
    System.out.println(a[pos]);
    
    System.out.println("program exceted ");
    System.out.println("program exit");
    
	}

}
