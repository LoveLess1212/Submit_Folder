/**
 * Created by Phi Dinh Van Toan on 24.10.2022
 */
import java.util.Scanner;
public class Ladder {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        double sinAngle = Math.sin(Math.toRadians(scanner.nextInt()));
        int minLength = (int) Math.ceil((double)h/ sinAngle);
        System.out.println(minLength);
    }
}
