package MyAssignments;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
		//get input from user
		Scanner ui = new Scanner(System.in);
		Scanner ui2 = new Scanner(System.in);
		
	//ask the question:what is your name?
		System.out.println("what is your name?");
		String name = ui.nextLine();
		System.out.println("My name is: " + name);
		System.out.println();		
		
		
	//ask the question:How old are you?
		System.out.println("How old are you?");
		int age = ui2.nextInt();
		System.out.println("I am " + age + " years old");
		System.out.println();		
		
		
	//ask the question:What is your gender?
		System.out.println("What is your gender?");
		String gender = ui.nextLine();
		System.out.println();		
		
		
	//ask the question:Where are you from?
		System.out.println("Where are you from?");
		String location = ui.nextLine();
		System.out.println("I am orginally from " + location );
		System.out.println();		
		
		
		
	//ask the question:Where do you live now?
		System.out.println("Where do you live now?");
		String currentlocation = ui.nextLine();
		System.out.println("I currently live " + currentlocation );
		System.out.println();		
		
		
	//ask the question:Where do you work?	
		System.out.println("Where do you work");
		String job = ui.nextLine();
		System.out.println("I work at  " + job );
		System.out.println();		
		
		
   //ask the question:What is your job role?	
		System.out.println("What is your job role?");
		String jobrole = ui.nextLine();
		System.out.println();		
		
		
   //ask the question:What is your salary?	
		System.out.println("What is your salary?");
		Double salary = ui2.nextDouble();
		System.out.println("I make  " + salary + " dollar" );
		System.out.println();		
		
		
		
   //ask the question:How much raise are you getting next year?
		System.out.println("How much raise are you getting next year?");
		Double salaryrise = ui2.nextDouble();
		System.out.println("I will get  " + salaryrise + " as annual raise");
		System.out.println();		
			
		
		
	//based on part 1, print paragraph.	
		System.out.print("My name is " + name +".");
		System.out.print(" I am " + age + " years old, "); 
		System.out.print(gender + ".");
		System.out.print(" I work at " + job );
		System.out.print(" as " + jobrole + ".");
		System.out.println("I currently live " + currentlocation + "." );
		System.out.print("I am orginally from " + location + ".");
		System.out.println("I make " + salary + " dollar" + "." );
		System.out.print("I will get " + salaryrise + " as annual raise");
		System.out.println(", so my total salary would be "+ Double.sum(salary, salaryrise) +" dollar next year.");
    
		ui.close();
		ui2.close();
		
	}

}
