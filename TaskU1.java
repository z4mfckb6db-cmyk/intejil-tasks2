import java.util.Scanner;
import java.util.Arrays;

public class TaskU1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sides = new int[3];
        sides[0] = scanner.nextInt();
        sides[1] = scanner.nextInt();
        sides[2] = scanner.nextInt();

        Arrays.sort(sides);
        int a = sides[0];
        int b = sides[1];
        int c = sides[2];

        if (a + b <= c) {
            System.out.println("impossible");
        } else {
            long a2 = (long) a * a;
            long b2 = (long) b * b;
            long c2 = (long) c * c;

            if (a2 + b2 == c2) {
                System.out.println("right");
            } else if (a2 + b2 > c2) {
                System.out.println("acute");
            } else {
                System.out.println("obtuse");
            }
        }

        scanner.close();
    }
}
