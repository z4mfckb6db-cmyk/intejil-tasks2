import java.util.Scanner;

public class TaskX1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int tickets60 = 0, tickets20 = 0, tickets10 = 0, tickets5 = 0, tickets1 = 0;

        tickets60 = n / 60;
        int remainder = n % 60;

        if (remainder >= 36) {
            tickets60++;
            remainder = 0;
        }

        tickets20 = remainder / 20;
        remainder %= 20;

        if (remainder >= 18) {
            tickets20++;
            remainder = 0;
        }

        tickets10 = remainder / 10;
        remainder %= 10;

        if (remainder >= 9) {
            tickets10++;
            remainder = 0;
        }

        tickets5 = remainder / 5;
        remainder %= 5;

        tickets1 = remainder;

        System.out.println(tickets1 + " " + tickets5 + " " + tickets10 + " " + tickets20 + " " + tickets60);
        scanner.close();
    }
}
