
import java.util.Scanner;
public class RationalSeqVip {
    //    static class point{
//        private final int x;
//        private final int y;
//        public point(int x, int y){
//            this.x =x;
//            this.y =y;
//        }
//
//        public int getX() {
//            return x;
//        }
//
//        public int getY() {
//            return y;
//        }
//        public String print(){
//            return getX()+ "/" + getY();
//        }
//    }
    static int check(int a, int b){
        short count=0;
        if ( b== 1) return a+1;
        if(a < b){
            b = b-a;
        }
        else if(a > b){
            int level = a/b;
            b = (2*level +1)*b-a;
        }
        return b;
    }
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        short numCases = scanner.nextShort();
        for (int i = 0; i < numCases; i++) {
            scanner.nextInt();
            String[] token = scanner.next().split("/");
            int p = Integer.parseInt(token[0]);
            int q = Integer.parseInt(token[1]);
//            if(q == 1){
//                System.out.printf("%d %d/%d\n",i, q,p+1);
//            } else {
//                int temp = check(p,q);
//                System.out.printf("%d %d/%d\n",i,q,temp);
//            }
            int temp = check(p,q);
            System.out.printf("%d %d/%d\n",i+1,q,temp);
        }

    }
}
