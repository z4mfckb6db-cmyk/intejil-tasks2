import java.util.Scanner;

public class TaskI1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("INF");
        } else if (a == 0 && b != 0) {
            System.out.println("NO");
        } else {
            if ((-b) % a == 0) {
                int x = (-b) / a;
                if (c * x + d != 0) {
                    System.out.println(x);
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
