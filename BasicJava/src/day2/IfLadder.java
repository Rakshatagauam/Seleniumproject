package day2;

public class IfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a= 40 ,b=20, c=30;
        
        if (a>b && a>c)
        {
        	System.out.println("a is largest");
        }
        else if(b>a && b>c)
        {
        	System.out.println("b is largest");
        }
        else if (c>a && c>b)
        {
        	System.out.println("c is largest");
        }
	}

}
