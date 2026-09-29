import java.util.Scanner;

public class TaskZ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        String word;

        if (N % 100 >= 11 && N % 100 <= 14) {
            word = "bochek";
        } else {
            int lastDigit = N % 10;
            if (lastDigit == 1) {
                word = "bochka";
            } else if (lastDigit >= 2 && lastDigit <= 4) {
                word = "bochki";
            } else {
                word = "bochek";
            }
        }

        System.out.println(N + " " + word);
        scanner.close();
    }
}
