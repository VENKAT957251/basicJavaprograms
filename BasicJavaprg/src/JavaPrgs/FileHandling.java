package JavaPrgs;
import java.io.*; 
public class FileHandling {

	public static void main(String[] args) throws IOException {
		
		
				String s = "I am from Maveric Systems private Ltd";
				String s12 = "my name is Pavan";
				String s2 = "My id is 3930";
				String s3 = "joined date is 18/Mar/2019";
		
		    FileWriter writer = new FileWriter("C:\\eclipse-workspace\\BasicJavaprg\\Mydetais.txt");  
		    BufferedWriter buffer = new BufferedWriter(writer);  
		    buffer.write(s);
		    buffer.newLine();
		    buffer.write(s12);
		    
		    buffer.newLine();
		    buffer.write(s2);
		    
		    buffer.newLine();
		    buffer.write(s3);
		    
		    buffer.close();  
		    
		    
		    System.out.println("Success");  
		    
		    BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("C:\\eclipse-workspace\\BasicJavaprg\\Mydetais.txt")));
		     
		    String line  = bufferedReader.readLine();
//		System.out.println(line);
		
		while( (line = bufferedReader.readLine() ) != null) {
		    System.out.printf(line+"\n");
		}
		
		
		bufferedReader.close();

	}

}
