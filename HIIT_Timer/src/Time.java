
public class Time {
	private int minute;
	private int seconds;
	
	public Time(int minute, int second){
		setMinute(minute);
		setSeconds(second);
	}
	
	public Time(int second){
		setMinute(0);
		setSeconds(second);
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
