import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        System.out.println("Последовательно введите 3 разных числа");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int m = (x + y + z) / 3;
        //System.out.println("Это среднее арифметическое введённых вами чисел = " + ((x + y + z) / 3));
        System.out.println("Это среднее арифметическое введённых вами чисел = " + m);
        if (m / 2 > 3) {
            System.out.println("Программа выполнена корректно");
        }

    }
}
