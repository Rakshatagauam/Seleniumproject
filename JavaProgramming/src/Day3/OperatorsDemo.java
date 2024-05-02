package Day3;

public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=100, b= 20;
    System.out.println("Sum of value: "+(a+b));
    System.out.println("sub of value: "+(a-b));
    System.out.println("Multp of value: "+(a*b));
    System.out.println("Sum of value: "+(a/b));
    System.out.println("Sum of value: "+(a%b));
    b=100;
    System.out.println(a<b); //Relational operator
    System.out.println(a>b);
    System.out.println(a<=b);
    System.out.println(a>=b);
    System.out.println(a==b);
    System.out.println(a!=b);
    //Logical operators
    
    boolean x= true;
    boolean y= false;
    System.out.println(x && y);
    System.out.println(x || y);
    
    boolean b1= 10>30; //f
    boolean b2= 20>10; //t
    System.out.println(b1 && b2);
    System.out.println(b1 || b2);
    
	}

}
