import java.util.Scanner;

public class TaskY1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 1) {
            System.out.println((x - 1) + " " + y);
        }

        if (x < M) {
            System.out.println((x + 1) + " " + y);
        }

        if (y > 1) {
            System.out.println(x + " " + (y - 1));
        }

        if (y < N) {
            System.out.println(x + " " + (y + 1));
        }

        scanner.close();
    }
}
