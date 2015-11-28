package leapyear1;
import java.util.*;

public class LeapYear {
  public static void main(String[] args){
	  Scanner scanner = new Scanner(System.in);
	  year y = new year();
	  System.out.print("Enter year: ");
	  y.setYear(scanner.nextInt());
	  boolean isLeap=y.isLeap();
	  System.out.printf("Year:%s is Leap: %s",y.getYear(),isLeap);
	  
  }
}