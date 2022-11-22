package week1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // command-line arguments
		int a, b, n;
		System.out.println("RandomSeqAB :");
		Scanner scan = new Scanner(System.in);
		 a = scan.nextInt();
		 b = scan.nextInt();
		 n = scan.nextInt();
		 
		 for (int i = 0; i < n; i++) {
			
			 System.out.println(RandomABN(a, b, n) );
		 
	 }		
		
}
	
public static int RandomABN(int min, int max, int num) {
			
		int RanAB = (int)Math.floor(Math.random()*(max-min+1)+min);
		return RanAB;
	}


}

