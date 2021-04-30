package JavaPrgs;

public class StringDup {

	public static void main(String[] args) {
		
		
		String S= "I know Java and Selenium";
		char[] charArray = S.toCharArray();
		int y = charArray.length;
		System.out.println("given string is =="+S);
		for(int i=0;i<y;i++) {
		
			for(int j=i+1;j<y;j++) {
				
				if(charArray[i]==charArray[j]) {
					
					System.out.print(charArray[j]+" ");
					break;
					
				}
			}
			
		}
		
						

	}

}
