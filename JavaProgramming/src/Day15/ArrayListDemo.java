package Day15;

import java.util.ArrayList;


	public class ArrayListDemo
	{
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ArrayList mylist = new ArrayList();
         //  List mylist= new ArrayList();
           
           
           
           mylist.add(null);
           mylist.add(true);
           mylist.add(10.5);
           mylist.add(true);
           mylist.add("welcome");
           mylist.add(100);
           mylist.add(100);
           
           System.out.println(mylist.size());
           System.out.println(mylist);
           System.out.println(mylist.remove(2));
           System.out.println("After remoing list: "+ mylist);
           
           mylist.add(2, "java");
           System.out.println("after insertion: " +mylist);
           
           System.out.println(mylist.get(5));
           mylist.clear();
           System.out.println("after clearing values: "+mylist);
           
           
	}

}
