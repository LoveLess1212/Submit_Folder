package week1;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Random Lotto :");
	 	for (int i = 0; i < 6; i++) {
			
			System.out.println(getnumber(1, 49));
			
		} 

	}
	
	public static int getnumber(int min, int max) {
		
		 int ran = (int) (Math.random() * (max-min) + min);
		 return ran;
	}

}
