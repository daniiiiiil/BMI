import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Рост в метрах:");
        double h = scan.nextDouble();
        System.out.println("Вес в кг:");
        double m = scan.nextDouble();
        double hh = h * h;
        double numbers = m / hh;
        String result = String.format("%.1f",numbers);
        System.out.format("Итог: " + result);
    }
}