package week1;

import java.util.Random;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Random rand = new Random(); //instance of random class
	      int upperbound = 100;
	        //generate random values from 0-24
	      int int_random = rand.nextInt(upperbound); 
	      System.out.println("Random integer value from 0 to " + (upperbound-1) + " : "+ int_random);
	}

}
