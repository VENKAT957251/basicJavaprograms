package practiceJavaprgs;

import java.util.Arrays;

public class FinalyExmaple {

	public static void main(String[] args) {
		try {

			try {
				int[] a = new int[5];
				a[5] = 4;
				System.out.println(Arrays.toString(a));
				
			} catch (ArrayIndexOutOfBoundsException e) {

				System.out.println("Out Of Range");
				System.out.println(e.toString());
			} finally {
				System.out.println("Finally Outof Range Block");
			}

			try {
				int x = 20 / 0;
			} catch (ArithmeticException e) {
				System.out.println("/by Zero");

			} finally {
				System.out.println("FINALLY IN DIVIDES BY ZERO");
			}
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("FINALLY IN EXCEPTION BLOCK");
		}
		System.out.println("COMPLETED");

	}
}