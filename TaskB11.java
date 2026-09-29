import java.util.Scanner;

public class TaskB11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();

        String[] hundreds = {"", "C"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        StringBuilder result = new StringBuilder();

        result.append(hundreds[X / 100]);
        result.append(tens[(X % 100) / 10]);
        result.append(ones[X % 10]);

        System.out.println(result);
        scanner.close();
    }
}
