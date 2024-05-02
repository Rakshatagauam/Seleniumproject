package day2;

import java.util.Scanner;

public class DemoScanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter name");
    String name= sc.nextLine();
    System.out.println("Enter name "+name);
    
    System.out.println("Enter gender");
    char gender= sc.next().charAt(0);
    System.out.println("Enter gender "+gender);
    
    System.out.println("Enter height");
    float ht= sc.nextFloat();
    System.out.println("Enter height "+ht);
    
    System.out.println("Enter mob");
    int mob= sc.nextInt();
    System.out.println("Enter mob "+mob);
    
    System.out.println("Enter age");
    int age= sc.nextInt();
    System.out.println("Enter age "+age);
    
    
	}

}
