import java.util.Scanner;

public class TaskD11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int systemAnswer = scanner.nextInt();
        int studentAnswer = scanner.nextInt();

        if (systemAnswer == 1 && studentAnswer == 1) {
            System.out.println("YES");
        } else if (systemAnswer != 1 && studentAnswer != 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
