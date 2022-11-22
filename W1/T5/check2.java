import java.util.Scanner;

    public class check2 {

        public static void main(String[] args) {
            // TODO Auto-generated method stub

            //System.out.println(Math.PI);
            String b = "1,0 1,0 2,0 2,0 2,0\n" +
                    "1,0 1,0 2,0 2,0 1,0\n" +
                    "1,0 1,0 20,0 20,0 10,0\n" +
                    "0";
            Scanner scan = new Scanner(b);
            double a = scan.nextDouble();
            System.out.println(a);


            double[] arr = new double[5000];
            for (int i = 0; i < 5000; i = i +5) {
                arr[i] = scan.nextDouble();
                if (arr[i] == 0) break;
                arr[i+1] = scan.nextDouble();
                arr[i+2] = scan.nextDouble();
                arr[i+3] = scan.nextDouble();
                arr[i+4] = scan.nextDouble();
                double r1 = Math.pow((double)Math.abs(arr[i] - arr[i+2]), (double)(i+4));
                double r2 = Math.pow(Math.abs(arr[i+1] - arr[i +3]), (double)(i+4));
                double result = Math.pow(r1 + r2 , ((double)1/(i+4)));

                System.out.printf("%.10f\n", result);
            }
            //scan.close();
            //	if (x1 == 0) {

//			System.exit(0);
            //}

		/*double r1 = (Math.abs(x1 - x2));
		double r2 = (Math.abs(y1 - y2));
		double r3 = (((Math.pow(r1, p)) + (Math.pow(r2, p))));
		double result = Math.pow(r3, 1/p); */




            //System.out.println(Math.round(result));
            //1,0 1,0 2,0 2,0 1,0

        }

    }
