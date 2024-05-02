package Day28;

import java.util.Arrays;

public class FindSmallerNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {500,300, 50,200,100};
        
       Arrays.sort(a);
        
       /* for(int v: a)
        {
        	System.out.println(v);
        }
        */
       System.out.println("smallest number: "+a[0]);
       
       System.out.println("$"+ a[0]);
       
       String price= "$200.98";
       String price1= price.replace("$", "");
       System.out.println(Double.parseDouble(price1));
	}

}
