import java.util.Scanner;

public class TaskJ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int price = a * 100 + b;
        int paid = c * 100 + d;
        int change = paid - price;

        System.out.println((change / 100) + " " + (change % 100));

        scanner.close();
    }
}
