package Day9;

public class ConstructtorOverloading {

	int x,y;
	double d;
	
	ConstructtorOverloading()
	{
		x=10;
		y=20;
	}
	ConstructtorOverloading(int a, int b)
	{
		x=a;
		y=b;
		
	}
	ConstructtorOverloading(int a, double b)
	{
		x=a;
		d=b;
	}
	ConstructtorOverloading(double b, int a)
	{
		x=a;
		d=b;
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(d);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructtorOverloading co= new ConstructtorOverloading(50,20.5);
		co.display();

	}

}
