package OOP_Week2;

public class Bicycle {
	public int cadence;
	public int gear;
	public int speed;
	
	
	public Bicycle() {
		
	}	
	
		// Constructor
	
	public Bicycle(int startcadence, int startgear, int startspeed) {
		// TODO Auto-generated constructor stub
		cadence = startcadence;
		gear = startcadence;
		speed = startspeed;
		
	}
	
	// The class Bicycle has four method
	
//	public int  getCadence() {
//		return cadence;
//	}
	
	public void setCadence(int newvalue) {
		
		cadence = newvalue;
		System.out.println("The new value of the cadence is " + cadence);
	}
	
//	public int getGear() {
//		return gear;
//	}
	
	public void setGear(int newvalu) {
		gear = newvalu;
		System.out.println("The new value of the gear is " + gear);
		
	}
	
//	public int getSpeed() {
//		return speed;
//	}
	
	public void applyBrake(int decrement) {
		
		decrement -= decrement;
	}
	
	public void speedUp(int increment) {
		increment += increment;
		System.out.println("The Speed is increment to " + increment);
	}

}
