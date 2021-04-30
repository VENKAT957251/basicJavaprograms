package javaOOPS;

 class Shape {
	
	
	 void display() { System.out.println("shape is not recognized in main"); }  
	 void dips2() {
		 System.out.println("disp2 content in main super class");
	 }
	 void display(String a,String b) {
		 System.out.println("method over loading in main super class string type");
		 System.out.println(a+b);
	 }
	 void display(int x,int v) {
		 System.out.println("method over loading in super class int type");
		 int c = x+v;
		 System.out.println("c values is "+c);
	 }
}

 class square extends Shape{
	 @Override
	
	  void display() { System.out.println("executing square class, sub class programs");
	  System.out.println("shape is Square"); }
	 
		void display(int w,double i) {
			double h =w-i;
			System.out.println("method over loading in square class i.e.,sub class \n and object in reg to sub class and constructor also square class");
			System.out.println("display in sub class h= "+h);
			
		}
	 
	 void pavan() {
		 System.out.println("My name is Pavan");
	 }
 }
 class Demo extends Shape{
	@Override
	void dips2(){
		System.out.println("executing sub class of Shape that is Demo");
		 System.out.println("disp2 in Demo sub class");
	 }
	

	 
	 public static void main(String[] args) {
		 
		 Shape ub = new square();
		 square ub1 = new square();
		 Shape ub3 = new Demo();
//		 ub.display();
//		 ub.dips2();
//		 System.out.println("executing sub class shape's in main method");
//		 ub1.pavan(); 
		 System.out.println("ub3.display(in ub3 that is Demo() there is no display)  method");
		 ub3.display();
		 System.out.println("ub.dips(in ub that is in square class there is no dips)");
		 ub.dips2();
		 System.out.println();
		 ub3.dips2();
		 System.out.println();
		 ub1.display();
		 
		 System.out.println();System.out.println();
		ub.display("Venkata sai Pavan", "B R");
		System.out.println();System.out.println();
		ub.display(4, 12);
		System.out.println();
		ub1.display(43, 2.43);
		
	} 
 }