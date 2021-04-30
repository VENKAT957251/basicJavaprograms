package JavaPrgs;

public class PolyMorphism {

	public static void main(String[] args) {
		
		new PolyMorphism().display("My name is sai pavan");
		new PolyMorphism().display(9, 89);

	}
	
	
	void display(String name) {
		System.out.println("the name is "+name);
		
	}
	
	
	void display(int a,int b) {
		System.out.println("the values a and b "+a+" "+b);
		
	}
	

}


