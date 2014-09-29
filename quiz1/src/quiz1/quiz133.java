package quiz1;

import java.util.Scanner;
public class quiz133 {
	
	
	public static void main (String[] args) {

		Scanner userInputScanner = new Scanner(System.in);
		
		System.out.print("Enter number of touchdowns");
		int touchdowns = userInputScanner.nextInt();
		
		System.out.print("Enter the number of yards");
		int yards = userInputScanner.nextInt();
		
		System.out.print("Enter # of interceptions");
		int interceptions = userInputScanner.nextInt();
		
		System.out.print("Enter # of completions");
		int completions = userInputScanner.nextInt();
		
		System.out.print("Enter number of passes attempted");
		int attempts = userInputScanner.nextInt();
		
		
		double a = (((completions/attempts) -.3)*5);
		double b = (((yards/attempts)-3)*.25);
		double c = ((touchdowns/attempts)*20);
		double d = (2.375-(interceptions/attempts)*25);
		
		double rating = (((a+b+c+d)*100)/6);
		System.out.println(rating);
		
		
	}
		
}		


