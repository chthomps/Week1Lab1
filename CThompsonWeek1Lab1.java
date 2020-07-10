
Exercise 2

GradeAvg.java

//A program that averages quiz scores and test scores.
public class GradeAvg {

	public static void main(String[] args) {
		
		//Quiz scores initialized
		double quizScore1 = 85;
		double quizScore2 = 90.5;
		double quizScore3 = 74.5;
		
		//Quiz scores averaged
		double quizScoreAvg = (quizScore1 + quizScore2 + quizScore3)/3;
		
		
		
		//Test scores initialized
		double testScore1 = 82.7;
		double testScore2 = 88.2;
		
		//Test scores averaged
		double testScoreAvg = (testScore1 + testScore2)/2;
		
		
			//Printout of both quiz and test averages
			System.out.println("Quiz Average = " + quizScoreAvg + "%");
			System.out.println("Test Average = " + testScoreAvg + "%");
				

	}

}

Exercise 3

AgeGuess.java


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

Exercise 4

TimeComp.java

// Program reading a number of seconds input and converting to hours, min, sec values

import java.util.Scanner;


public class TimeComp {

	public static void main(String[] args) {
		
// define variables
		int seconds;
		int hours;
		int minutes;
		int remainder;
	
// prompt seconds input from user
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter a whole number of seconds: ");
		seconds = scan.nextInt();
		
// calculating hours, min, sec
		hours = seconds/3600;
		remainder = seconds%3600;
		minutes = remainder/60;
		remainder = remainder%60;
		seconds = remainder;
		
		
		System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
		
		
	}

}
