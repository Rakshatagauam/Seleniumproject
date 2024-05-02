package Day7;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "abcd";
 String res= ""
 		+ "";
 // System.out.println(str.length());
 int len= str.length(); 
 
  for(int i = len-1; i>=0;i--)
  {
	  res= res+str.charAt(i);
  }
  System.out.println("  "+ res);
	}

}
