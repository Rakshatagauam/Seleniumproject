package day2;

import java.util.Scanner;

public class PerimeterTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s= new Scanner(System.in);
        
      //*  System.out.print("Enter first side length");
        int a= s.nextInt();
       System.out.print("Enter second side length");
        int b= s.nextInt();
        System.out.print("Enter third side length");
        int c= s.nextInt();
        int perminter = a+b+c;
        System.out.println("permiter: "+(perminter)); //*  
             
        
        
        double r= s.nextDouble();
        System.out.println("enter area circle");
      double  Area = 3.14*r*r;
      System.out.println("Area "+(Area));
        
        
       
        
       
        
        
        
        
	}

}
