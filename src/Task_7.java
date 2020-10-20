import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner sc = new Scanner(System.in);
        int x, y, z, number;
        x = 1;
        y = 2;
        z = 44;
        number = sc.nextInt();
        if (number == x || number == y || number == z) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Такой константы нет!");
        }

    }

}
