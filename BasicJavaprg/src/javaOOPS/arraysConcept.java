package javaOOPS;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arraysConcept {

	public static void main(String[] args) {
	int a[] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
	int b[]= {5,1,4,2,6,3,8,5,9,10,-2,-3,-5,-6,-54,-32,0,-1,-2,-3,-4,-5};
	int y=a.length;
//	System.out.println("y: "+y);
		/*
		 * int i=0; while(((2*i))<y) { System.out.print(a[(2*i)]+" "); i++; }
		 */
					Arrays.sort(b);
					//normal for loop
					for(int x=0;x<b.length;x++) {
					System.out.print(+b[x]+" ");
					}
					System.out.println();
					
					//advanced for loop
					for(int element: b) {
						System.out.print(element+" ");
						}
					System.out.println();
					System.out.println(Arrays.toString(b));
					
	
				}

}
