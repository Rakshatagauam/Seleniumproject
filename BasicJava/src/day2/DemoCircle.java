package day2;

import java.util.Scanner;

public class DemoCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
      
		Scanner s= new Scanner(System.in);
		 System.out.println("Enter area circle");
       double radius = s.nextDouble();
       
      // System.out.println("Enter area circle "+radius); //
     double  Area = 3.14*radius*radius;
     System.out.println("Area "+(Area));
       
	}

}
