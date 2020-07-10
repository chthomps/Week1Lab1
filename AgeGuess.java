

import java.util.Scanner;

public class AgeGuess {

	public static void main(String[] args) {
		
		//Reads in a name (String) and an age guess (int) from the user and prints these.
		String name;
		int ageGuess;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the name of famous, living person: ");
		name = scan.nextLine();
	
		
		System.out.print("Enter your guess for " + name + "'s age:");
		
		ageGuess = scan.nextInt();
		
		System.out.println(name + ", " + ageGuess);
		

	}

}
