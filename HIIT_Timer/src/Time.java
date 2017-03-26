
public class Time {
	private int minute;
	private int seconds;
	private boolean containsMinutes;
	public Time(int minute, int second){
		setMinute(minute);
		setSeconds(second);
		containsMinutes = true;
	}
	
	public Time(int second){
		setMinute(0);
		setSeconds(second);
		containsMinutes = false;
	}
	
	public boolean containsMinutes(){
		return containsMinutes;
	}
	public void setMinute(int minute){
		this.minute = minute;
	}
	
	public void setSeconds(int seconds){
		this.seconds = seconds;
	}
	
	public int getMinute(){
		return minute;
	}
	
	public int getSeconds(){
		return seconds;
	}
	
}
