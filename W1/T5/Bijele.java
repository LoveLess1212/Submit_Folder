/**
 * Created by Phi Dinh Van Toan on 24.10.2022
 */
import java.util.Scanner;

public class Bijele {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int king = scanner.nextInt();
        int queen = scanner.nextInt();
        int rook = scanner.nextInt();
        int bishop = scanner.nextInt();
        int knight = scanner.nextInt();
        int pawn = scanner.nextInt();
        System.out.println((1-king) + " " + (1 - queen) + " " + (2 - rook ) + " " + (2- bishop) + " " + (2- knight) + " " + (8-pawn)  );
    }
}
