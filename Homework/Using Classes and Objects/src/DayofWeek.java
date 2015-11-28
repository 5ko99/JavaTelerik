import java.util.Calendar;

public class DayofWeek {
	
	public static void main(String[] args){
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		switch(day){
			case 1: System.out.println("Sunday"); break;
			case 2: System.out.println("Monday"); break;
			case 3: System.out.println("Thuesday"); break;
			case 4: System.out.println("Wednesday"); break;
			case 5: System.out.println("Thursday"); break;
			case 6: System.out.println("Friday"); break;
			case 7: System.out.println("Saturday"); break;
		}
	}
}
