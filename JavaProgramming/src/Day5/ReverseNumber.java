package Day5;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number reserve");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		
		
   int res=0;
    while (num!=0)
    {
    	res= res*10+ num%10;
    	num= num/10;
    }
    System.out.println("Enter output: "+res);
	}

}
