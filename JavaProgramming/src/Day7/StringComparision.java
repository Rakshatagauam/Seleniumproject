package Day7;

public class StringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Case 1
   /* String s1= "welcome";
    String s2= "welcome";
   System.out.println(s1==s2);  //tru 
    System.out.println(s1.equals(s2)); //true */
    
		//case 2
		
  /*  String s1= new String("welcome");
    String s2= new String("welcome"); 
     System.out.println(s1);
     System.out.println(s2);
    
    System.out.println(s1==s2);  //false
    System.out.println(s1.equals(s2));  //tru */
    
    //case 3
    String s1= "abc";
    String s2= new String ("abc");
    String s3= s2;
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    
    System.out.println(s1==s2);
    System.out.println(s1.equals(s2));
    
    System.out.println(s2==s3);
    System.out.println(s2.equals(s3));
    
    System.out.println(s1==s3);
    System.out.println(s1.equals(s3));
    
	}

}
