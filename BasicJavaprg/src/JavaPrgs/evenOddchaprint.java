package JavaPrgs;

public class evenOddchaprint {

	public static void main(String[] args) {

		String b ="saibzranas";
		char[] pot =b.toCharArray();
		int gh = pot.length;
		System.out.println("char length "+gh);
		if(gh%2==0) {
			int bv = gh/2;
			System.out.println(pot[bv-1]+" "+pot[bv]);
		}else
			if(gh%2==1) {
				int br=gh/2;
				System.out.println(pot[br]);
			}
		
	}

}
