package Day15;

import java.util.HashMap;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // HashMap hp= new HashMap();
     // Map hm= new HashMap();
     
     HashMap<Integer, String> hp = new HashMap<Integer, String>();
     hp.put(101, "john");
     hp.put(102, "alex");
     hp.put(103, "david");
     hp.put(101, "nick");
     hp.put(105, "donner");
     
     System.out.println(hp);
     
     System.out.println(hp.size());
     hp.remove(101);
     System.out.println("after removing values: " +hp);
     System.out.println(hp.size());
     
     System.out.println(hp.get(103));
     System.out.println(hp.keySet());
     
     hp.clear();
     System.out.println("after removing: "+hp);
     System.out.println();
     
	}

}
