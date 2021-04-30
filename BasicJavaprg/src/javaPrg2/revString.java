package javaPrg2;

public class revString {

	public static void main(String[] args) {
		String br = "Venkata sai Pavan";
//		char[] bv =br.toCharArray();
		String[] bv = br.split(" ");
		int h = bv.length;
		String nm = "";
		for(int i=h-1;i>=0;i--) {
			
			nm = nm+bv[i]+" ";
			
		}
System.out.print(nm);
	}

}
