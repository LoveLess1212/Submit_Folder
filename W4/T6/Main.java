import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
                String month = scanner.next();
                String day = scanner.next();
                String year = scanner.next();
                String[] timeStart = scanner.next().split(":");
                String[] timeEnd = scanner.next().split(":");
                byte[] time = new byte[4];
                time[0] = Byte.parseByte(timeStart[0]);
                time[1] = Byte.parseByte(timeStart[1]);
                time[2] = Byte.parseByte(timeEnd[0]);
                time[3] = Byte.parseByte(timeEnd[1]);
                if(time[3] - time[1] < 0){
                    System.out.print(month +" "+ day + " "+ year +" "+
                            (time[2] - time[0] -1) +" hours "+
                            (60 + (time[3] -time[1])) + " minutes\n"
                    );
                }
                else System.out.print(month +" "+ day + " "+ year +" "+
                        (time[2] -time[0]) +" hours "+
                        (time[3] - time[1]) + " minutes\n"
                        );
            if(!scanner.hasNext()) break;
        }
    }
}