package JavaPrgs;

//import jdk.internal.org.jline.utils.Log;

public class MathsPow {

	public static void main(String[] args) {
		
		
		
		double c = Math.pow(2, 3);
//		Log.info(c);
		System.out.println(c);
		double y = Math.pow(0, 0);
		System.out.println("y  is "+y);
		
		int g = mod(50,0);
		System.out.println("g is = "+g);
		int lm = mod(3,2);
		System.out.println("lmn  == "+lm);
		int n = mod(23,6);
		System.out.println(n);
		

	}
	
	public static int mod(int number1, int number2) throws ArithmeticException  {
		
		  try {
		  int c=number1%number2;
	      return c;
		  }
		  catch(ArithmeticException e){
				System.out.println("number dividend can't be devided by 0 ");
			}
		return number2;
				
	   }

}
