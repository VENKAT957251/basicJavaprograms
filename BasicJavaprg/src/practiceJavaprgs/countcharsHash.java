package practiceJavaprgs;

import java.util.HashMap;

public class countcharsHash {

	public static void main(String[] args) {
	
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		String hj = "BRVenkatasaipavan";
		String[] nm = hj.split("");
		for(int i=0;i<nm.length;i++) {
			if(map.containsKey(nm[i])) {
				int k = map.get(nm[i]);
				map.put(nm[i], k+1);
				
			}else {
				map.put(nm[i], 1);
			}
				
			
		}
		System.out.println(map);
		
	}
	
	
}
