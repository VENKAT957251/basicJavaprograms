package JavaPrgs;

public class RandomeNumgenerator {

	public static void main(String[] args) {

		System.out.println(randomNum(10, 50));
		System.out.println(randomNum(10, 50));
		System.out.println(randomNum(10, 50));
		System.out.println(randomNum(2000, 2005));
		System.out.println(randomNum(300, 400));
		System.out.println(randomNum(600, 650));

			}
	
	
	public static String randomNum( int x,int y) {
		
		int min = x;  
		int max = y;  
		//Generate random double value from 200 to 400   
//		System.out.println("Random value of type double between "+min+" to "+max+ ":");  
		double a = Math.random()*(max-min+1)+min;   
//		System.out.println(a);  
		//Generate random int value from 200 to 400   
		System.out.println("Random value of type int between "+min+" to "+max+ ":");  
		int b = (int)(Math.random()*(max-min+1)+min);  
//		System.out.println(b);
		String str2 = Integer.toString(b);
		return str2;
}

}
