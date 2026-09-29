import java.util.Scanner;

public class TaskW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int tickets60 = n / 60;
        int remainder = n % 60;

        if (remainder >= 35) {
            tickets60++;
            remainder = 0;
        }

        int tickets10 = remainder / 10;
        int tickets1 = remainder % 10;

        if (tickets1 >= 9) {
            tickets10++;
            tickets1 = 0;
        }

        System.out.println(tickets1 + " " + tickets10 + " " + tickets60);

        scanner.close();
    }
}
