package Day6;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  /* int a[][]= new int [3][2];
   a[0][1]= 100;
   a[0][2]= 200;
   a[1][0]= 300;
   a[1][1]= 400;
   a[2][0]= 500;
   a[2][1]= 600; */
	int a[][]= {{100,200},{300,400},{500,600}};
	System.out.println(a.length);
	System.out.println(a[0].length);
	System.out.println(a[1][1]);
	System.out.println(a[2][1]);
	/*for (int r=0;r<a.length;r++)
	{
		for(int c=0;c<a[r].length;c++)
	{
			System.out.println(a[r][c]); 
	} */
	//reading data from values using enhaced for loop
	//}
	for(int x[]:a)
	{
		for(int v:x)
		{
			System.out.println(v+" ");
		}
		System.out.println();
	}	
		
}
}
   
   
   
	


