package day2;

import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Total "+(num1+num2));
        
	}

}
