package OOP_Week2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bicycle radBicycle = new Bicycle(12, 7, 21);
		System.out.println(radBicycle.cadence + " " + radBicycle.gear + " " + radBicycle.speed);
	
		radBicycle.speedUp(5);
		radBicycle.setCadence(7);
		radBicycle.setGear(3);
		
		//Constructor 2
		Bicycle rad2 = new Bicycle();
		rad2.cadence = 2;
		rad2.gear = 4;
		rad2.speed = 6;
		System.out.println(rad2.cadence + " " + rad2.gear + " " + rad2.speed);
		
		
		// The class MontainBike
		
		MontainBike bike1 = new MontainBike(5, 8, 9, 2);
		System.out.println(bike1.cadence + " " + bike1.gear + " " + bike1.speed + " " + bike1.seatHeight);
		
		

	}

}
