package JavaPrgs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class StringList {

	
	public static void main(String[] args) {
		
//		List<String> list = new ArrayList<>();
		Map<Integer,String> map =new LinkedHashMap();
		map.put(1, "Kuppam");
		map.put(2,"Chittor");
		map.put(3, "AndhraPradesh");
		
		System.out.println(map);
		
		
		
		map.forEach((k, v) -> {
	         System.out.format("key: %d and value: %s", k, v);
	         System.out.println();
	     });
		
		//key and value obly
		
		
		
		
		
		 System.out.println("**************only  Values**********");
	        Iterator itr1 =map.entrySet().iterator();
		while(itr1.hasNext()) {
            System.out.println(itr1.next());
        }
	       
	        System.out.println("**************Only keys**********");
	        Set<Integer> n = map.keySet();
	        Collection<String> m = map.values();
	        
	        System.out.println(n);
	        System.out.println(m);
	        
	        Iterator itr =map.keySet().iterator();
	        while(itr.hasNext()) {
	            System.out.println(itr.next());
	        }
	        }
		
		
		
		
		
//		iterator itr = map.
	
		
//		list.add("My name");
//		list.add("Pavan");
//		list.add("I am test Engineer");
//		list.add(null);
//		list.add("I am learning java");
//		list.add(null);
		
//		System.out.println(list.get(0));
//		System.out.println(list.size());
//		for (int i=0;i<(list.size())-1;i++) {
//			System.out.println("sring in array list is \t "+list.get(i));
//					}
		
		
		
		
		
		
		
		

	

}



