package Day3;

public class SwappingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10, b=20;
 System.out.println("Before Swapping "+a+ " "+b);
/* int t=a;
 a=b;
 b=t; */
 a= a+b;
 b= a-b;
 a= a-b;
 
 System.out.println("After swapping "+a+ " "+b);

	}

}
