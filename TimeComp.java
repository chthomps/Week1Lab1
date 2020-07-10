
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
