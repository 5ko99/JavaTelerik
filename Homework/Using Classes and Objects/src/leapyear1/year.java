package leapyear1;
public class year {
	public int year;
	
	public  int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public  year(int year){
		setYear(year);
	}
	
	public  year(){};
	
	public  boolean isLeap(){
		boolean result;
		if((this.getYear()%4==0)&&(this.getYear()%100!=0)){
			result=true;
			return result;
		}
		else{
			result=false;
			return result;
		}
	}
}
