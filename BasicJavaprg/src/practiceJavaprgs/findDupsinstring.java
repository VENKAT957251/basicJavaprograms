package practiceJavaprgs;

public class findDupsinstring {

	public static void main(String[] args) {
		
		/*
		 * String str1= "venkatasaipavan"; char[] chr = str1.toCharArray(); for(int
		 * i=0;i<chr.length;i++) {
		 * 
		 * char c=str1.charAt(i); if(c==chr[i]) { System.out.print(c+" ");ch[j]='\u0000 } 
		 * }
		 */

		//new prg
		
		String str = "saias";
		int i,j;
		char[] ch = str.toCharArray();
		int len=ch.length;
//		System.out.println("count of len:"+len);
		for ( i = 0; i < len; i++) {
		int counter = 0;
		char c=str.charAt(i);
		for ( j = 0; j < len; j++) {
		if (c==ch[j]){
		counter++;
//		ch[j]='\u0000';
		
//		System.out.print("ch[j]"+ch[j]+" ");
		}
		}
		if(counter>0)System.out.print(c+"="+counter+" ");

		}
		
		
		
	}

}
