package OOP_Week2;

public class Rectangle {
	
	public int width;
	public int height;
	public Point originPoint;
	
	// In tHis case we will create 4 constructor
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
		originPoint = new Point(0, 0);
	}
	
	public Rectangle(Point p) {
		originPoint = p;
	}
	
	public Rectangle(int w, int h) {
		
		originPoint = new Point(0, 0);
		width = w;
		height = h;
	}
	
	public Rectangle(Point p, int w, int h) {
		
		originPoint = p;
		width = w;
		height = h;
	}
	
	// Methode for mooving the Rectangle
	
	public void moov(int x, int y) {
		originPoint.x = x;
		originPoint.y = y;	
	}
	
	// a method for computing the area of the rectangle
	public int getArea() {
		return width * height;
	}

}
