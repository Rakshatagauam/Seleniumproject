package Day11;

    class Bank
     {
	   double roi()
	   {
		   return 0.0 ;
	   }
	}
    class ICIC extends Bank
    {
    	double roi()
    	{
    		return 10.5;
    	}
    }
    
    class Axis extends Bank
    {
    	double roi()
    	{
    		return 12.5;
    	}
    }

public class OverriddingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ICIC ic= new ICIC();
     System.out.println(ic.roi());
     
     Axis  ai= new Axis();
     System.out.println(ai.roi());
     
     Bank bi= new Bank();
     System.out.println(bi.roi());
     
	}

}