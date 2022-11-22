/**
 * Created by Phi Dinh Van Toan on 24.10.2022
 */


import java.util.Scanner;

public class TimeLoop {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        for(int i = 0; i < count; i++){
            System.out.println((i+1) + " Abracadabra");
        }
    }
}
