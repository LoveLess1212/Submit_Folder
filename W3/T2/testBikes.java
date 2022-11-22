import java.util.Objects;

public class testBikes {
    static class Bicycle implements Cloneable{
        int gear,cadence,speed;
        public Bicycle(int startCadence, int startSpeed, int startGear) {
            this.gear =startGear;
            this.cadence =startCadence;
            this. speed = startSpeed;
        }

        public void printDescription(){
            System.out.println("\nBike is " + "in gear " + this.gear
                    + " with a cadence of " + this.cadence +
                    " and travelling at a speed of " + this.speed + ". ");
        }
        public Object clone() throws CloneNotSupportedException{
            return super.clone();
        }
    }
    public static class  RoadBike extends Bicycle{
        // In millimeters (mm)
        private int tireWidth;

        public RoadBike(int startCadence,
                        int startSpeed,
                        int startGear,
                        int newTireWidth){
            super(startCadence,
                    startSpeed,
                    startGear);
            this.setTireWidth(newTireWidth);
        }
        public int getTireWidth(){
            return this.tireWidth;
        }

        public void setTireWidth(int newTireWidth){
            this.tireWidth = newTireWidth;
        }

        public void printDescription(){
            super.printDescription();
            System.out.println("The RoadBike" + " has " + getTireWidth() +
                    " MM tires.");
        }
    }
    public static class MountainBike extends Bicycle {
        private String suspension;

        public MountainBike(
                int startCadence, int startSpeed, int startGear, String suspensionType) {
            super(startCadence, startSpeed, startGear);
            this.setSuspension(suspensionType);
        }

        public String getSuspension(){
            return this.suspension;
        }

        public void setSuspension(String suspensionType) {
            this.suspension = suspensionType;
        }

        public void printDescription() {
            super.printDescription();
            System.out.println("The " + "MountainBike has a " +
                    getSuspension() + " suspension.");
        }


    }
    public static void main (String []args) throws CloneNotSupportedException{
        Bicycle bike01, bike02, bike03;

        bike01 = new Bicycle(20, 10, 1);
        bike02 = new MountainBike(20, 10, 5, "Dual");
        bike03 = new RoadBike(40, 20, 8, 23);

        bike01.printDescription();
        bike02.printDescription();
        bike03.printDescription();
        ((MountainBike) bike02).setSuspension("Single");
        System.out.println("Bike 02 now has " + ((MountainBike) bike02).getSuspension() +" Suspension");
        Bicycle bike5 = (Bicycle) ((RoadBike) bike03).clone();
        bike5.printDescription();
        System.out.println("is bike5 equals bike03: " + Objects.equals(bike5,bike03));
        System.out.println("GetClass bike5: " + bike5.getClass());
        System.out.println("ToString bike5: " + bike5.toString());
        System.out.println("Hashcode bike5: " + bike5.toString());
        System.out.print("check if bike5 is instance of Mountainbike: ");
        System.out.println(bike5 instanceof MountainBike);
        System.out.print("check if bike5 is instance of RoadBike: ");
        System.out.println(bike5 instanceof RoadBike);
    }
}
