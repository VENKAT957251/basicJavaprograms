package javaOOPS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class arraylistconsepts {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("venkat");
		names.add("sai");
		names.add("pavan");
		names.add("apple");
//		names.remove("apple");
		names.remove(3);
		for (String names1 : names) {
			System.out.print(names1 + " ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------");
		Collections.sort(names);

		for (String bmw : names) {
			System.out.print(bmw + " ");
		}
		System.out.println();
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("\n"+names);
		
		String[] arr = new String[names.size()];
		System.out.println("----------------------------------------------------");
		System.out.println(Arrays.toString(names.toArray(arr)));
		for(String ytt : arr) {
			System.out.println(ytt);
		}
			
	}

}
