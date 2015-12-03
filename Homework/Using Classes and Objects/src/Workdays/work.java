package Workdays;

import java.util.Date;
import java.util.Scanner;

public class work {
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
	 System.out.print("Enter day: ");
	 Scanner scanner = new Scanner(System.in);
	 Date date = new Date();
	 date.setDate(scanner.nextInt());
	 System.out.print("Enter mouth: ");
	 date.setMonth(scanner.nextInt());
	 System.out.print("Enter year: ");
	 date.setYear(scanner.nextInt());
	 Date date1 = new Date();
	 System.out.print("Enter day: ");
	 date1.setDate(scanner.nextInt());
	 System.out.print("Enter mouth: ");
	 date1.setMonth(scanner.nextInt());
	 System.out.print("Enter year: ");
	 date1.setYear(scanner.nextInt());
	 scanner.close();
	 int result = workdays.getWorkingDaysBetweenTwoDates(date, date1);
	 System.out.printf("Workdays betwean %s %s %s  and %s %s %s are %s days",date.getDay(),date.getMonth(),date.getYear(),date1.getDate(),date1.getMonth(),date1.getYear(),result);
 }
}
