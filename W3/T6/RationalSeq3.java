import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Scanner;

public class RationalSeq3 {
    public static void ratSeq3(int label, int cases){
        int b = 1;
        int a = 1;
        if (label ==1) {
            System.out.printf("%d %d/%d\n",cases,a,b);
            return;
        }
        int level = (int)(Math.log(label)/Math.log(2));
        int numLeft = label - ((int)Math.pow(2,level));
        String seq = Integer.toBinaryString(numLeft);
        String[] data = seq.split("");
        int lenData= data.length;

        for (int i = 0; i <level -  lenData; i++) {
             b = a+b;
        }
        for (int i = 0; i < lenData; i++) {
            if (Objects.equals(data[i],"1")){
                a = a+b;
            }
            else b =a+b;
        }
        System.out.printf("%d %d/%d\n",cases,a,b);
        return;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short numCases = scanner.nextShort();
        for (int i = 0; i < numCases; i++) {
            int cases = scanner.nextInt();
            int label = scanner.nextInt();
            ratSeq3(label,cases);
        }
    }
}