package JavaPrgs;

public class stringOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		String txt = "My name is Saipavan";
		System.out.println("caps is :"+txt.toUpperCase());
		System.out.println("index at "+txt.charAt(5));
		System.out.println("lowe case : "+txt.toLowerCase());
		System.out.println("locate:"+txt.indexOf("Sai"));
		System.out.println("sai".concat("Pavan"));
		System.out.println("\"Venkata sai pavan\""+" "+"10/111");
		StringBuffer ds = new StringBuffer("MarseOrbiorMission");
		System.out.println("rev:"+ds.reverse());
		System.out.println(ds.append("is very inspiration"));
		System.out.println(ds);
		System.out.println(ds.reverse());
		System.out.println(ds.capacity());
		System.out.println(ds.replace(0, 16, "I love MARS"));
		
		
		String[] word1= "Venkata sai pavan".split(" ");
        int b = word1.length;
        System.out.println("length of b is:"+b);
        String bn = word1[0];
        System.out.println(bn.charAt(2));
        
	}

}
