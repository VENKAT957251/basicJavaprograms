package javaPrg2;

public class Stringlength {

	public static void main(String[] args) {
		int lengt=0;		
		String man ="sai Pavan";
		char[] chars = man.toCharArray();
		for (char c:chars) {
			lengt++;
		}
		System.out.println("lengt"+lengt);
	}

}
