package Day15;

import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HashSet myset= new HashSet();
         myset.add(100);
         myset.add(true);
         myset.add("java");
         myset.add(100);
         myset.add(null);
         myset.add(200);
         myset.add(null);
         
         System.out.println(myset);
         System.out.println(myset.size());
         
	}

}
