/**
 * Created by Phi Dinh Van Toan on 24.10.2022
 */

import java.util.Scanner;


public class Quadrant {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if(x > 0 && y > 0) System.out.println(1);
        if(x > 0 && y < 0) System.out.println(4);
        if(x < 0 && y > 0) System.out.println(2);
        if(x < 0 && y < 0) System.out.println(3);
    }
}

