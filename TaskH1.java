import java.util.Scanner;

public class TaskH1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == 0) {
            if (b == 0) {
                System.out.println("INF");
            } else {
                System.out.println("NO");
            }
        } else {
            if ((-b) % a == 0) {
                int x = (-b) / a;
                System.out.println(x);
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
