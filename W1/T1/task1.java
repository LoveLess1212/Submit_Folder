package week1;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("Quadratic equation:\n");
				
				// declaration of variable
				int a, b, c;
				double delta;
				double x1 = 0;
				double x2 = 0;
				
				Scanner scan = new Scanner(System.in) ;
				System.out.println("value a = ");
				a = scan.nextInt();
				if (a == 0) {
					System.out.println("A muss größer als 0");
					System.exit(-1);
				}
				
				
				Scanner scan1 = new Scanner(System.in);
				System.out.println("value b = ");
				b = scan1.nextInt();
				
				Scanner scan2 = new Scanner(System.in);
				System.out.println("Value c = ");
				c = scan2.nextInt();
				
				System.out.println(a + "X^2 + " + b + "X +" + c + " = 0" + "\n");
				
				delta = b * b - 4 * a * c;
				
				if (delta < 0) {
					System.out.println("Root are Imaginary");
				}
				
				if (delta == 0) {
					
					x1 = -b / (2 * a);
					x2 = -b / (2 * a);
					
				}
				
				if (delta > 0) {
					System.out.println("Root are equal : \n");
					x1 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
					x2 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
				}
				
					
				System.out.println("X1 = " + x1);
				System.out.println("X2 = " +x2);

	}

}
