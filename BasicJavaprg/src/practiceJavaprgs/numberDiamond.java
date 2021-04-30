package practiceJavaprgs;

public class numberDiamond {

	public static void main(String[] args) {
		
		/*for(int i=1;i<=5;i++) {
			for(int k=0;k<i+1;k++) {System.out.print(" ");}
			for(int j=1;j<=5-i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();*/
			
		for(int i=1;i<=5;i++) {
			for(int k=5;k>=i;k--) {System.out.print(" ");}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		
		
		}

	}

}
