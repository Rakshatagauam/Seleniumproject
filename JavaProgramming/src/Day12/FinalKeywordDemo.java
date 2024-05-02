package Day12;

class test
{
	final int x=100;   // constant value - we cannot change
	 
}
public class FinalKeywordDemo {

	
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       test T= new test();
    //    T.x=200;  //incorrect, bcoz x is final variable
       System.out.println(T.x);
    
	}

}
