package OOP_Week2;

public class MontainBike extends Bicycle{
	
	public int seatHeight;
	
	public MontainBike(int startcadence, int startgear, int startspeed, int startheight) {
		
		super(startcadence, startgear, startspeed);
		seatHeight = startheight;
	}
	
	public void setHeight(int newval) {
		seatHeight = newval;
	}
	
}
