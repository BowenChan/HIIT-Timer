import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Function;
import java.util.function.LongFunction;

import javax.swing.text.StyledEditorKit.ForegroundAction;

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
	public int rep;
	
	public MainLogic(Time high, Time low, int rep){
		Function<Time, Long> timeToMs = t -> (long) t.getSeconds() * 1000;
		highIntensity = high;
		lowIntensity = low;
		this.rep = rep;
		if(highIntensity.containsMinutes()){
			
		}
		else{
			long highIntensityMS = timeToMs.apply(highIntensity);
			System.out.println(highIntensityMS);
			long ms = System.currentTimeMillis();
			long msElapse = System.currentTimeMillis();
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Date date = new Date();
			Date tempDate = new Date();
			System.out.println(dateFormat.format(date));
			
			while(msElapse != highIntensityMS){
				msElapse = System.currentTimeMillis() - ms;
			
				if(msElapse % 1000 == 0 && !tempDate.equals(date))
				{
					date = new Date();
					System.out.println(dateFormat.format(date));
					tempDate = date;
				}
			}
			System.out.println(System.currentTimeMillis() - ms);
			date = new Date();
			System.out.println(dateFormat.format(date));
		}
	
	}
	
	
	public void start(){
		System.out.println("Program is now running");
	}
}
