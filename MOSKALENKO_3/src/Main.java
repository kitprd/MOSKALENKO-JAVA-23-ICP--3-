import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[10];
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(21);
        }
        System.out.print("Исходный массив: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int maxIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Максимальный элемент: " + a[maxIndex] +
                " (индекс " + maxIndex + ")");
        a[maxIndex] = 0;
        System.out.print("Изменённый массив: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
