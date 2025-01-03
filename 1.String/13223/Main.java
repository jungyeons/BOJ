import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String time1 = scanner.nextLine();
        String time2 = scanner.nextLine();

        String[] amountTime1 = time1.split(":");
        String[] amountTime2 = time2.split(":");

        int realtime1 = Integer.valueOf(amountTime1[0]) * 3600
                      + Integer.valueOf(amountTime1[1]) * 60
                      + Integer.valueOf(amountTime1[2]);

        int realtime2 = Integer.valueOf(amountTime2[0]) * 3600
                      + Integer.valueOf(amountTime2[1]) * 60
                      + Integer.valueOf(amountTime2[2]);

        if (realtime2 <= realtime1) {
            realtime2 += 24 * 3600;
        }

        int minusTime = realtime2 - realtime1;

        int hour = minusTime / 3600;
        int min = (minusTime % 3600) / 60;
        int second = minusTime % 60;

        System.out.printf("%02d:%02d:%02d\n", hour, min, second);
    }
}
