package JavaPrgs;

public class OverRide {

	public static void main(String[] args) {
		
		//ParentClass parentClass =new ParentClass();
	    //parentClass.firstName("Maveric");
	    
	    new ChildClass().firstName("Maveric");
	    
	}
	
}

class ParentClass{
    
    void firstName(String name) {  //Same method name with same argument
        System.out.println("This is a Parent class");
        System.out.println("-----parent class function execution start---");
        System.out.println("parent string is:"+name);
        System.out.println("-----parent class end----");
    }
    
    void firstName(int x) {
    	int a=4,b;
    	b=a+x;
    	System.out.println();
    System.out.println("------------");
    	System.out.println(b);
    	System.out.println("------------");
    }
    
}
class ChildClass extends ParentClass{
   void firstName(String name) { 
       //Same method name with same argument
	   System.out.println("---child class start---");
       super.firstName("--childclass--hi this is used super key word used to call Parent Method--");
       System.out.println("----This is a child class end ----");
       System.out.println(name);
       super.firstName(5);
        
//       firstName("Pavan");
    }
}


