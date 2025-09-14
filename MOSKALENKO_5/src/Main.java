public class Main {
    int w;
    int h;
    int d;
    int volume() {
        return w * h * d;
    }
    int surface() {
        return 2 * (w * h + w * d + h * d);
    }
    public static void main(String[] args) {
        Main b = new Main();
        b.w = 2;
        b.h = 3;
        b.d = 4;

        System.out.println("Объем: " + b.volume());
        System.out.println("Площадь поверхности: " + b.surface());
    }
}
