package Enomeration;

public class DayofWeekRun implements IMovable {
	public static void main(String[] args){
		DayofWeek myday = DayofWeek.Thuesday;
		System.out.println(myday);
		myday=DayofWeek.valueOf("Monday");
		System.out.println(myday);
		
	}

	@Override
	public void changeColor(String color) {
		// TODO Auto-generated method stub
		
	}

}