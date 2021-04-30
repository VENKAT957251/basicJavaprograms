package javaOOPS;

class B {
	String a;
	int b;
// copy constructor
	
//	  B(String t, int u){ 
	  B(){ 
		  a="pavan"; b=78;
//		  this.a=t;
//		  this.b=u;
	  System.out.println("inside main constructor");
//	  System.out.println(a+" "+b);
	  }
	  B(B ref){
		  System.out.println("inside reference costructor");
		  a=ref.a;
		  b=ref.b;
//		  System.out.println(a+" "+b);
	  }
	  void display(){
		  System.out.println("in display method "+a+" "+b);
	  }
}

class A {

	public static void main(String[] args) {
//		B ref = new B("pavan",78);
		B ref = new B();
		
		ref.display();
//		System.out.println(ref.a + " " + ref.b);
		B pupet = new B(ref);
		pupet.a="Venkata sai Pavan";
		pupet.b=100;
		System.out.println("after passing diff data");
		pupet.display();
	}
}