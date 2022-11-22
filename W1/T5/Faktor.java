import java.util.Scanner;

/**
 * Created by Phi Dinh Van Toan on 24.10.2022
 */
public class Faktor {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int numArticle = scanner.nextInt(); //number of article
        int impactFactor = scanner.nextInt(); // impact factor that the author want
        /*
        *
        * c (point) =  b (total scientist = total citation) / a (number of article)
        * -> total scientist = c*a
        * because we always scale up the point c
        * so we have to find the minimal number that / a >(c*(a-1))
        * number of scientist is always a natural number -> (c*(a-1)) +1
        *  */
        System.out.println(((impactFactor-1) * numArticle) + 1);

    }
}
