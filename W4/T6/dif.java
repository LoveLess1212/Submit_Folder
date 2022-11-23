
import java.util.*;

public class dif {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        short numCase = scanner.nextShort();
        for (int j = 0; j < numCase; j++) {
            Stack<Character> data1 = new Stack<>();
            String str1 = scanner.next();
            str1.chars().forEach(c -> data1.push((char)c));
            Stack<Character> data2 = new Stack<>();
            String str2 = scanner.next();
            str2.chars().forEach(c -> data2.push((char)c));
            Stack<Character> ans = new Stack<>();
            int len = str1.length();
            Queue<Character> ans1 = new LinkedList<>();
            for (int i = 0; i < len; i++) {
                if(Objects.equals(data1.pop(),data2.pop())) ans.push('.');
                else ans.push('*');
            }
            System.out.println(str1);
            System.out.println(str2);
            for (int i = len-1; i >= 0; i--) {
                System.out.print(ans.pop());
            }
            System.out.print("\n\n");
        }
    }
}
