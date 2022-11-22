
import java.util.*;
interface Relatable{

    public int isLargerThan(Relatable other);

}
public class RectanglePlusDemo {
    public static class Point {
        public int x = 0;
        public int y = 0;
        //constructor
        public Point(int a, int b) {
            x = a;
            y = b;
        }
        public Point(){
            x = 0;
            y = 0 ;
        }
    }
    public static class RectanglePlus
            implements Relatable,Cloneable {

        public int width = 0;
        public int height = 0;
        public Point origin;

        // four constructors
        public RectanglePlus() {
            origin = new Point(0, 0);
        }
        public RectanglePlus(Point p) {
            origin = p;
        }
        public RectanglePlus(int w, int h) {
            origin = new Point(0, 0);
            width = w;
            height = h;
        }
        public RectanglePlus(Point p, int w, int h) {
            origin = p;
            width = w;
            height = h;
        }

        // a method for moving the rectangle
        public void move(int x, int y) {
            origin.x = x;
            origin.y = y;
        }

        // a method for computing
        // the area of the rectangle
        public int getArea() {
            return width * height;
        }

        // a method required to implement
        // the Relatable interface
        public int isLargerThan(Relatable other) {
            RectanglePlus otherRect
                    = (RectanglePlus)other;
            if (this.getArea() < otherRect.getArea())
                return -1;
            else if (this.getArea() > otherRect.getArea())
                return 1;
            else
                return 0;
        }
        public Object clone() throws CloneNotSupportedException{
            return super.clone();
        }

    }

    public static void main (String[] args) throws CloneNotSupportedException{
        RectanglePlus o1 = new RectanglePlus();

        Point pointO2 = new Point(1,1);
        RectanglePlus o2 = new RectanglePlus(pointO2);
        RectanglePlus o3 = new RectanglePlus(1,1);
        Point pointO4 = new Point(2,2);
        RectanglePlus o4 = new RectanglePlus(pointO4,3,2);
        System.out.println("Area of Object 4 is: "+ o4.getArea());
        int a = o4.isLargerThan(o3);
        if(a == 1) System.out.println("o4 Is Larger than o3");
        if (a ==0) System.out.println("o4 Is Equal o3");
        if (a == -1) System.out.println("o4 is smaller than o3");
        System.out.println("Object o3: "+Objects.toString(o3));
        RectanglePlus o5 = (RectanglePlus) o3.clone();
        System.out.println("Object o5: "+ Objects.toString(o5));
        System.out.println("o4 = o3 ?:" + Objects.equals(o3,o5)); // will be flase bcs the address of the point is diff
        System.out.println("Hash code of o1: "+ Objects.hashCode(o1));
        System.out.println("Class of o2: " + o2.getClass());
    }

}
