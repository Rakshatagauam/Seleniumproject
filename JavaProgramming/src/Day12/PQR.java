package Day12;

public class PQR implements ABC,XYZ
{

	public void m2() 
	{
		System.out.println("this is m2 method from xyz from interface");
		System.out.println(y);
	}
	
	public void m1()
	{
		System.out.println("this is m1 method from abc interface");
	   System.out.println(x);
	}

public static void main(String[] args)
{
	PQR p= new PQR();
	p.m1();
	p.m2();
	}


	
	
		
	}

