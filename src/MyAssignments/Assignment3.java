package MyAssignments;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		
		//Ask the USER for a string
		Scanner ui = new Scanner(System.in);
		System.out.println("Please enter a String:");
		String a = ui.nextLine();
		
		
		//Convert that string to all uppercase and print it
		 System.out.println(a.toUpperCase());
		 
		 
		 //Print the length of that string
		 int result = a.length();
		 System.out.println(result);
		 
		 
		 //Replace 'O' with 'Z'
		 String d = a.toUpperCase();
		 System.out.println(d.replace("O","Z"));
		 

		// Give the last char of the string
		 String b = d.replace("O","Z");
		 char x = b.charAt(b.length()-1);
		  System.out.println(x);
		  
		  
		  //Concatenate the string from step 1 with string "Test"
		  String t = "Test";
		  String value = a.concat(" ").concat(t);
		  System.out.println(value);
		  
		  ui.close();
		  
	}

}
