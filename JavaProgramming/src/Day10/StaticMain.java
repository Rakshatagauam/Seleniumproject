package Day10;

public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1) static methods can access static stuff directly ( without object).
        System.out.println(StaticExample.a);
     // System.out.println(b); // incorrect because b is non static
        StaticExample.m1();
     
     // 2.static methods can access non-static stuff through object
     StaticExample se= new StaticExample();
     System.out.println(se.b);
     se.m2();
     
     se.m();
	}

}
