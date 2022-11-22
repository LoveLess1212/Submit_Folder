package OOP_Week2;

public class mainII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point dotPoint = new Point(11, 21);
		Rectangle rect2 = new Rectangle(dotPoint, 55, 72);
		
		System.out.println("Width of the Rect " + rect2.width);
		System.out.println("Height of the Rect " + rect2.height);
		System.out.println("Area of the Rect " + rect2.getArea());
		
		// Set the Position
		rect2.originPoint = dotPoint;
		System.out.println("Position x of the Rect2 " + rect2.originPoint.x);
		System.out.println("Position y of the Rect2 " + rect2.originPoint.y);
		
		//moov The Rectangle
		
		rect2.moov(22, 42);
		System.out.println("Position x of the Rect2 " + rect2.originPoint.x);
		System.out.println("Position y of the Rect2 " + rect2.originPoint.y);
		
		


	}

}
