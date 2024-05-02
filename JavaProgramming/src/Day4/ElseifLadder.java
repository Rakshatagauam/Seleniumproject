package Day4;

import java.util.Scanner;

public class ElseifLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter weekno");
   int weekno= sc.nextInt();
   if(weekno==1)
   {
	   System.out.println("sunday");
   }
   else if (weekno==2)
   {
	   System.out.println("monday");
   }
   else if (weekno==3)
   {
	   System.out.println("Tuesday");
   }
   else if (weekno==4)
   {
	   System.out.println("Wednesday");
   }
   else if (weekno==5)
   {
	   System.out.println("Thursday");
   }
   else if (weekno==6)
   {
	   System.out.println("Friday");
   }
   else if (weekno==7)
   {
	   System.out.println("Saturday");
   }
   else 
   {
	   System.out.println("Invalid");
   }
   
	}

}
