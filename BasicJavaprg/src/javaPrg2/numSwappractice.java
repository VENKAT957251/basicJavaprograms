package javaPrg2;

import java.util.Scanner;

public class numSwappractice {

	public static void main(String[] args) {
		
		
		int x,y,temp;
		x=56;
		y=98;
		System.out.println("before swap \"x+y\""+x+y);
		temp=x;
		x=y;
		y=temp;
		int z=x+y;
		System.out.println(" \"z=x+y  is\" "+z+"\n"+"\"x+y is\":"+x+y);
		
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();in.close();
//		int c=x1+x2;
		System.out.println("before swap");
		System.out.println("bef swap"+a+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swaping");
		System.out.println("after swap"+a+b);
		

	}

}
