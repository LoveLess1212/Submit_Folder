import java.util.Scanner;

public class LeftBehind {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        while (true){
            short x = scanner.nextShort();
            short y = scanner.nextShort();
            if( x== 0 && y==0 )
                break;
            else if (x + y == 13) System.out.println("Never speak again.");
            else if(x >y) System.out.println("To the convention.");
            else if(x<y) System.out.println("Left beehind.");
            else if(x==y) System.out.println("Undecided.");
        }

    }
}
