package Day7;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // String s= "welcome";
   String s= new String ("welcome");
  // System.out.println(s);
   
   //Length of string
 //  System.out.println(s.length());
   //concate 2string
   String s1= "welcome";
   String s2= " To Java";
   String s3= " automation";
    System.out.println(s1+s2);
   System.out.println(s1.concat(s2));
   System.out.println(s1.concat(s2).concat(s3));
   s= "     Automation    ";
   System.out.println(s.length());
   System.out.println(s.trim().length());
   s = "Happyisnot";
   
   
   System.out.println(s.charAt(2)); // to retune single value
   System.out.println(s.charAt(7));
   
   //Contains check boolean value true false
   System.out.println(s.contains("happy"));
  System.out.println(s.contains("Happyis"));
   System.out.println(s.contains("ist"));
   
   s1= "welcome";
   s2= "WELCOME";
   
   System.out.println(s1.equals(s2));  //false
   System.out.println(s1.equalsIgnoreCase(s2)); //true
   
   //replace single /multiple charcters
   
   s= "welcome to selenium testing selenium";
   System.out.println(s.replace('e', 'X'));
   
   System.out.println(s.replace("selenium", "java"));
   s= "welcome";
   //Substring 
   System.out.println(s.substring(2,4));
   System.out.println(s.substring(1,6));
   
   s= "abc@gmail.com";
   String a[]= s.split(".");
  // System.out.println(a[0]);
 //  System.out.println(a[1]);
   
   //lower & uppercase
   s = "welcoME";
   System.out.println(s.toLowerCase());
   System.out.println(s.toUpperCase());
		   
	}

}
