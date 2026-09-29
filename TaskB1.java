import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x1 = s.nextInt(), y1 = s.nextInt();
        int x2 = s.nextInt(), y2 = s.nextInt();
        System.out.println((x1 == x2 || y1 == y2) ? "YES" : "NO");
    }
}
