package LeapYear;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number of years to test");
		int num = scan.nextInt();
		
		for (int i = num; i > 0; --i) {
			System.out.println("\nPlease enter a year of your choice");
			
			int year = scan.nextInt();
			boolean result = isLeapYear(year);
			
			if (result) {
				System.out.println("This is a leap year.");
				
			}
			else {
				System.out.println("This isn't a leap year.");
			}
			
		}

	}
	public static boolean isLeapYear(int year) {
		
		if (((year % 4) == 0) && !((year % 400 ) == 0)) {
			
			if (((year / 100) < 10 )) {
				return false;
			}
			else {
				return true;
			}
		}
	
		return false;
	}

}
