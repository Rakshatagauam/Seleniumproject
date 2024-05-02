package Day11;

class WXV
{
	void m1(int a)
	{
		System.out.println(a);
	}
	void m2(int b)
	{
		System.out.println(b);
	}
	class WAQ extends WXV
	{
		void m1(int a)
		{
			System.out.println(a*a);  //overridding
		}
		void m2(int a, int b)    //overloading
		{
			System.out.println(a+b);
		}
	}

	
	
	
public class OverriddingvsOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WAQ waq= new WAQ();
		waq.m1(100);
		waq.m2(10);
		waq.m2(10,20);

	}

}
