import java.util.Scanner;
class DayNumber {
	
	public static void main(String args[]) {
	
		Scanner scan = new Scanner(System.in);
		// Enter month
		String month = scan.next();
		// Enter date
		int date = scan.nextInt();
		
		int day = 0;
		switch (month) {
			case "January":
			    day = date;
			    break;
			case "February": 
			    day = 31 + date;
			    break;
		// Write the rest of the logic
		    case "March":
		        day = 31 + 28 + date;
		        break;
			}
		
		// From the day number of the year, finding the day no. of the week
		int dayNumber = day % 7;
		// recall, day 1 is Monday
		
		if (dayNumber == 6 && dayNumber == 7) {
			System.out.print("Hurray!");
		} else {
			System.out.print("Ohhh! It's a work day :|");
		}
		
		scan.close();
		
		
	}
	
}