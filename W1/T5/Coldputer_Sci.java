/**
 * Created by Phi Dinh Van Toan on 24.10.2022
 */

import java.util.Scanner;

public class Coldputer_Sci {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int n;
        int bellowZero = 0;
        n = scanner.nextInt();
        for (int i = 0; i < n ; i++){
            if(scanner.nextInt() < 0 ){
                bellowZero++;
            }
        }
        System.out.println(bellowZero);
    }
}
