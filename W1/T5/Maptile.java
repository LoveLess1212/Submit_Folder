import java.util.Scanner;

public class Maptile {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        byte len = (byte)input.length();
        System.out.print(len);
//        char[] data = new char[len];
//        data = input.toCharArray();
        int x =0;
        int y =0;
        for (int i =0 ; i < len; i++){
            byte check =(byte)Character.getNumericValue(input.charAt(i));


            if (check == 1) x = (int)(x + Math.pow(2,len-(i+1))) ;

            if (check == 2) y = (int)(y + Math.pow(2,len-(i+1))) ;

            if (check == 3) {
                x = (int)(x + Math.pow(2,len-(i+1))) ;
                y = (int)(y + Math.pow(2,len-(i+1))) ;
            }
        }
        System.out.printf(" %d %d\n",x,y);
    }
}
