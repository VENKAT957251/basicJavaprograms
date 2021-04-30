package JavaPrgs;

public class InterfaceClass implements M,N{

 	@Override
	public void display() {
		// TODO Auto-generated method stub
		M.super.display();
		N.super.display();
	}
	
//	public void display() {
//		System.out.println("My name is pavan");
//	}
//	
	
	public static  void main(String[] args) {

		InterfaceClass jk = new InterfaceClass();
		
//		jk.display();
		
		jk.display();
		
	}



//	public  void display1() {
//		// TODO Auto-generated method stub
//		System.out.println("dispaly1");
//	}
	
	
	
}

interface M{
	
	  default void display() {
	
	  
		System.out.println("M is MOM");
	}
}

interface N{
	
	default void display() {
		System.out.println("N is NON");
	}
}

