package Day4;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a>b && a>c a is largest
		// b>a && b>c b is largest
		// c>a && c>b c is largest
   int a=200, b= 200 ,c=200;
    if(a>b && a>c) // T && F
    {
    	System.out.println("a is largest: "+a);
    }
    else if(b>a && b>c) // F && f, t && t
    {
    	System.out.println("b is largest: "+b);
    }
    else 
    {
    	System.out.println("c is largest: "+c);
    }
	}

}
