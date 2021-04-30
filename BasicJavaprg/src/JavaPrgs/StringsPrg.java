package JavaPrgs;

public class StringsPrg {

	public static void main(String[] args) {
		
String htr ="my Name is ";

htr = htr.concat("Pavan");

System.out.println(htr.equals("my Name is Pavan"));
System.out.println(htr);
String[] ght = htr.split(" ");

String pav[] = htr.split(" ");

//htr.compareTo("aks");

System.out.println(ght[0].equals(pav[0]));
System.out.println("ght[0] is = "+ght[0]+"\n"+"pav[0] is = "+pav[0]);


		
		
		

	}

}
