package EmployeeManagement;

public class Interface extends Animal1   {

	public static void main(String[] args) {
		
		Interface ui = new Interface();
		ui.animalSound();
		
		
		
	}

	public void animalSound() {
		
		System.out.println("meaw sound");
		
	}
}





  abstract class Animal1{
  
  public abstract void animalSound();
  
  }
 
