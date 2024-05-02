package Day9;

public class MehodOverloading {

	int x,y;
    double d;
    
    void sum()
    {
    	x=10;
    	y=20;
    	System.out.println(x+y);
    }
    void sum(int a, int b)
    { 
    	x=a;
    	y=b;
    	System.out.println(x+y);
    	
    }
    void sum(int a, double b)
    {
    	x=a;
    	d=b;
    	System.out.println(x+d);
    }
    void sum(double b, int a)
    {
    	x=a;
    	d=b;
    	System.out.println(x+d);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MehodOverloading mo= new MehodOverloading();
		mo.sum();
		mo.sum(50,30);
		mo.sum(10.5,20);
		mo.sum(30,40.5);
     
	}

}
