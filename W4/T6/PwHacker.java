import java.util.Arrays;
import java.util.Scanner;
public class PwHacker {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        short size = scanner.nextShort();
        float totalTry = 0;
       Float[] list = new Float[size];
        for (int i = 0; i < size; i++) {
            scanner.next();
            list[i] =( Float.parseFloat(scanner.next()));
        }
        Arrays.sort(list);
        for (int i = size-1; i >= 0; i--) {
            totalTry += (size - i) *list[i];
        }
        System.out.printf("%.4f",totalTry);
    }
}
