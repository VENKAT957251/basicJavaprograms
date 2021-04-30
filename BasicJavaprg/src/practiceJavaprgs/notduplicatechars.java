package practiceJavaprgs;

public class notduplicatechars {

	public static void main(String[] args) {

		String name = "my name is pavan and i left company ";
		char[] yat = name.toCharArray();
		for (int i = 0; i < yat.length; i++) {
			char t = name.charAt(i);
			int m = 0;
			for (int j = 0; j < yat.length; j++) {

				if(t == yat[j] && t!=' ') {
					m++;
					yat[j] = '\u0000';
				}
			}
			
			  if (m ==1) System.out.print(t + " ");
			 
		}
	}
}
