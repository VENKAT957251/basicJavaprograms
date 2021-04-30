package javaPrg2;

import java.util.HashMap;

public class countWords {

	public static void main(String[] args) {
	
		String str = "venkata sai sai Sai pavan is my name Sai";
		String[] split = str.split(" ");
		
                HashMap<String,Integer> map = new HashMap<String,Integer>();
		for (int i=0; i<split.length; i++) {
			if (map.containsKey(split[i])) {
				int count = map.get(split[i]);
				map.put(split[i], count+1);
			}
			else {
				map.put(split[i], 1);
			}
		}
		System.out.println(map);
		System.out.println(map.get(split[4]));
		
	}

}
