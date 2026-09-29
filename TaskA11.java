import java.util.Scanner;

public class TaskA11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        boolean hasEven = (A % 2 == 0) || (B % 2 == 0) || (C % 2 == 0);
        boolean hasOdd = (A % 2 != 0) || (B % 2 != 0) || (C % 2 != 0);

        if (hasEven && hasOdd) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
