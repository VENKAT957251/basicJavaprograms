package JavaPrgs;

import java.lang.reflect.Array;

//import java.sql.Array;

public class Arrays {

	public static void main(String[] args) {
		
		Object[][] pavan = {{"My name","is","Venkata"},{"Pavan","I am from Kuppam",null}};
		
		Object jk = pavan[0][2];
		int length = Array.getLength(pavan);
		System.out.println("array length:"+length);
		
		System.out.println("jk[0][2]:"+jk);
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<=2;j++) {
		System.out.println(pavan[i][j]);
		}

		}

	}
}
