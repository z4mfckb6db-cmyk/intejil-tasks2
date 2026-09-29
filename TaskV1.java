import java.util.Scanner;

public class TaskV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String word;

        if (n % 100 >= 11 && n % 100 <= 14) {
            word = "korov";
        } else {
            int lastDigit = n % 10;
            if (lastDigit == 1) {
                word = "korova";
            } else if (lastDigit >= 2 && lastDigit <= 4) {
                word = "korovy";
            } else {
                word = "korov";
            }
        }

        System.out.println(n + " " + word);
        scanner.close();
    }
}
