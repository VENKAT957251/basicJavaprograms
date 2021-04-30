package practiceJavaprgs;


import java.util.*;
//import java.util.Arrays;

public class arrayTOarraylist {

	public static void main(String[] args) {
		// convering array to arralist
//https://www.javatpoint.com/testng-annotation-attributes
		String[] arr = {"Venkat","sai","Venkatasaipavamn","pavan"};
//		System.out.println(Arrays.toString(arr));
		//https://www.geeksforgeeks.org/conversion-of-array-to-arraylist-in-java/
		//Exception in thread "main" java.lang.UnsupportedOperationException
//		 List lst = Arrays.asList(arr); 
		List<String> lst = new ArrayList<String>(Arrays.asList(arr));
		System.out.println(lst);
		lst.add("mahesh");
		lst.add("patturaj");
		System.out.println(lst);

		
	}

}
