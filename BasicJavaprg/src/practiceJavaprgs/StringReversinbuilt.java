package practiceJavaprgs;

public class StringReversinbuilt {

	public static void main(String[] args) {
		System.out.println(StringReversinbuilt.stringrev("venkataSaiPavan"));
		System.out.println("stringrev using bffer--->"+StringReversinbuilt.strrevs("ramanas"));
	
	
		StringBuilder sb = new StringBuilder("ragulsen");
		sb.replace(0, 5 , "Amh");
		sb.toString();
		System.out.println(sb);
		String revd = "manikandan";
		
		System.out.println(revd.toUpperCase());
		System.out.println(revd.substring(4));
	}
	
	public static String stringrev(String str) {
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		return  sb.toString();
		
	}

	public static String strrevs(String str) {
		
//		StringBuilder sb = new StringBuilder(str);
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		return  sb.toString();
		
	}
	
	
	
	
}
