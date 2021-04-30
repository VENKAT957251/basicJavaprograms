package javaPrg2;

public class wordCountanddupCharcount {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		/*
		 * String input = "my name is venkata sai pavan"; String[] mom =
		 * input.split(" "); System.out.println("mom length"+mom.length);
		 * System.out.println("mom[3] lengt"+mom[3].length());
		 * System.out.println("charcount:"+input.length()); int charCount = 0; for(int i
		 * =0 ; i<input.length(); i++){ if(input.charAt(i) == 'a'){ charCount++; } }
		 * System.out.println("charCount:"+charCount);
		 * 
		 */

		String art = "he is good is but is bad but mad but chater";
		int count = 0;
		String[] comp = art.split(" ");
		for (int i = 0; i < comp.length; i++) {
			String bun = comp[i];
			if (bun.equalsIgnoreCase("is")) {
				count++;
			}
		}

		System.out.println("count:" + count);

		// new prg

		String str = "Bhanumathi";
		int i, j;
		char[] ch = str.toCharArray();
		int len = ch.length;
		System.out.println("count of len:" + len);
		for (i = 0; i < len; i++) {
			int counter = 0;
			char c = str.charAt(i);
			for (j = 0; j < len; j++) {
				if (c == ch[j]) {
					counter++;
					ch[j] = '\u0000';
				}
			}
			if (counter > 0)
				System.out.print(c + "=" + counter + " ");
		}

	}

}
