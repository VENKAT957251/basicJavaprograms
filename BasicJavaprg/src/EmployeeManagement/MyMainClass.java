
package EmployeeManagement;


// Pig "implements" the Animal interface
class Pig implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}

public class MyMainClass {
  public static void main(String[] args) {
		
		  Pig myPig = new Pig(); // Create a Pig object myPig.animalSound();
		  myPig.sleep();
		 myPig.animalSound();
	  System.out.println("******************************");
	  System.out.println("******************************");
	  System.out.println("******************************");
		 Animal obj = new Pig();
		 obj.sleep();
	  obj.animalSound();
	  
  }
}

interface Animal {
	  public void animalSound(); // interface method (does not have a body)
	  public void sleep(); // interface method (does not have a body)
	}