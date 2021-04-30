package javaPrg2;

import java.util.Arrays;

public class Anegram {

	public static void main(String[] args) {
		
		String gf = sort("pavan");
		String hj =sort("navap");
		System.out.println("gf-->"+gf+";"+"hj-->"+hj);
		if(gf.equalsIgnoreCase(hj)) {
			System.out.println("String is Anegram");
			
		}
		else {
			System.out.println("strings are not an anegram");
		}
			
		
	
		/*
        if("aanpv".equalsIgnoreCase(str)) {
        	System.out.println("Anegram");
        }
        */
	}

	public static String sort(String str1) {
		
		// convert input string to char array 
        char[] tempArray = str1.toCharArray(); 
          
        System.out.println(tempArray.length);
        // sort tempArray 
        Arrays.sort(tempArray); 
          
        // return new sorted string  
        //System.out.println("temp in array format"+tempArray);
        String str = String.valueOf(tempArray);
		return str;
	}
	

}
