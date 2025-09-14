import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int h = a.nextInt();
        System.out.print("Введите число 2: ");
        int b = a.nextInt();
        System.out.print("Введите число 3: ");
        int c = a.nextInt();
        System.out.print("Введите число 4: ");
        int d = a.nextInt();
        System.out.print("Введите число 5: ");
        int e = a.nextInt();
        int max = h;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;
        if (e > max) max = e;
        System.out.println("Наибольшее число: " + max);
    }
}
