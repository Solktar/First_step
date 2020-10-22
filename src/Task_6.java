import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        System.out.println("Последовательно введите 3 разных числа");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        double y = sc.nextInt();
        double z = sc.nextInt();
        double sred = (x + y + z) / 3;
        System.out.println("Это среднее арифметическое введённых вами чисел = " + sred);
        int m = (int) (sred / 2);
        if (m > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
