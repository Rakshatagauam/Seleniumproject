package Day6;

import java.util.Arrays;

public class SingleDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /*  int a[]= new int [5];
     a[0]=100;
     a[1]= 200;
     a[2]= 300;
     a[3]=400;
     a[4]=500; */
		
		int a[]= {100,200,300,400,500,600,700};
		System.out.println(a.length);
		System.out.println(a[3]);
		System.out.println(Arrays.toString(a));
		 /*for(int i=0;i<7;i++)
		{
			System.out.println(a[i]);
		} */
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
     
	}

}
