package Day6;

public class ObjecttTypeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Object ob[]= new Object[5];
   ob[0]= 100;
   ob[1]= 10.5;
   ob[2]= 'A';
   ob[3]= "Testing course";
   ob[4]= true;
   /* for(int i=0;i<ob.length;i++)
   {
	   System.out.println(ob[i]);
   } */
   for(Object x:ob)
   {
	   System.out.println(x);
   }
	}

}
