import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2022
 * Problem: Jabuke
 * Link: https://open.kattis.com/contests/mjt68e/problems/jabuke
 * @author Phi Dinh Van Toan
 * @version 1.0, 25/10/2022
 *
 * Method : ???
 * Status : Accepted
 * Runtime: 0.102
 */

public class jabuke {
    static double area(double x1, double y1, double x2, double y2,
                       double x3, double y3)
    {
        return Math.abs((x1*(y2-y3) + x2*(y3-y1)+
                x3*(y1-y2))/2.0);
    }

    /* A function to check whether point P(x, y) lies
       inside the triangle formed by A(x1, y1),
       B(x2, y2) and C(x3, y3) */
    static boolean isInside(double x, double y,double x1, double y1, double x2,
                            double y2, double x3, double y3)
    {
        /* Calculate area of triangle ABC */
        double A = area (x1, y1, x2, y2, x3, y3);

        /* Calculate area of triangle PBC */
        double A1 = area (x, y, x2, y2, x3, y3);

        /* Calculate area of triangle PAC */
        double A2 = area (x1, y1, x, y, x3, y3);

        /* Calculate area of triangle PAB */
        double A3 = area (x1, y1, x2, y2, x, y);

        /* Check if sum of A1, A2 and A3 is same as A */
        return (A == A1 + A2 + A3);
    }
    public static void main(String []args){
        Scanner scanner = new Scanner (System.in);
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        int N = scanner.nextInt();
        int[] tree = new int[N*2];
        for (int i = 0; i < N*2; i = i+2){
            tree[i] = scanner.nextInt();
            tree[i+1] = scanner.nextInt();
        }
        int count=0;
        double area = Math.abs(x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2))/2;
        System.out.printf("%.1f\n",area);
        for (int i = 0; i < N*2; i = i+2){
            if (isInside(tree[i],tree[i+1],x1,y1,x2,y2,x3,y3)) count++;
        }
        System.out.println(count);

    }
}
