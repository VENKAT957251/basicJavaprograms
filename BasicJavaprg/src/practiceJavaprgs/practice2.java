package practiceJavaprgs;

import java.util.Arrays;

public class practice2 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		char[] d = {'I','N','D','I','A'};
		int r[] = {1,3,4,5,6,7};
		r[3]=0;
//		d[3]='\u0000';
		System.out.println(d);
		System.out.println(d[3]);
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(r));
		//converting char array to string
		String str = new String(d);
		System.out.println(str);
		//converting char array to string in another method
		StringBuilder sb = new StringBuilder();
		/*for(int x=0;x<d.length;x++) {
			sb.append(d[x]);
		}
		String sb2=sb.toString();
		System.out.println(sb2);*/
		
		sb.append(d);
		System.out.println("sb.toString() is --->"+sb.toString());
		char[] kl = {' ','i','s'};
		sb.append(kl);
		
		System.out.println(sb.toString());
		System.out.println(sb.substring(-4));
	}

}
