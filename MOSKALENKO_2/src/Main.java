import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Введите число " + i + ": ");
            int number = scanner.nextInt();

            if (number > max) {
                max = number;
            }
        }
        System.out.println("Наибольшее число: " + max);
        scanner.close();
    }
}
