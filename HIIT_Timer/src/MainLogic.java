
public class MainLogic {
	
	//variables needed
	/*
	 * Caveat: This timer will not go above 60 minutess
	 * 
	 * Name of Timer
	 * 
	 * Number of seats
	 * 
	 * High Intensity
	 * 	Start Timer: 1:00
	 * 		Minutes, Seconds
	 * 		(Time Object)
	 * 
	 * Low Intesity
	 * 	Start Timer: 2:00
	 * 		Minutes, Seconds
	 * 		(Time Object)
	 */
	
	public Time highIntensity, lowIntensity;
	
	public MainLogic(Time high, Time low){
		highIntensity = high;
		lowIntensity = low;
		
	}

	public void start(){
		System.out.println("Program is now running");
	}
}
