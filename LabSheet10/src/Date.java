
public class Date {
	private int bMonth;
	private int bDay;
	private int bYear;
	
	Date(){
		bMonth = 1;
		bDay = 1;
		bYear = 1900;
	}
	Date(int month,int day , int year){
		bMonth = month;
		bDay = day;
		bYear = year;
	}
	public void setDate(int month,int day,int year) {
		bMonth = month;
		bDay = day;
		bYear = year;
	}
	public int getMonth() {
		return bMonth;
	}
	public int getDay() {
		return bDay;
	}
	public int getYear() {
		return bYear;
	}
	public String toString() {
		return bMonth + "-"+ bDay + "-" + bYear;
	}

}
