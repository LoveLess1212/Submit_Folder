import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Everywhere {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        short P = scanner.nextShort();


        List<String> list = new ArrayList<>();
        for (int i = 0; i < P; i++) {
            short count =0;
            short N = scanner.nextShort();
            for (int j = 0; j < N; j++) {
                String temp = scanner.next();
                if(!list.contains(temp)){
                    list.add(temp);
                    count ++;
                }
            }
            System.out.println(count);
        }

    }
    }
