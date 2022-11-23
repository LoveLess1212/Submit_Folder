import java.util.Scanner;
public class HeartMon {

        static boolean check(String a){
            try {
                float num = Float.parseFloat(a);
                return true;
            }catch(NumberFormatException e){
                return false;
            }
        }
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String data = scanner.nextLine();
            String[] rawData = data.split(" ");
            StringBuilder name = new StringBuilder("");
            short len = (short) rawData.length;
            double heartRate = 0;
            short count =0;
            for (int i = 0; i < len ; i++) {
                if(check(rawData[i])){
                    heartRate += Float.parseFloat(rawData[i]);
                    count++;

                }
                else name.append(" ").append(rawData[i]);
            }
            System.out.printf("%.6f" + name.toString() + "\n",(heartRate/(double)count) );
        }

    }
}
